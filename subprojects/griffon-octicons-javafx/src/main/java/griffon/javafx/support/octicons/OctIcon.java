/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.javafx.support.octicons;

import griffon.core.editors.PropertyEditorResolver;
import griffon.plugins.octicons.OctIconFont;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javax.annotation.Nonnull;
import java.beans.PropertyEditor;

import static griffon.plugins.octicons.OctIconFont.invalidDescription;
import static griffon.util.GriffonClassUtils.requireState;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class OctIcon extends Text {
    private static final String OCTICON_SET = "META-INF/resources/octicons/2.4.1/fonts/octicons.ttf";
    private static final String ERROR_OCTICON_NULL = "Argument 'octIcon' must not be null";

    private static final String OCTICON_FONT_FAMILY;

    static {
        Font font = Font.loadFont(Thread.currentThread().getContextClassLoader().getResource(OCTICON_SET).toExternalForm(), 16);
        OCTICON_FONT_FAMILY = font.getFamily();
    }

    private ObjectProperty<OctIconFont> octIcon;
    private IntegerProperty iconSize;
    private ObjectProperty<Paint> iconColor;

    private ChangeListener<Number> iconSizeChangeListener = new ChangeListener<Number>() {
        @Override
        public void changed(ObservableValue<? extends Number> v, Number o, Number n) {
            setStyle(getStyle() + " -fx-font-size: " + n + "px;");
        }
    };

    private ChangeListener<Paint> iconColorChangeListener = new ChangeListener<Paint>() {
        @Override
        public void changed(ObservableValue<? extends Paint> v, Paint o, Paint n) {
            setFill(n);
        }
    };

    public OctIcon() {
        this(OctIconFont.ZAP);
    }

    public OctIcon(@Nonnull OctIconFont octIcon) {
        setOctIconFont(requireNonNull(octIcon, ERROR_OCTICON_NULL));
        getStyleClass().add("octicons-icon");
        setText(String.valueOf(octIcon.getCode()));
        setStyle("-fx-font-family: '" + OCTICON_FONT_FAMILY + "';");
        setIconSize(16);
        setIconColor(Color.BLACK);
    }

    public OctIcon(@Nonnull String description) {
        this(OctIconFont.findByDescription(description));
        resolveSize(description);
        resolvePaint(description);
    }

    public ObjectProperty<OctIconFont> octIconProperty() {
        if (octIcon == null) {
            octIcon = new SimpleObjectProperty<>(this, "octIcon", null);
        }
        return octIcon;
    }

    public ObjectProperty<OctIconFont> getOctIconProperty() {
        return octIconProperty();
    }

    public IntegerProperty iconSizeProperty() {
        if (iconSize == null) {
            iconSize = new SimpleIntegerProperty(this, "iconSize", 16);
            iconSize.addListener(iconSizeChangeListener);
        }
        return iconSize;
    }

    public IntegerProperty getIconSizeProperty() {
        return iconSizeProperty();
    }

    public ObjectProperty<Paint> iconColorProperty() {
        if (iconColor == null) {
            iconColor = new SimpleObjectProperty<>(this, "iconColor", null);
            iconColor.addListener(iconColorChangeListener);
        }
        return iconColor;
    }

    public ObjectProperty<Paint> getIconColorProperty() {
        return iconColorProperty();
    }

    @Nonnull
    public OctIconFont getOctIconFont() {
        return octIconProperty().get();
    }

    public void setOctIconFont(@Nonnull OctIconFont octIcon) {
        octIconProperty().set(requireNonNull(octIcon, ERROR_OCTICON_NULL));
        setText(String.valueOf(octIcon.getCode()));
    }

    public void setOctIconFont(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        octIconProperty().set(OctIconFont.findByDescription(description));
        resolveSize(description);
        resolvePaint(description);
    }

    public void setIconSize(int size) {
        requireState(size > 0, "Argument 'size' must be greater than zero.");
        iconSizeProperty().set(size);
    }

    public int getIconSize() {
        return iconSizeProperty().get();
    }

    public void setIconColor(@Nonnull Paint color) {
        requireNonNull(color, "Argument 'color' must not be null");
        iconColorProperty().set(color);
    }

    @Nonnull
    public Paint getIconColor() {
        return iconColorProperty().get();
    }

    private void resolveSize(String description) {
        String[] parts = description.split(":");
        if (parts.length > 1) {
            try {
                setIconSize(Integer.parseInt(parts[1]));
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else {
            setIconSize(16);
        }
    }

    private void resolvePaint(String description) {
        String[] parts = description.split(":");
        if (parts.length > 2) {
            PropertyEditor editor = PropertyEditorResolver.findEditor(Paint.class);
            editor.setValue(parts[2]);
            Paint paint = (Paint) editor.getValue();
            if (paint != null) {
                setIconColor(paint);
            }
        }
    }
}
