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
package griffon.plugins.octicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum OctIconFont {
    ALERT("alert", '\uf02d'),
    ALIGNMENT_ALIGN("alignment-align", '\uf08a'),
    ALIGNMENT_ALIGNED_TO("alignment-aligned-to", '\uf08e'),
    ALIGNMENT_UNALIGN("alignment-unalign", '\uf08b'),
    ARROW_DOWN("arrow-down", '\uf03f'),
    ARROW_LEFT("arrow-left", '\uf040'),
    ARROW_RIGHT("arrow-right", '\uf03e'),
    ARROW_SMALL_DOWN("arrow-small-down", '\uf0a0'),
    ARROW_SMALL_LEFT("arrow-small-left", '\uf0a1'),
    ARROW_SMALL_RIGHT("arrow-small-right", '\uf071'),
    ARROW_SMALL_UP("arrow-small-up", '\uf09f'),
    ARROW_UP("arrow-up", '\uf03d'),
    BEER("beer", '\uf069'),
    BOOK("book", '\uf007'),
    BOOKMARK("bookmark", '\uf07b'),
    BRIEFCASE("briefcase", '\uf0d3'),
    BROADCAST("broadcast", '\uf048'),
    BROWSER("browser", '\uf0c5'),
    BUG("bug", '\uf091'),
    CALENDAR("calendar", '\uf068'),
    CHECK("check", '\uf03a'),
    CHECKLIST("checklist", '\uf076'),
    CHEVRON_DOWN("chevron-down", '\uf0a3'),
    CHEVRON_LEFT("chevron-left", '\uf0a4'),
    CHEVRON_RIGHT("chevron-right", '\uf078'),
    CHEVRON_UP("chevron-up", '\uf0a2'),
    CIRCLE_SLASH("circle-slash", '\uf084'),
    CIRCUIT_BOARD("circuit-board", '\uf0d6'),
    CLIPPY("clippy", '\uf035'),
    CLOCK("clock", '\uf046'),
    CLOUD_DOWNLOAD("cloud-download", '\uf00b'),
    CLOUD_UPLOAD("cloud-upload", '\uf00c'),
    CODE("code", '\uf05f'),
    COLOR_MODE("color-mode", '\uf065'),
    COMMENT("comment", '\uf02b'),
    COMMENT_ADD("comment-add", '\uf02b'),
    COMMENT_DISCUSSION("comment-discussion", '\uf04f'),
    CREDIT_CARD("credit-card", '\uf045'),
    DASH("dash", '\uf0ca'),
    DASHBOARD("dashboard", '\uf07d'),
    DATABASE("database", '\uf096'),
    DEVICE_CAMERA("device-camera", '\uf056'),
    DEVICE_CAMERA_VIDEO("device-camera-video", '\uf057'),
    DEVICE_DESKTOP("device-desktop", '\uf27c'),
    DEVICE_MOBILE("device-mobile", '\uf038'),
    DIFF("diff", '\uf04d'),
    DIFF_ADDED("diff-added", '\uf06b'),
    DIFF_IGNORED("diff-ignored", '\uf099'),
    DIFF_MODIFIED("diff-modified", '\uf06d'),
    DIFF_REMOVED("diff-removed", '\uf06c'),
    DIFF_RENAMED("diff-renamed", '\uf06e'),
    ELLIPSIS("ellipsis", '\uf09a'),
    EYE("eye", '\uf04e'),
    EYE_UNWATCH("eye-unwatch", '\uf04e'),
    EYE_WATCH("eye-watch", '\uf04e'),
    FILE_ADD("file-add", '\uf05d'),
    FILE_BINARY("file-binary", '\uf094'),
    FILE_CODE("file-code", '\uf010'),
    FILE_DIRECTORY("file-directory", '\uf016'),
    FILE_DIRECTORY_CREATE("file-directory-create", '\uf05d'),
    FILE_MEDIA("file-media", '\uf012'),
    FILE_PDF("file-pdf", '\uf014'),
    FILE_SUBMODULE("file-submodule", '\uf017'),
    FILE_SYMLINK_DIRECTORY("file-symlink-directory", '\uf0b1'),
    FILE_SYMLINK_FILE("file-symlink-file", '\uf0b0'),
    FILE_TEXT("file-text", '\uf011'),
    FILE_ZIP("file-zip", '\uf013'),
    FLAME("flame", '\uf0d2'),
    FOLD("fold", '\uf0cc'),
    GEAR("gear", '\uf02f'),
    GIFT("gift", '\uf042'),
    GIST("gist", '\uf00e'),
    GIST_FORK("gist-fork", '\uf002'),
    GIST_NEW("gist-new", '\uf05d'),
    GIST_PRIVATE("gist-private", '\uf06a'),
    GIST_SECRET("gist-secret", '\uf08c'),
    GIT_BRANCH("git-branch", '\uf020'),
    GIT_BRANCH_CREATE("git-branch-create", '\uf020'),
    GIT_BRANCH_DELETE("git-branch-delete", '\uf020'),
    GIT_COMMIT("git-commit", '\uf01f'),
    GIT_COMPARE("git-compare", '\uf0ac'),
    GIT_FORK_PRIVATE("git-fork-private", '\uf06a'),
    GIT_MERGE("git-merge", '\uf023'),
    GIT_PULL_REQUEST_ABANDONED("git-pull-request-abandoned", '\uf009'),
    GIT_PULL_REQUEST("git-pull-request", '\uf009'),
    GLOBE("globe", '\uf0b6'),
    GRAPH("graph", '\uf043'),
    HEART("heart", '\u2665'),
    HISTORY("history", '\uf07e'),
    HOME("home", '\uf08d'),
    HORIZONTAL_RULE("horizontal-rule", '\uf070'),
    HOURGLASS("hourglass", '\uf09e'),
    HUBOT("hubot", '\uf09d'),
    INBOX("inbox", '\uf0cf'),
    INFO("info", '\uf059'),
    ISSUE_CLOSED("issue-closed", '\uf028'),
    ISSUE_OPENED("issue-opened", '\uf026'),
    ISSUE_REOPENED("issue-reopened", '\uf027'),
    JERSEY("jersey", '\uf019'),
    JUMP_DOWN("jump-down", '\uf072'),
    JUMP_LEFT("jump-left", '\uf0a5'),
    JUMP_RIGHT("jump-right", '\uf0a6'),
    JUMP_UP("jump-up", '\uf073'),
    KEY("key", '\uf049'),
    KEYBOARD("keyboard", '\uf00d'),
    LAW("law", '\uf0d8'),
    LIGHT_BULB("light-bulb", '\uf000'),
    LINK("link", '\uf05c'),
    LINK_EXTERNAL("link-external", '\uf07f'),
    LIST_ORDERED("list-ordered", '\uf062'),
    LIST_UNORDERED("list-unordered", '\uf061'),
    LOCATION("location", '\uf060'),
    LOCK("lock", '\uf06a'),
    LOGO_GITHUB("logo-github", '\uf092'),
    LOG_IN("log-in", '\uf036'),
    LOG_OUT("log-out", '\uf032'),
    MAIL("mail", '\uf03b'),
    MAIL_READ("mail-read", '\uf03c'),
    MAIL_REPLY("mail-reply", '\uf051'),
    MARKDOWN("markdown", '\uf0c9'),
    MARK_GITHUB("mark-github", '\uf00a'),
    MEGAPHONE("megaphone", '\uf077'),
    MENTION("mention", '\uf0be'),
    MICROSCOPE("microscope", '\uf089'),
    MILESTONE("milestone", '\uf075'),
    MIRROR("mirror", '\uf024'),
    MIRROR_PRIVATE("mirror-private", '\uf06a'),
    MIRROR_PUBLIC("mirror-public", '\uf024'),
    MORTAR_BOARD("mortar-board", '\uf0d7'),
    MOVE_DOWN("move-down", '\uf0a8'),
    MOVE_LEFT("move-left", '\uf074'),
    MOVE_RIGHT("move-right", '\uf0a9'),
    MOVE_UP("move-up", '\uf0a7'),
    MUTE("mute", '\uf080'),
    NO_NEWLINE("no-newline", '\uf09c'),
    OCTOFACE("octoface", '\uf008'),
    ORGANIZATION("organization", '\uf037'),
    PACKAGE("package", '\uf0c4'),
    PAINTCAN("paintcan", '\uf0d1'),
    PENCIL("pencil", '\uf058'),
    PERSON("person", '\uf018'),
    PERSON_ADD("person-add", '\uf018'),
    PERSON_FOLLOW("person-follow", '\uf018'),
    PIN("pin", '\uf041'),
    PLAYBACK_FAST_FORWARD("playback-fast-forward", '\uf0bd'),
    PLAYBACK_PAUSE("playback-pause", '\uf0bb'),
    PLAYBACK_PLAY("playback-play", '\uf0bf'),
    PLAYBACK_REWIND("playback-rewind", '\uf0bc'),
    PLUG("plug", '\uf0d4'),
    PLUS("plus", '\uf05d'),
    PODIUM("podium", '\uf0af'),
    PRIMITIVE_DOT("primitive-dot", '\uf052'),
    PRIMITIVE_SQUARE("primitive-square", '\uf053'),
    PULSE("pulse", '\uf085'),
    PUZZLE("puzzle", '\uf0c0'),
    QUESTION("question", '\uf02c'),
    QUOTE("quote", '\uf063'),
    RADIO_TOWER("radio-tower", '\uf030'),
    REMOVE_CLOSE("remove-close", '\uf081'),
    REPO("repo", '\uf001'),
    REPO_CLONE("repo-clone", '\uf04c'),
    REPO_CREATE("repo-create", '\uf05d'),
    REPO_DELETE("repo-delete", '\uf001'),
    REPO_FORCE_PUSH("repo-force-push", '\uf04a'),
    REPO_FORKED("repo-forked", '\uf002'),
    REPO_PULL("repo-pull", '\uf006'),
    REPO_PUSH("repo-push", '\uf005'),
    REPO_SYNC("repo-sync", '\uf087'),
    ROCKET("rocket", '\uf033'),
    RSS("rss", '\uf034'),
    RUBY("ruby", '\uf047'),
    SCREEN_FULL("screen-full", '\uf066'),
    SCREEN_NORMAL("screen-normal", '\uf067'),
    SEARCH("search", '\uf02e'),
    SEARCH_SAVE("search-save", '\uf02e'),
    SERVER("server", '\uf097'),
    SETTINGS("settings", '\uf07c'),
    SIGN_IN("sign-in", '\uf036'),
    SIGN_OUT("sign-out", '\uf032'),
    SPLIT("split", '\uf0c6'),
    SQUIRREL("squirrel", '\uf0b2'),
    STAR("star", '\uf02a'),
    STAR_ADD("star-add", '\uf02a'),
    STAR_DELETE("star-delete", '\uf02a'),
    STEPS("steps", '\uf0c7'),
    STOP("stop", '\uf08f'),
    SYNC("sync", '\uf087'),
    TAG("tag", '\uf015'),
    TAG_ADD("tag-add", '\uf015'),
    TAG_REMOVE("tag-remove", '\uf015'),
    TELESCOPE("telescope", '\uf088'),
    TERMINAL("terminal", '\uf0c8'),
    THREE_BARS("three-bars", '\uf05e'),
    THUMBSDOWN("thumbsdown", '\uf0db'),
    THUMBSUP("thumbsup", '\uf0da'),
    TOOLS("tools", '\uf031'),
    TRASHCAN("trashcan", '\uf0d0'),
    TRIANGLE_DOWN("triangle-down", '\uf05b'),
    TRIANGLE_LEFT("triangle-left", '\uf044'),
    TRIANGLE_RIGHT("triangle-right", '\uf05a'),
    TRIANGLE_UP("triangle-up", '\uf0aa'),
    UNFOLD("unfold", '\uf039'),
    UNMUTE("unmute", '\uf0ba'),
    VERSIONS("versions", '\uf064'),
    X("x", '\uf081'),
    ZAP("zap", '\u26A1');

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    public static OctIconFont findByDescription(@Nonnull String description) {
        requireNonBlank(description, "Icon description must not be blank.");

        String[] parts = description.split(":");
        for (OctIconFont font : values()) {
            if (font.getDescription().equals(parts[0])) {
                return font;
            }
        }

        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    OctIconFont(@Nonnull String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public char getCode() {
        return code;
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid OctIcon icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid OctIcon icon description", e);
    }
}