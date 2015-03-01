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
import javafx.scene.paint.Color;
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
    private static final String OCTICON_SET = "META-INF/resources/octicons/2.2.0/fonts/octicons.ttf";
    private static final String ERROR_FONT_OCTICON_NULL = "Argument 'octIcon' must not be null";

    private static final String OCTICON_FONT_FAMILY;

    static {
        Font font = Font.loadFont(Thread.currentThread().getContextClassLoader().getResource(OCTICON_SET).toExternalForm(), 16);
        OCTICON_FONT_FAMILY = font.getFamily();
    }

    private OctIconFont octIcon;
    private int iconSize;
    private Color iconColor;

    public OctIcon() {
        this(OctIconFont.ZAP);
    }

    public OctIcon(@Nonnull OctIconFont octIcon) {
        this.octIcon = requireNonNull(octIcon, ERROR_FONT_OCTICON_NULL);
        getStyleClass().add("octicons-icon");
        setText(String.valueOf(octIcon.getCode()));
        setStyle("-fx-font-family: '" + OCTICON_FONT_FAMILY + "';");
        setIconSize(16);
        setIconColor(Color.BLACK);
    }

    public OctIcon(@Nonnull String description) {
        this(OctIconFont.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    @Nonnull
    public OctIconFont getOctIconFont() {
        return octIcon;
    }

    public void setOctIcon(@Nonnull OctIconFont octIcon) {
        this.octIcon = requireNonNull(octIcon, ERROR_FONT_OCTICON_NULL);
        setText(String.valueOf(octIcon.getCode()));
    }

    public void setOctIcon(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        setOctIcon(OctIconFont.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    public void setIconSize(int size) {
        requireState(size > 0, "Argument 'size' must be greater than zero.");
        setStyle(getStyle() + " -fx-font-size: " + size + "px;");
        this.iconSize = size;
    }

    public int getIconSize() {
        return iconSize;
    }


    public void setIconColor(@Nonnull Color color) {
        requireNonNull(color, "Argument 'color' must not be null");
        setFill(color);
        this.iconColor = color;
    }

    @Nonnull
    public Color getIconColor() {
        return iconColor;
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

    private void resolveColor(String description) {
        String[] parts = description.split(":");
        if (parts.length > 2) {
            PropertyEditor editor = PropertyEditorResolver.findEditor(Color.class);
            editor.setValue(parts[2]);
            Color color = (Color) editor.getValue();
            if (color != null) {
                setIconColor(color);
            }
        }
    }
}
