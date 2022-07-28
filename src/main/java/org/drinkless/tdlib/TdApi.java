package org.drinkless.tdlib;

public class TdApi {
    public abstract static class Object {
        public native String toString();

        public abstract int getConstructor();
    }

    public abstract static class Function<R extends Object> extends Object {
        public native String toString();
    }

    public static class AccountTtl extends Object {
        public static final int CONSTRUCTOR = 1324495492;
        public int days;

        public AccountTtl() {
        }

        public AccountTtl(int days) {
            this.days = days;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddedReaction extends Object {
        public static final int CONSTRUCTOR = 454543036;
        public String reaction;
        public MessageSender senderId;

        public AddedReaction() {
        }

        public AddedReaction(String reaction, MessageSender senderId) {
            this.reaction = reaction;
            this.senderId = senderId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddedReactions extends Object {
        public static final int CONSTRUCTOR = 226352304;
        public int totalCount;
        public AddedReaction[] reactions;
        public String nextOffset;

        public AddedReactions() {
        }

        public AddedReactions(int totalCount, AddedReaction[] reactions, String nextOffset) {
            this.totalCount = totalCount;
            this.reactions = reactions;
            this.nextOffset = nextOffset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Address extends Object {
        public static final int CONSTRUCTOR = -2043654342;
        public String countryCode;
        public String state;
        public String city;
        public String streetLine1;
        public String streetLine2;
        public String postalCode;

        public Address() {
        }

        public Address(String countryCode, String state, String city, String streetLine1, String streetLine2, String postalCode) {
            this.countryCode = countryCode;
            this.state = state;
            this.city = city;
            this.streetLine1 = streetLine1;
            this.streetLine2 = streetLine2;
            this.postalCode = postalCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnimatedChatPhoto extends Object {
        public static final int CONSTRUCTOR = 191994926;
        public int length;
        public File file;
        public double mainFrameTimestamp;

        public AnimatedChatPhoto() {
        }

        public AnimatedChatPhoto(int length, File file, double mainFrameTimestamp) {
            this.length = length;
            this.file = file;
            this.mainFrameTimestamp = mainFrameTimestamp;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnimatedEmoji extends Object {
        public static final int CONSTRUCTOR = -1816658231;
        public Sticker sticker;
        public int fitzpatrickType;
        public File sound;

        public AnimatedEmoji() {
        }

        public AnimatedEmoji(Sticker sticker, int fitzpatrickType, File sound) {
            this.sticker = sticker;
            this.fitzpatrickType = fitzpatrickType;
            this.sound = sound;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Animation extends Object {
        public static final int CONSTRUCTOR = -872359106;
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File animation;

        public Animation() {
        }

        public Animation(int duration, int width, int height, String fileName, String mimeType, boolean hasStickers, Minithumbnail minithumbnail, Thumbnail thumbnail, File animation) {
            this.duration = duration;
            this.width = width;
            this.height = height;
            this.fileName = fileName;
            this.mimeType = mimeType;
            this.hasStickers = hasStickers;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.animation = animation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Animations extends Object {
        public static final int CONSTRUCTOR = 344216945;
        public Animation[] animations;

        public Animations() {
        }

        public Animations(Animation[] animations) {
            this.animations = animations;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AttachmentMenuBot extends Object {
        public static final int CONSTRUCTOR = -1566056904;
        public long botUserId;
        public boolean supportsSelfChat;
        public boolean supportsUserChats;
        public boolean supportsBotChats;
        public boolean supportsGroupChats;
        public boolean supportsChannelChats;
        public boolean supportsSettings;
        public String name;
        public AttachmentMenuBotColor nameColor;
        public File defaultIcon;
        public File iosStaticIcon;
        public File iosAnimatedIcon;
        public File androidIcon;
        public File macosIcon;
        public AttachmentMenuBotColor iconColor;
        public File webAppPlaceholder;

        public AttachmentMenuBot() {
        }

        public AttachmentMenuBot(long botUserId, boolean supportsSelfChat, boolean supportsUserChats, boolean supportsBotChats, boolean supportsGroupChats, boolean supportsChannelChats, boolean supportsSettings, String name, AttachmentMenuBotColor nameColor, File defaultIcon, File iosStaticIcon, File iosAnimatedIcon, File androidIcon, File macosIcon, AttachmentMenuBotColor iconColor, File webAppPlaceholder) {
            this.botUserId = botUserId;
            this.supportsSelfChat = supportsSelfChat;
            this.supportsUserChats = supportsUserChats;
            this.supportsBotChats = supportsBotChats;
            this.supportsGroupChats = supportsGroupChats;
            this.supportsChannelChats = supportsChannelChats;
            this.supportsSettings = supportsSettings;
            this.name = name;
            this.nameColor = nameColor;
            this.defaultIcon = defaultIcon;
            this.iosStaticIcon = iosStaticIcon;
            this.iosAnimatedIcon = iosAnimatedIcon;
            this.androidIcon = androidIcon;
            this.macosIcon = macosIcon;
            this.iconColor = iconColor;
            this.webAppPlaceholder = webAppPlaceholder;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AttachmentMenuBotColor extends Object {
        public static final int CONSTRUCTOR = 1680039612;
        public int lightColor;
        public int darkColor;

        public AttachmentMenuBotColor() {
        }

        public AttachmentMenuBotColor(int lightColor, int darkColor) {
            this.lightColor = lightColor;
            this.darkColor = darkColor;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Audio extends Object {
        public static final int CONSTRUCTOR = -1179334690;
        public int duration;
        public String title;
        public String performer;
        public String fileName;
        public String mimeType;
        public Minithumbnail albumCoverMinithumbnail;
        public Thumbnail albumCoverThumbnail;
        public File audio;

        public Audio() {
        }

        public Audio(int duration, String title, String performer, String fileName, String mimeType, Minithumbnail albumCoverMinithumbnail, Thumbnail albumCoverThumbnail, File audio) {
            this.duration = duration;
            this.title = title;
            this.performer = performer;
            this.fileName = fileName;
            this.mimeType = mimeType;
            this.albumCoverMinithumbnail = albumCoverMinithumbnail;
            this.albumCoverThumbnail = albumCoverThumbnail;
            this.audio = audio;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthenticationCodeInfo extends Object {
        public static final int CONSTRUCTOR = -860345416;
        public String phoneNumber;
        public AuthenticationCodeType type;
        public AuthenticationCodeType nextType;
        public int timeout;

        public AuthenticationCodeInfo() {
        }

        public AuthenticationCodeInfo(String phoneNumber, AuthenticationCodeType type, AuthenticationCodeType nextType, int timeout) {
            this.phoneNumber = phoneNumber;
            this.type = type;
            this.nextType = nextType;
            this.timeout = timeout;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class AuthenticationCodeType extends Object {
    }

    public static class AuthenticationCodeTypeTelegramMessage extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 2079628074;
        public int length;

        public AuthenticationCodeTypeTelegramMessage() {
        }

        public AuthenticationCodeTypeTelegramMessage(int length) {
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthenticationCodeTypeSms extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 962650760;
        public int length;

        public AuthenticationCodeTypeSms() {
        }

        public AuthenticationCodeTypeSms(int length) {
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthenticationCodeTypeCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 1636265063;
        public int length;

        public AuthenticationCodeTypeCall() {
        }

        public AuthenticationCodeTypeCall(int length) {
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthenticationCodeTypeFlashCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 1395882402;
        public String pattern;

        public AuthenticationCodeTypeFlashCall() {
        }

        public AuthenticationCodeTypeFlashCall(String pattern) {
            this.pattern = pattern;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthenticationCodeTypeMissedCall extends AuthenticationCodeType {
        public static final int CONSTRUCTOR = 700123783;
        public String phoneNumberPrefix;
        public int length;

        public AuthenticationCodeTypeMissedCall() {
        }

        public AuthenticationCodeTypeMissedCall(String phoneNumberPrefix, int length) {
            this.phoneNumberPrefix = phoneNumberPrefix;
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class AuthorizationState extends Object {
    }

    public static class AuthorizationStateWaitTdlibParameters extends AuthorizationState {

        public static final int CONSTRUCTOR = 904720988;

        public AuthorizationStateWaitTdlibParameters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitEncryptionKey extends AuthorizationState {
        public static final int CONSTRUCTOR = 612103496;
        public boolean isEncrypted;

        public AuthorizationStateWaitEncryptionKey() {
        }

        public AuthorizationStateWaitEncryptionKey(boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitPhoneNumber extends AuthorizationState {

        public static final int CONSTRUCTOR = 306402531;

        public AuthorizationStateWaitPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitCode extends AuthorizationState {
        public static final int CONSTRUCTOR = 52643073;
        public AuthenticationCodeInfo codeInfo;

        public AuthorizationStateWaitCode() {
        }

        public AuthorizationStateWaitCode(AuthenticationCodeInfo codeInfo) {
            this.codeInfo = codeInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitOtherDeviceConfirmation extends AuthorizationState {
        public static final int CONSTRUCTOR = 860166378;
        public String link;

        public AuthorizationStateWaitOtherDeviceConfirmation() {
        }

        public AuthorizationStateWaitOtherDeviceConfirmation(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitRegistration extends AuthorizationState {
        public static final int CONSTRUCTOR = 550350511;
        public TermsOfService termsOfService;

        public AuthorizationStateWaitRegistration() {
        }

        public AuthorizationStateWaitRegistration(TermsOfService termsOfService) {
            this.termsOfService = termsOfService;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateWaitPassword extends AuthorizationState {
        public static final int CONSTRUCTOR = 187548796;
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public String recoveryEmailAddressPattern;

        public AuthorizationStateWaitPassword() {
        }

        public AuthorizationStateWaitPassword(String passwordHint, boolean hasRecoveryEmailAddress, String recoveryEmailAddressPattern) {
            this.passwordHint = passwordHint;
            this.hasRecoveryEmailAddress = hasRecoveryEmailAddress;
            this.recoveryEmailAddressPattern = recoveryEmailAddressPattern;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateReady extends AuthorizationState {

        public static final int CONSTRUCTOR = -1834871737;

        public AuthorizationStateReady() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateLoggingOut extends AuthorizationState {

        public static final int CONSTRUCTOR = 154449270;

        public AuthorizationStateLoggingOut() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateClosing extends AuthorizationState {

        public static final int CONSTRUCTOR = 445855311;

        public AuthorizationStateClosing() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AuthorizationStateClosed extends AuthorizationState {

        public static final int CONSTRUCTOR = 1526047584;

        public AuthorizationStateClosed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AutoDownloadSettings extends Object {
        public static final int CONSTRUCTOR = -813805749;
        public boolean isAutoDownloadEnabled;
        public int maxPhotoFileSize;
        public long maxVideoFileSize;
        public long maxOtherFileSize;
        public int videoUploadBitrate;
        public boolean preloadLargeVideos;
        public boolean preloadNextAudio;
        public boolean useLessDataForCalls;

        public AutoDownloadSettings() {
        }

        public AutoDownloadSettings(boolean isAutoDownloadEnabled, int maxPhotoFileSize, long maxVideoFileSize, long maxOtherFileSize, int videoUploadBitrate, boolean preloadLargeVideos, boolean preloadNextAudio, boolean useLessDataForCalls) {
            this.isAutoDownloadEnabled = isAutoDownloadEnabled;
            this.maxPhotoFileSize = maxPhotoFileSize;
            this.maxVideoFileSize = maxVideoFileSize;
            this.maxOtherFileSize = maxOtherFileSize;
            this.videoUploadBitrate = videoUploadBitrate;
            this.preloadLargeVideos = preloadLargeVideos;
            this.preloadNextAudio = preloadNextAudio;
            this.useLessDataForCalls = useLessDataForCalls;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AutoDownloadSettingsPresets extends Object {
        public static final int CONSTRUCTOR = -782099166;
        public AutoDownloadSettings low;
        public AutoDownloadSettings medium;
        public AutoDownloadSettings high;

        public AutoDownloadSettingsPresets() {
        }

        public AutoDownloadSettingsPresets(AutoDownloadSettings low, AutoDownloadSettings medium, AutoDownloadSettings high) {
            this.low = low;
            this.medium = medium;
            this.high = high;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AvailableReaction extends Object {
        public static final int CONSTRUCTOR = 1768154913;
        public String reaction;
        public boolean needsPremium;

        public AvailableReaction() {
        }

        public AvailableReaction(String reaction, boolean needsPremium) {
            this.reaction = reaction;
            this.needsPremium = needsPremium;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AvailableReactions extends Object {
        public static final int CONSTRUCTOR = 371610450;
        public AvailableReaction[] reactions;

        public AvailableReactions() {
        }

        public AvailableReactions(AvailableReaction[] reactions) {
            this.reactions = reactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Background extends Object {
        public static final int CONSTRUCTOR = -429971172;
        public long id;
        public boolean isDefault;
        public boolean isDark;
        public String name;
        public Document document;
        public BackgroundType type;

        public Background() {
        }

        public Background(long id, boolean isDefault, boolean isDark, String name, Document document, BackgroundType type) {
            this.id = id;
            this.isDefault = isDefault;
            this.isDark = isDark;
            this.name = name;
            this.document = document;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class BackgroundFill extends Object {
    }

    public static class BackgroundFillSolid extends BackgroundFill {
        public static final int CONSTRUCTOR = 1010678813;
        public int color;

        public BackgroundFillSolid() {
        }

        public BackgroundFillSolid(int color) {
            this.color = color;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BackgroundFillGradient extends BackgroundFill {
        public static final int CONSTRUCTOR = -1839206017;
        public int topColor;
        public int bottomColor;
        public int rotationAngle;

        public BackgroundFillGradient() {
        }

        public BackgroundFillGradient(int topColor, int bottomColor, int rotationAngle) {
            this.topColor = topColor;
            this.bottomColor = bottomColor;
            this.rotationAngle = rotationAngle;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BackgroundFillFreeformGradient extends BackgroundFill {
        public static final int CONSTRUCTOR = -1145469255;
        public int[] colors;

        public BackgroundFillFreeformGradient() {
        }

        public BackgroundFillFreeformGradient(int[] colors) {
            this.colors = colors;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class BackgroundType extends Object {
    }

    public static class BackgroundTypeWallpaper extends BackgroundType {
        public static final int CONSTRUCTOR = 1972128891;
        public boolean isBlurred;
        public boolean isMoving;

        public BackgroundTypeWallpaper() {
        }

        public BackgroundTypeWallpaper(boolean isBlurred, boolean isMoving) {
            this.isBlurred = isBlurred;
            this.isMoving = isMoving;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BackgroundTypePattern extends BackgroundType {
        public static final int CONSTRUCTOR = 1290213117;
        public BackgroundFill fill;
        public int intensity;
        public boolean isInverted;
        public boolean isMoving;

        public BackgroundTypePattern() {
        }

        public BackgroundTypePattern(BackgroundFill fill, int intensity, boolean isInverted, boolean isMoving) {
            this.fill = fill;
            this.intensity = intensity;
            this.isInverted = isInverted;
            this.isMoving = isMoving;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BackgroundTypeFill extends BackgroundType {
        public static final int CONSTRUCTOR = 993008684;
        public BackgroundFill fill;

        public BackgroundTypeFill() {
        }

        public BackgroundTypeFill(BackgroundFill fill) {
            this.fill = fill;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Backgrounds extends Object {
        public static final int CONSTRUCTOR = 724728704;
        public Background[] backgrounds;

        public Backgrounds() {
        }

        public Backgrounds(Background[] backgrounds) {
            this.backgrounds = backgrounds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BankCardActionOpenUrl extends Object {
        public static final int CONSTRUCTOR = -196454267;
        public String text;
        public String url;

        public BankCardActionOpenUrl() {
        }

        public BankCardActionOpenUrl(String text, String url) {
            this.text = text;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BankCardInfo extends Object {
        public static final int CONSTRUCTOR = -2116647730;
        public String title;
        public BankCardActionOpenUrl[] actions;

        public BankCardInfo() {
        }

        public BankCardInfo(String title, BankCardActionOpenUrl[] actions) {
            this.title = title;
            this.actions = actions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BasicGroup extends Object {
        public static final int CONSTRUCTOR = -194767217;
        public long id;
        public int memberCount;
        public ChatMemberStatus status;
        public boolean isActive;
        public long upgradedToSupergroupId;

        public BasicGroup() {
        }

        public BasicGroup(long id, int memberCount, ChatMemberStatus status, boolean isActive, long upgradedToSupergroupId) {
            this.id = id;
            this.memberCount = memberCount;
            this.status = status;
            this.isActive = isActive;
            this.upgradedToSupergroupId = upgradedToSupergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BasicGroupFullInfo extends Object {
        public static final int CONSTRUCTOR = 2022233397;
        public ChatPhoto photo;
        public String description;
        public long creatorUserId;
        public ChatMember[] members;
        public ChatInviteLink inviteLink;
        public BotCommands[] botCommands;

        public BasicGroupFullInfo() {
        }

        public BasicGroupFullInfo(ChatPhoto photo, String description, long creatorUserId, ChatMember[] members, ChatInviteLink inviteLink, BotCommands[] botCommands) {
            this.photo = photo;
            this.description = description;
            this.creatorUserId = creatorUserId;
            this.members = members;
            this.inviteLink = inviteLink;
            this.botCommands = botCommands;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommand extends Object {
        public static final int CONSTRUCTOR = -1032140601;
        public String command;
        public String description;

        public BotCommand() {
        }

        public BotCommand(String command, String description) {
            this.command = command;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class BotCommandScope extends Object {
    }

    public static class BotCommandScopeDefault extends BotCommandScope {

        public static final int CONSTRUCTOR = 795652779;

        public BotCommandScopeDefault() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeAllPrivateChats extends BotCommandScope {

        public static final int CONSTRUCTOR = -344889543;

        public BotCommandScopeAllPrivateChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeAllGroupChats extends BotCommandScope {

        public static final int CONSTRUCTOR = -981088162;

        public BotCommandScopeAllGroupChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeAllChatAdministrators extends BotCommandScope {

        public static final int CONSTRUCTOR = 1998329169;

        public BotCommandScopeAllChatAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeChat extends BotCommandScope {
        public static final int CONSTRUCTOR = -430234971;
        public long chatId;

        public BotCommandScopeChat() {
        }

        public BotCommandScopeChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeChatAdministrators extends BotCommandScope {
        public static final int CONSTRUCTOR = 1119682126;
        public long chatId;

        public BotCommandScopeChatAdministrators() {
        }

        public BotCommandScopeChatAdministrators(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommandScopeChatMember extends BotCommandScope {
        public static final int CONSTRUCTOR = -211380494;
        public long chatId;
        public long userId;

        public BotCommandScopeChatMember() {
        }

        public BotCommandScopeChatMember(long chatId, long userId) {
            this.chatId = chatId;
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotCommands extends Object {
        public static final int CONSTRUCTOR = 1741364468;
        public long botUserId;
        public BotCommand[] commands;

        public BotCommands() {
        }

        public BotCommands(long botUserId, BotCommand[] commands) {
            this.botUserId = botUserId;
            this.commands = commands;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotInfo extends Object {
        public static final int CONSTRUCTOR = 429675178;
        public String shareText;
        public String description;
        public Photo photo;
        public Animation animation;
        public BotMenuButton menuButton;
        public BotCommand[] commands;
        public ChatAdministratorRights defaultGroupAdministratorRights;
        public ChatAdministratorRights defaultChannelAdministratorRights;

        public BotInfo() {
        }

        public BotInfo(String shareText, String description, Photo photo, Animation animation, BotMenuButton menuButton, BotCommand[] commands, ChatAdministratorRights defaultGroupAdministratorRights, ChatAdministratorRights defaultChannelAdministratorRights) {
            this.shareText = shareText;
            this.description = description;
            this.photo = photo;
            this.animation = animation;
            this.menuButton = menuButton;
            this.commands = commands;
            this.defaultGroupAdministratorRights = defaultGroupAdministratorRights;
            this.defaultChannelAdministratorRights = defaultChannelAdministratorRights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BotMenuButton extends Object {
        public static final int CONSTRUCTOR = -944407322;
        public String text;
        public String url;

        public BotMenuButton() {
        }

        public BotMenuButton(String text, String url) {
            this.text = text;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Call extends Object {
        public static final int CONSTRUCTOR = 920360804;
        public int id;
        public long userId;
        public boolean isOutgoing;
        public boolean isVideo;
        public CallState state;

        public Call() {
        }

        public Call(int id, long userId, boolean isOutgoing, boolean isVideo, CallState state) {
            this.id = id;
            this.userId = userId;
            this.isOutgoing = isOutgoing;
            this.isVideo = isVideo;
            this.state = state;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CallDiscardReason extends Object {
    }

    public static class CallDiscardReasonEmpty extends CallDiscardReason {

        public static final int CONSTRUCTOR = -1258917949;

        public CallDiscardReasonEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonMissed extends CallDiscardReason {

        public static final int CONSTRUCTOR = 1680358012;

        public CallDiscardReasonMissed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonDeclined extends CallDiscardReason {

        public static final int CONSTRUCTOR = -1729926094;

        public CallDiscardReasonDeclined() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonDisconnected extends CallDiscardReason {

        public static final int CONSTRUCTOR = -1342872670;

        public CallDiscardReasonDisconnected() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallDiscardReasonHungUp extends CallDiscardReason {

        public static final int CONSTRUCTOR = 438216166;

        public CallDiscardReasonHungUp() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallId extends Object {
        public static final int CONSTRUCTOR = 65717769;
        public int id;

        public CallId() {
        }

        public CallId(int id) {
            this.id = id;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CallProblem extends Object {
    }

    public static class CallProblemEcho extends CallProblem {

        public static final int CONSTRUCTOR = 801116548;

        public CallProblemEcho() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemNoise extends CallProblem {

        public static final int CONSTRUCTOR = 1053065359;

        public CallProblemNoise() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemInterruptions extends CallProblem {

        public static final int CONSTRUCTOR = 1119493218;

        public CallProblemInterruptions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemDistortedSpeech extends CallProblem {

        public static final int CONSTRUCTOR = 379960581;

        public CallProblemDistortedSpeech() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemSilentLocal extends CallProblem {

        public static final int CONSTRUCTOR = 253652790;

        public CallProblemSilentLocal() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemSilentRemote extends CallProblem {

        public static final int CONSTRUCTOR = 573634714;

        public CallProblemSilentRemote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemDropped extends CallProblem {

        public static final int CONSTRUCTOR = -1207311487;

        public CallProblemDropped() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemDistortedVideo extends CallProblem {

        public static final int CONSTRUCTOR = 385245706;

        public CallProblemDistortedVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProblemPixelatedVideo extends CallProblem {

        public static final int CONSTRUCTOR = 2115315411;

        public CallProblemPixelatedVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallProtocol extends Object {
        public static final int CONSTRUCTOR = -1075562897;
        public boolean udpP2p;
        public boolean udpReflector;
        public int minLayer;
        public int maxLayer;
        public String[] libraryVersions;

        public CallProtocol() {
        }

        public CallProtocol(boolean udpP2p, boolean udpReflector, int minLayer, int maxLayer, String[] libraryVersions) {
            this.udpP2p = udpP2p;
            this.udpReflector = udpReflector;
            this.minLayer = minLayer;
            this.maxLayer = maxLayer;
            this.libraryVersions = libraryVersions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallServer extends Object {
        public static final int CONSTRUCTOR = 1865932695;
        public long id;
        public String ipAddress;
        public String ipv6Address;
        public int port;
        public CallServerType type;

        public CallServer() {
        }

        public CallServer(long id, String ipAddress, String ipv6Address, int port, CallServerType type) {
            this.id = id;
            this.ipAddress = ipAddress;
            this.ipv6Address = ipv6Address;
            this.port = port;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CallServerType extends Object {
    }

    public static class CallServerTypeTelegramReflector extends CallServerType {
        public static final int CONSTRUCTOR = 850343189;
        public byte[] peerTag;
        public boolean isTcp;

        public CallServerTypeTelegramReflector() {
        }

        public CallServerTypeTelegramReflector(byte[] peerTag, boolean isTcp) {
            this.peerTag = peerTag;
            this.isTcp = isTcp;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallServerTypeWebrtc extends CallServerType {
        public static final int CONSTRUCTOR = 1250622821;
        public String username;
        public String password;
        public boolean supportsTurn;
        public boolean supportsStun;

        public CallServerTypeWebrtc() {
        }

        public CallServerTypeWebrtc(String username, String password, boolean supportsTurn, boolean supportsStun) {
            this.username = username;
            this.password = password;
            this.supportsTurn = supportsTurn;
            this.supportsStun = supportsStun;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CallState extends Object {
    }

    public static class CallStatePending extends CallState {
        public static final int CONSTRUCTOR = 1073048620;
        public boolean isCreated;
        public boolean isReceived;

        public CallStatePending() {
        }

        public CallStatePending(boolean isCreated, boolean isReceived) {
            this.isCreated = isCreated;
            this.isReceived = isReceived;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateExchangingKeys extends CallState {

        public static final int CONSTRUCTOR = -1848149403;

        public CallStateExchangingKeys() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateReady extends CallState {
        public static final int CONSTRUCTOR = -2000107571;
        public CallProtocol protocol;
        public CallServer[] servers;
        public String config;
        public byte[] encryptionKey;
        public String[] emojis;
        public boolean allowP2p;

        public CallStateReady() {
        }

        public CallStateReady(CallProtocol protocol, CallServer[] servers, String config, byte[] encryptionKey, String[] emojis, boolean allowP2p) {
            this.protocol = protocol;
            this.servers = servers;
            this.config = config;
            this.encryptionKey = encryptionKey;
            this.emojis = emojis;
            this.allowP2p = allowP2p;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateHangingUp extends CallState {

        public static final int CONSTRUCTOR = -2133790038;

        public CallStateHangingUp() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateDiscarded extends CallState {
        public static final int CONSTRUCTOR = 1394310213;
        public CallDiscardReason reason;
        public boolean needRating;
        public boolean needDebugInformation;
        public boolean needLog;

        public CallStateDiscarded() {
        }

        public CallStateDiscarded(CallDiscardReason reason, boolean needRating, boolean needDebugInformation, boolean needLog) {
            this.reason = reason;
            this.needRating = needRating;
            this.needDebugInformation = needDebugInformation;
            this.needLog = needLog;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallStateError extends CallState {
        public static final int CONSTRUCTOR = -975215467;
        public Error error;

        public CallStateError() {
        }

        public CallStateError(Error error) {
            this.error = error;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallbackQueryAnswer extends Object {
        public static final int CONSTRUCTOR = 360867933;
        public String text;
        public boolean showAlert;
        public String url;

        public CallbackQueryAnswer() {
        }

        public CallbackQueryAnswer(String text, boolean showAlert, String url) {
            this.text = text;
            this.showAlert = showAlert;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CallbackQueryPayload extends Object {
    }

    public static class CallbackQueryPayloadData extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = -1977729946;
        public byte[] data;

        public CallbackQueryPayloadData() {
        }

        public CallbackQueryPayloadData(byte[] data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallbackQueryPayloadDataWithPassword extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = 1340266738;
        public String password;
        public byte[] data;

        public CallbackQueryPayloadDataWithPassword() {
        }

        public CallbackQueryPayloadDataWithPassword(String password, byte[] data) {
            this.password = password;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CallbackQueryPayloadGame extends CallbackQueryPayload {
        public static final int CONSTRUCTOR = 1303571512;
        public String gameShortName;

        public CallbackQueryPayloadGame() {
        }

        public CallbackQueryPayloadGame(String gameShortName) {
            this.gameShortName = gameShortName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CanTransferOwnershipResult extends Object {
    }

    public static class CanTransferOwnershipResultOk extends CanTransferOwnershipResult {

        public static final int CONSTRUCTOR = -89881021;

        public CanTransferOwnershipResultOk() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnershipResultPasswordNeeded extends CanTransferOwnershipResult {

        public static final int CONSTRUCTOR = 1548372703;

        public CanTransferOwnershipResultPasswordNeeded() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnershipResultPasswordTooFresh extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 811440913;
        public int retryAfter;

        public CanTransferOwnershipResultPasswordTooFresh() {
        }

        public CanTransferOwnershipResultPasswordTooFresh(int retryAfter) {
            this.retryAfter = retryAfter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnershipResultSessionTooFresh extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 984664289;
        public int retryAfter;

        public CanTransferOwnershipResultSessionTooFresh() {
        }

        public CanTransferOwnershipResultSessionTooFresh(int retryAfter) {
            this.retryAfter = retryAfter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Chat extends Object {
        public static final int CONSTRUCTOR = -1601123095;
        public long id;
        public ChatType type;
        public String title;
        public ChatPhotoInfo photo;
        public ChatPermissions permissions;
        public Message lastMessage;
        public ChatPosition[] positions;
        public MessageSender messageSenderId;
        public boolean hasProtectedContent;
        public boolean isMarkedAsUnread;
        public boolean isBlocked;
        public boolean hasScheduledMessages;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canBeReported;
        public boolean defaultDisableNotification;
        public int unreadCount;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public int unreadMentionCount;
        public int unreadReactionCount;
        public ChatNotificationSettings notificationSettings;
        public String[] availableReactions;
        public int messageTtl;
        public String themeName;
        public ChatActionBar actionBar;
        public VideoChat videoChat;
        public ChatJoinRequestsInfo pendingJoinRequests;
        public long replyMarkupMessageId;
        public DraftMessage draftMessage;
        public String clientData;

        public Chat() {
        }

        public Chat(long id, ChatType type, String title, ChatPhotoInfo photo, ChatPermissions permissions, Message lastMessage, ChatPosition[] positions, MessageSender messageSenderId, boolean hasProtectedContent, boolean isMarkedAsUnread, boolean isBlocked, boolean hasScheduledMessages, boolean canBeDeletedOnlyForSelf, boolean canBeDeletedForAllUsers, boolean canBeReported, boolean defaultDisableNotification, int unreadCount, long lastReadInboxMessageId, long lastReadOutboxMessageId, int unreadMentionCount, int unreadReactionCount, ChatNotificationSettings notificationSettings, String[] availableReactions, int messageTtl, String themeName, ChatActionBar actionBar, VideoChat videoChat, ChatJoinRequestsInfo pendingJoinRequests, long replyMarkupMessageId, DraftMessage draftMessage, String clientData) {
            this.id = id;
            this.type = type;
            this.title = title;
            this.photo = photo;
            this.permissions = permissions;
            this.lastMessage = lastMessage;
            this.positions = positions;
            this.messageSenderId = messageSenderId;
            this.hasProtectedContent = hasProtectedContent;
            this.isMarkedAsUnread = isMarkedAsUnread;
            this.isBlocked = isBlocked;
            this.hasScheduledMessages = hasScheduledMessages;
            this.canBeDeletedOnlyForSelf = canBeDeletedOnlyForSelf;
            this.canBeDeletedForAllUsers = canBeDeletedForAllUsers;
            this.canBeReported = canBeReported;
            this.defaultDisableNotification = defaultDisableNotification;
            this.unreadCount = unreadCount;
            this.lastReadInboxMessageId = lastReadInboxMessageId;
            this.lastReadOutboxMessageId = lastReadOutboxMessageId;
            this.unreadMentionCount = unreadMentionCount;
            this.unreadReactionCount = unreadReactionCount;
            this.notificationSettings = notificationSettings;
            this.availableReactions = availableReactions;
            this.messageTtl = messageTtl;
            this.themeName = themeName;
            this.actionBar = actionBar;
            this.videoChat = videoChat;
            this.pendingJoinRequests = pendingJoinRequests;
            this.replyMarkupMessageId = replyMarkupMessageId;
            this.draftMessage = draftMessage;
            this.clientData = clientData;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatAction extends Object {
    }

    public static class ChatActionTyping extends ChatAction {

        public static final int CONSTRUCTOR = 380122167;

        public ChatActionTyping() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVideo extends ChatAction {

        public static final int CONSTRUCTOR = 216553362;

        public ChatActionRecordingVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingVideo extends ChatAction {
        public static final int CONSTRUCTOR = 1234185270;
        public int progress;

        public ChatActionUploadingVideo() {
        }

        public ChatActionUploadingVideo(int progress) {
            this.progress = progress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVoiceNote extends ChatAction {

        public static final int CONSTRUCTOR = -808850058;

        public ChatActionRecordingVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingVoiceNote extends ChatAction {
        public static final int CONSTRUCTOR = -613643666;
        public int progress;

        public ChatActionUploadingVoiceNote() {
        }

        public ChatActionUploadingVoiceNote(int progress) {
            this.progress = progress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingPhoto extends ChatAction {
        public static final int CONSTRUCTOR = 654240583;
        public int progress;

        public ChatActionUploadingPhoto() {
        }

        public ChatActionUploadingPhoto(int progress) {
            this.progress = progress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingDocument extends ChatAction {
        public static final int CONSTRUCTOR = 167884362;
        public int progress;

        public ChatActionUploadingDocument() {
        }

        public ChatActionUploadingDocument(int progress) {
            this.progress = progress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingSticker extends ChatAction {

        public static final int CONSTRUCTOR = 372753697;

        public ChatActionChoosingSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingLocation extends ChatAction {

        public static final int CONSTRUCTOR = -2017893596;

        public ChatActionChoosingLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionChoosingContact extends ChatAction {

        public static final int CONSTRUCTOR = -1222507496;

        public ChatActionChoosingContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionStartPlayingGame extends ChatAction {

        public static final int CONSTRUCTOR = -865884164;

        public ChatActionStartPlayingGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionRecordingVideoNote extends ChatAction {

        public static final int CONSTRUCTOR = 16523393;

        public ChatActionRecordingVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionUploadingVideoNote extends ChatAction {
        public static final int CONSTRUCTOR = 1172364918;
        public int progress;

        public ChatActionUploadingVideoNote() {
        }

        public ChatActionUploadingVideoNote(int progress) {
            this.progress = progress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionWatchingAnimations extends ChatAction {
        public static final int CONSTRUCTOR = 2052990641;
        public String emoji;

        public ChatActionWatchingAnimations() {
        }

        public ChatActionWatchingAnimations(String emoji) {
            this.emoji = emoji;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionCancel extends ChatAction {

        public static final int CONSTRUCTOR = 1160523958;

        public ChatActionCancel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatActionBar extends Object {
    }

    public static class ChatActionBarReportSpam extends ChatActionBar {
        public static final int CONSTRUCTOR = -1312758246;
        public boolean canUnarchive;

        public ChatActionBarReportSpam() {
        }

        public ChatActionBarReportSpam(boolean canUnarchive) {
            this.canUnarchive = canUnarchive;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarReportUnrelatedLocation extends ChatActionBar {

        public static final int CONSTRUCTOR = 758175489;

        public ChatActionBarReportUnrelatedLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarInviteMembers extends ChatActionBar {

        public static final int CONSTRUCTOR = 1985313904;

        public ChatActionBarInviteMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarReportAddBlock extends ChatActionBar {
        public static final int CONSTRUCTOR = -914150419;
        public boolean canUnarchive;
        public int distance;

        public ChatActionBarReportAddBlock() {
        }

        public ChatActionBarReportAddBlock(boolean canUnarchive, int distance) {
            this.canUnarchive = canUnarchive;
            this.distance = distance;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarAddContact extends ChatActionBar {

        public static final int CONSTRUCTOR = -733325295;

        public ChatActionBarAddContact() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarSharePhoneNumber extends ChatActionBar {

        public static final int CONSTRUCTOR = 35188697;

        public ChatActionBarSharePhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatActionBarJoinRequest extends ChatActionBar {
        public static final int CONSTRUCTOR = 1037140744;
        public String title;
        public boolean isChannel;
        public int requestDate;

        public ChatActionBarJoinRequest() {
        }

        public ChatActionBarJoinRequest(String title, boolean isChannel, int requestDate) {
            this.title = title;
            this.isChannel = isChannel;
            this.requestDate = requestDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatAdministrator extends Object {
        public static final int CONSTRUCTOR = 1920449836;
        public long userId;
        public String customTitle;
        public boolean isOwner;

        public ChatAdministrator() {
        }

        public ChatAdministrator(long userId, String customTitle, boolean isOwner) {
            this.userId = userId;
            this.customTitle = customTitle;
            this.isOwner = isOwner;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatAdministratorRights extends Object {
        public static final int CONSTRUCTOR = 1878886718;
        public boolean canManageChat;
        public boolean canChangeInfo;
        public boolean canPostMessages;
        public boolean canEditMessages;
        public boolean canDeleteMessages;
        public boolean canInviteUsers;
        public boolean canRestrictMembers;
        public boolean canPinMessages;
        public boolean canPromoteMembers;
        public boolean canManageVideoChats;
        public boolean isAnonymous;

        public ChatAdministratorRights() {
        }

        public ChatAdministratorRights(boolean canManageChat, boolean canChangeInfo, boolean canPostMessages, boolean canEditMessages, boolean canDeleteMessages, boolean canInviteUsers, boolean canRestrictMembers, boolean canPinMessages, boolean canPromoteMembers, boolean canManageVideoChats, boolean isAnonymous) {
            this.canManageChat = canManageChat;
            this.canChangeInfo = canChangeInfo;
            this.canPostMessages = canPostMessages;
            this.canEditMessages = canEditMessages;
            this.canDeleteMessages = canDeleteMessages;
            this.canInviteUsers = canInviteUsers;
            this.canRestrictMembers = canRestrictMembers;
            this.canPinMessages = canPinMessages;
            this.canPromoteMembers = canPromoteMembers;
            this.canManageVideoChats = canManageVideoChats;
            this.isAnonymous = isAnonymous;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatAdministrators extends Object {
        public static final int CONSTRUCTOR = -2126186435;
        public ChatAdministrator[] administrators;

        public ChatAdministrators() {
        }

        public ChatAdministrators(ChatAdministrator[] administrators) {
            this.administrators = administrators;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEvent extends Object {
        public static final int CONSTRUCTOR = -652102704;
        public long id;
        public int date;
        public MessageSender memberId;
        public ChatEventAction action;

        public ChatEvent() {
        }

        public ChatEvent(long id, int date, MessageSender memberId, ChatEventAction action) {
            this.id = id;
            this.date = date;
            this.memberId = memberId;
            this.action = action;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatEventAction extends Object {
    }

    public static class ChatEventMessageEdited extends ChatEventAction {
        public static final int CONSTRUCTOR = -430967304;
        public Message oldMessage;
        public Message newMessage;

        public ChatEventMessageEdited() {
        }

        public ChatEventMessageEdited(Message oldMessage, Message newMessage) {
            this.oldMessage = oldMessage;
            this.newMessage = newMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMessageDeleted extends ChatEventAction {
        public static final int CONSTRUCTOR = -892974601;
        public Message message;

        public ChatEventMessageDeleted() {
        }

        public ChatEventMessageDeleted(Message message) {
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMessagePinned extends ChatEventAction {
        public static final int CONSTRUCTOR = 438742298;
        public Message message;

        public ChatEventMessagePinned() {
        }

        public ChatEventMessagePinned(Message message) {
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMessageUnpinned extends ChatEventAction {
        public static final int CONSTRUCTOR = -376161513;
        public Message message;

        public ChatEventMessageUnpinned() {
        }

        public ChatEventMessageUnpinned(Message message) {
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventPollStopped extends ChatEventAction {
        public static final int CONSTRUCTOR = 2009893861;
        public Message message;

        public ChatEventPollStopped() {
        }

        public ChatEventPollStopped(Message message) {
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberJoined extends ChatEventAction {

        public static final int CONSTRUCTOR = -235468508;

        public ChatEventMemberJoined() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberJoinedByInviteLink extends ChatEventAction {
        public static final int CONSTRUCTOR = -253307459;
        public ChatInviteLink inviteLink;

        public ChatEventMemberJoinedByInviteLink() {
        }

        public ChatEventMemberJoinedByInviteLink(ChatInviteLink inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberJoinedByRequest extends ChatEventAction {
        public static final int CONSTRUCTOR = -1647804865;
        public long approverUserId;
        public ChatInviteLink inviteLink;

        public ChatEventMemberJoinedByRequest() {
        }

        public ChatEventMemberJoinedByRequest(long approverUserId, ChatInviteLink inviteLink) {
            this.approverUserId = approverUserId;
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberInvited extends ChatEventAction {
        public static final int CONSTRUCTOR = 953663433;
        public long userId;
        public ChatMemberStatus status;

        public ChatEventMemberInvited() {
        }

        public ChatEventMemberInvited(long userId, ChatMemberStatus status) {
            this.userId = userId;
            this.status = status;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberLeft extends ChatEventAction {

        public static final int CONSTRUCTOR = -948420593;

        public ChatEventMemberLeft() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberPromoted extends ChatEventAction {
        public static final int CONSTRUCTOR = 525297761;
        public long userId;
        public ChatMemberStatus oldStatus;
        public ChatMemberStatus newStatus;

        public ChatEventMemberPromoted() {
        }

        public ChatEventMemberPromoted(long userId, ChatMemberStatus oldStatus, ChatMemberStatus newStatus) {
            this.userId = userId;
            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMemberRestricted extends ChatEventAction {
        public static final int CONSTRUCTOR = 1603608069;
        public MessageSender memberId;
        public ChatMemberStatus oldStatus;
        public ChatMemberStatus newStatus;

        public ChatEventMemberRestricted() {
        }

        public ChatEventMemberRestricted(MessageSender memberId, ChatMemberStatus oldStatus, ChatMemberStatus newStatus) {
            this.memberId = memberId;
            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventAvailableReactionsChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1401674536;
        public String[] oldAvailableReactions;
        public String[] newAvailableReactions;

        public ChatEventAvailableReactionsChanged() {
        }

        public ChatEventAvailableReactionsChanged(String[] oldAvailableReactions, String[] newAvailableReactions) {
            this.oldAvailableReactions = oldAvailableReactions;
            this.newAvailableReactions = newAvailableReactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventDescriptionChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 39112478;
        public String oldDescription;
        public String newDescription;

        public ChatEventDescriptionChanged() {
        }

        public ChatEventDescriptionChanged(String oldDescription, String newDescription) {
            this.oldDescription = oldDescription;
            this.newDescription = newDescription;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventLinkedChatChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1797419439;
        public long oldLinkedChatId;
        public long newLinkedChatId;

        public ChatEventLinkedChatChanged() {
        }

        public ChatEventLinkedChatChanged(long oldLinkedChatId, long newLinkedChatId) {
            this.oldLinkedChatId = oldLinkedChatId;
            this.newLinkedChatId = newLinkedChatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventLocationChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -405930674;
        public ChatLocation oldLocation;
        public ChatLocation newLocation;

        public ChatEventLocationChanged() {
        }

        public ChatEventLocationChanged(ChatLocation oldLocation, ChatLocation newLocation) {
            this.oldLocation = oldLocation;
            this.newLocation = newLocation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventMessageTtlChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 776386995;
        public int oldMessageTtl;
        public int newMessageTtl;

        public ChatEventMessageTtlChanged() {
        }

        public ChatEventMessageTtlChanged(int oldMessageTtl, int newMessageTtl) {
            this.oldMessageTtl = oldMessageTtl;
            this.newMessageTtl = newMessageTtl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventPermissionsChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1311557720;
        public ChatPermissions oldPermissions;
        public ChatPermissions newPermissions;

        public ChatEventPermissionsChanged() {
        }

        public ChatEventPermissionsChanged(ChatPermissions oldPermissions, ChatPermissions newPermissions) {
            this.oldPermissions = oldPermissions;
            this.newPermissions = newPermissions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventPhotoChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -811572541;
        public ChatPhoto oldPhoto;
        public ChatPhoto newPhoto;

        public ChatEventPhotoChanged() {
        }

        public ChatEventPhotoChanged(ChatPhoto oldPhoto, ChatPhoto newPhoto) {
            this.oldPhoto = oldPhoto;
            this.newPhoto = newPhoto;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventSlowModeDelayChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1653195765;
        public int oldSlowModeDelay;
        public int newSlowModeDelay;

        public ChatEventSlowModeDelayChanged() {
        }

        public ChatEventSlowModeDelayChanged(int oldSlowModeDelay, int newSlowModeDelay) {
            this.oldSlowModeDelay = oldSlowModeDelay;
            this.newSlowModeDelay = newSlowModeDelay;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventStickerSetChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = -1243130481;
        public long oldStickerSetId;
        public long newStickerSetId;

        public ChatEventStickerSetChanged() {
        }

        public ChatEventStickerSetChanged(long oldStickerSetId, long newStickerSetId) {
            this.oldStickerSetId = oldStickerSetId;
            this.newStickerSetId = newStickerSetId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventTitleChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1134103250;
        public String oldTitle;
        public String newTitle;

        public ChatEventTitleChanged() {
        }

        public ChatEventTitleChanged(String oldTitle, String newTitle) {
            this.oldTitle = oldTitle;
            this.newTitle = newTitle;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventUsernameChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1728558443;
        public String oldUsername;
        public String newUsername;

        public ChatEventUsernameChanged() {
        }

        public ChatEventUsernameChanged(String oldUsername, String newUsername) {
            this.oldUsername = oldUsername;
            this.newUsername = newUsername;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventHasProtectedContentToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -184270335;
        public boolean hasProtectedContent;

        public ChatEventHasProtectedContentToggled() {
        }

        public ChatEventHasProtectedContentToggled(boolean hasProtectedContent) {
            this.hasProtectedContent = hasProtectedContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventInvitesToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -62548373;
        public boolean canInviteUsers;

        public ChatEventInvitesToggled() {
        }

        public ChatEventInvitesToggled(boolean canInviteUsers) {
            this.canInviteUsers = canInviteUsers;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventIsAllHistoryAvailableToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -1599063019;
        public boolean isAllHistoryAvailable;

        public ChatEventIsAllHistoryAvailableToggled() {
        }

        public ChatEventIsAllHistoryAvailableToggled(boolean isAllHistoryAvailable) {
            this.isAllHistoryAvailable = isAllHistoryAvailable;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventSignMessagesToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -1313265634;
        public boolean signMessages;

        public ChatEventSignMessagesToggled() {
        }

        public ChatEventSignMessagesToggled(boolean signMessages) {
            this.signMessages = signMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventInviteLinkEdited extends ChatEventAction {
        public static final int CONSTRUCTOR = -460190366;
        public ChatInviteLink oldInviteLink;
        public ChatInviteLink newInviteLink;

        public ChatEventInviteLinkEdited() {
        }

        public ChatEventInviteLinkEdited(ChatInviteLink oldInviteLink, ChatInviteLink newInviteLink) {
            this.oldInviteLink = oldInviteLink;
            this.newInviteLink = newInviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventInviteLinkRevoked extends ChatEventAction {
        public static final int CONSTRUCTOR = -1579417629;
        public ChatInviteLink inviteLink;

        public ChatEventInviteLinkRevoked() {
        }

        public ChatEventInviteLinkRevoked(ChatInviteLink inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventInviteLinkDeleted extends ChatEventAction {
        public static final int CONSTRUCTOR = -1394974361;
        public ChatInviteLink inviteLink;

        public ChatEventInviteLinkDeleted() {
        }

        public ChatEventInviteLinkDeleted(ChatInviteLink inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventVideoChatCreated extends ChatEventAction {
        public static final int CONSTRUCTOR = 1822853755;
        public int groupCallId;

        public ChatEventVideoChatCreated() {
        }

        public ChatEventVideoChatCreated(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventVideoChatEnded extends ChatEventAction {
        public static final int CONSTRUCTOR = 1630039112;
        public int groupCallId;

        public ChatEventVideoChatEnded() {
        }

        public ChatEventVideoChatEnded(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventVideoChatMuteNewParticipantsToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = -126547970;
        public boolean muteNewParticipants;

        public ChatEventVideoChatMuteNewParticipantsToggled() {
        }

        public ChatEventVideoChatMuteNewParticipantsToggled(boolean muteNewParticipants) {
            this.muteNewParticipants = muteNewParticipants;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventVideoChatParticipantIsMutedToggled extends ChatEventAction {
        public static final int CONSTRUCTOR = 521165047;
        public MessageSender participantId;
        public boolean isMuted;

        public ChatEventVideoChatParticipantIsMutedToggled() {
        }

        public ChatEventVideoChatParticipantIsMutedToggled(MessageSender participantId, boolean isMuted) {
            this.participantId = participantId;
            this.isMuted = isMuted;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventVideoChatParticipantVolumeLevelChanged extends ChatEventAction {
        public static final int CONSTRUCTOR = 1131385534;
        public MessageSender participantId;
        public int volumeLevel;

        public ChatEventVideoChatParticipantVolumeLevelChanged() {
        }

        public ChatEventVideoChatParticipantVolumeLevelChanged(MessageSender participantId, int volumeLevel) {
            this.participantId = participantId;
            this.volumeLevel = volumeLevel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEventLogFilters extends Object {
        public static final int CONSTRUCTOR = 1251197299;
        public boolean messageEdits;
        public boolean messageDeletions;
        public boolean messagePins;
        public boolean memberJoins;
        public boolean memberLeaves;
        public boolean memberInvites;
        public boolean memberPromotions;
        public boolean memberRestrictions;
        public boolean infoChanges;
        public boolean settingChanges;
        public boolean inviteLinkChanges;
        public boolean videoChatChanges;

        public ChatEventLogFilters() {
        }

        public ChatEventLogFilters(boolean messageEdits, boolean messageDeletions, boolean messagePins, boolean memberJoins, boolean memberLeaves, boolean memberInvites, boolean memberPromotions, boolean memberRestrictions, boolean infoChanges, boolean settingChanges, boolean inviteLinkChanges, boolean videoChatChanges) {
            this.messageEdits = messageEdits;
            this.messageDeletions = messageDeletions;
            this.messagePins = messagePins;
            this.memberJoins = memberJoins;
            this.memberLeaves = memberLeaves;
            this.memberInvites = memberInvites;
            this.memberPromotions = memberPromotions;
            this.memberRestrictions = memberRestrictions;
            this.infoChanges = infoChanges;
            this.settingChanges = settingChanges;
            this.inviteLinkChanges = inviteLinkChanges;
            this.videoChatChanges = videoChatChanges;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatEvents extends Object {
        public static final int CONSTRUCTOR = -585329664;
        public ChatEvent[] events;

        public ChatEvents() {
        }

        public ChatEvents(ChatEvent[] events) {
            this.events = events;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatFilter extends Object {
        public static final int CONSTRUCTOR = -664815123;
        public String title;
        public String iconName;
        public long[] pinnedChatIds;
        public long[] includedChatIds;
        public long[] excludedChatIds;
        public boolean excludeMuted;
        public boolean excludeRead;
        public boolean excludeArchived;
        public boolean includeContacts;
        public boolean includeNonContacts;
        public boolean includeBots;
        public boolean includeGroups;
        public boolean includeChannels;

        public ChatFilter() {
        }

        public ChatFilter(String title, String iconName, long[] pinnedChatIds, long[] includedChatIds, long[] excludedChatIds, boolean excludeMuted, boolean excludeRead, boolean excludeArchived, boolean includeContacts, boolean includeNonContacts, boolean includeBots, boolean includeGroups, boolean includeChannels) {
            this.title = title;
            this.iconName = iconName;
            this.pinnedChatIds = pinnedChatIds;
            this.includedChatIds = includedChatIds;
            this.excludedChatIds = excludedChatIds;
            this.excludeMuted = excludeMuted;
            this.excludeRead = excludeRead;
            this.excludeArchived = excludeArchived;
            this.includeContacts = includeContacts;
            this.includeNonContacts = includeNonContacts;
            this.includeBots = includeBots;
            this.includeGroups = includeGroups;
            this.includeChannels = includeChannels;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatFilterInfo extends Object {
        public static final int CONSTRUCTOR = -943721165;
        public int id;
        public String title;
        public String iconName;

        public ChatFilterInfo() {
        }

        public ChatFilterInfo(int id, String title, String iconName) {
            this.id = id;
            this.title = title;
            this.iconName = iconName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLink extends Object {
        public static final int CONSTRUCTOR = -205812476;
        public String inviteLink;
        public String name;
        public long creatorUserId;
        public int date;
        public int editDate;
        public int expirationDate;
        public int memberLimit;
        public int memberCount;
        public int pendingJoinRequestCount;
        public boolean createsJoinRequest;
        public boolean isPrimary;
        public boolean isRevoked;

        public ChatInviteLink() {
        }

        public ChatInviteLink(String inviteLink, String name, long creatorUserId, int date, int editDate, int expirationDate, int memberLimit, int memberCount, int pendingJoinRequestCount, boolean createsJoinRequest, boolean isPrimary, boolean isRevoked) {
            this.inviteLink = inviteLink;
            this.name = name;
            this.creatorUserId = creatorUserId;
            this.date = date;
            this.editDate = editDate;
            this.expirationDate = expirationDate;
            this.memberLimit = memberLimit;
            this.memberCount = memberCount;
            this.pendingJoinRequestCount = pendingJoinRequestCount;
            this.createsJoinRequest = createsJoinRequest;
            this.isPrimary = isPrimary;
            this.isRevoked = isRevoked;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinkCount extends Object {
        public static final int CONSTRUCTOR = -1021999210;
        public long userId;
        public int inviteLinkCount;
        public int revokedInviteLinkCount;

        public ChatInviteLinkCount() {
        }

        public ChatInviteLinkCount(long userId, int inviteLinkCount, int revokedInviteLinkCount) {
            this.userId = userId;
            this.inviteLinkCount = inviteLinkCount;
            this.revokedInviteLinkCount = revokedInviteLinkCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinkCounts extends Object {
        public static final int CONSTRUCTOR = 920326637;
        public ChatInviteLinkCount[] inviteLinkCounts;

        public ChatInviteLinkCounts() {
        }

        public ChatInviteLinkCounts(ChatInviteLinkCount[] inviteLinkCounts) {
            this.inviteLinkCounts = inviteLinkCounts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinkInfo extends Object {
        public static final int CONSTRUCTOR = 546234276;
        public long chatId;
        public int accessibleFor;
        public ChatType type;
        public String title;
        public ChatPhotoInfo photo;
        public String description;
        public int memberCount;
        public long[] memberUserIds;
        public boolean createsJoinRequest;
        public boolean isPublic;

        public ChatInviteLinkInfo() {
        }

        public ChatInviteLinkInfo(long chatId, int accessibleFor, ChatType type, String title, ChatPhotoInfo photo, String description, int memberCount, long[] memberUserIds, boolean createsJoinRequest, boolean isPublic) {
            this.chatId = chatId;
            this.accessibleFor = accessibleFor;
            this.type = type;
            this.title = title;
            this.photo = photo;
            this.description = description;
            this.memberCount = memberCount;
            this.memberUserIds = memberUserIds;
            this.createsJoinRequest = createsJoinRequest;
            this.isPublic = isPublic;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinkMember extends Object {
        public static final int CONSTRUCTOR = -1409060582;
        public long userId;
        public int joinedChatDate;
        public long approverUserId;

        public ChatInviteLinkMember() {
        }

        public ChatInviteLinkMember(long userId, int joinedChatDate, long approverUserId) {
            this.userId = userId;
            this.joinedChatDate = joinedChatDate;
            this.approverUserId = approverUserId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinkMembers extends Object {
        public static final int CONSTRUCTOR = 315635051;
        public int totalCount;
        public ChatInviteLinkMember[] members;

        public ChatInviteLinkMembers() {
        }

        public ChatInviteLinkMembers(int totalCount, ChatInviteLinkMember[] members) {
            this.totalCount = totalCount;
            this.members = members;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatInviteLinks extends Object {
        public static final int CONSTRUCTOR = 112891427;
        public int totalCount;
        public ChatInviteLink[] inviteLinks;

        public ChatInviteLinks() {
        }

        public ChatInviteLinks(int totalCount, ChatInviteLink[] inviteLinks) {
            this.totalCount = totalCount;
            this.inviteLinks = inviteLinks;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatJoinRequest extends Object {
        public static final int CONSTRUCTOR = 59341416;
        public long userId;
        public int date;
        public String bio;

        public ChatJoinRequest() {
        }

        public ChatJoinRequest(long userId, int date, String bio) {
            this.userId = userId;
            this.date = date;
            this.bio = bio;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatJoinRequests extends Object {
        public static final int CONSTRUCTOR = 1291680519;
        public int totalCount;
        public ChatJoinRequest[] requests;

        public ChatJoinRequests() {
        }

        public ChatJoinRequests(int totalCount, ChatJoinRequest[] requests) {
            this.totalCount = totalCount;
            this.requests = requests;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatJoinRequestsInfo extends Object {
        public static final int CONSTRUCTOR = 888534463;
        public int totalCount;
        public long[] userIds;

        public ChatJoinRequestsInfo() {
        }

        public ChatJoinRequestsInfo(int totalCount, long[] userIds) {
            this.totalCount = totalCount;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatList extends Object {
    }

    public static class ChatListMain extends ChatList {

        public static final int CONSTRUCTOR = -400991316;

        public ChatListMain() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatListArchive extends ChatList {

        public static final int CONSTRUCTOR = 362770115;

        public ChatListArchive() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatListFilter extends ChatList {
        public static final int CONSTRUCTOR = -2022707655;
        public int chatFilterId;

        public ChatListFilter() {
        }

        public ChatListFilter(int chatFilterId) {
            this.chatFilterId = chatFilterId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatLists extends Object {
        public static final int CONSTRUCTOR = -258292771;
        public ChatList[] chatLists;

        public ChatLists() {
        }

        public ChatLists(ChatList[] chatLists) {
            this.chatLists = chatLists;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatLocation extends Object {
        public static final int CONSTRUCTOR = -1566863583;
        public Location location;
        public String address;

        public ChatLocation() {
        }

        public ChatLocation(Location location, String address) {
            this.location = location;
            this.address = address;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMember extends Object {
        public static final int CONSTRUCTOR = 1829953909;
        public MessageSender memberId;
        public long inviterUserId;
        public int joinedChatDate;
        public ChatMemberStatus status;

        public ChatMember() {
        }

        public ChatMember(MessageSender memberId, long inviterUserId, int joinedChatDate, ChatMemberStatus status) {
            this.memberId = memberId;
            this.inviterUserId = inviterUserId;
            this.joinedChatDate = joinedChatDate;
            this.status = status;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatMemberStatus extends Object {
    }

    public static class ChatMemberStatusCreator extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -160019714;
        public String customTitle;
        public boolean isAnonymous;
        public boolean isMember;

        public ChatMemberStatusCreator() {
        }

        public ChatMemberStatusCreator(String customTitle, boolean isAnonymous, boolean isMember) {
            this.customTitle = customTitle;
            this.isAnonymous = isAnonymous;
            this.isMember = isMember;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusAdministrator extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -70024163;
        public String customTitle;
        public boolean canBeEdited;
        public ChatAdministratorRights rights;

        public ChatMemberStatusAdministrator() {
        }

        public ChatMemberStatusAdministrator(String customTitle, boolean canBeEdited, ChatAdministratorRights rights) {
            this.customTitle = customTitle;
            this.canBeEdited = canBeEdited;
            this.rights = rights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusMember extends ChatMemberStatus {

        public static final int CONSTRUCTOR = 844723285;

        public ChatMemberStatusMember() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusRestricted extends ChatMemberStatus {
        public static final int CONSTRUCTOR = 1661432998;
        public boolean isMember;
        public int restrictedUntilDate;
        public ChatPermissions permissions;

        public ChatMemberStatusRestricted() {
        }

        public ChatMemberStatusRestricted(boolean isMember, int restrictedUntilDate, ChatPermissions permissions) {
            this.isMember = isMember;
            this.restrictedUntilDate = restrictedUntilDate;
            this.permissions = permissions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusLeft extends ChatMemberStatus {

        public static final int CONSTRUCTOR = -5815259;

        public ChatMemberStatusLeft() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMemberStatusBanned extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -1653518666;
        public int bannedUntilDate;

        public ChatMemberStatusBanned() {
        }

        public ChatMemberStatusBanned(int bannedUntilDate) {
            this.bannedUntilDate = bannedUntilDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembers extends Object {
        public static final int CONSTRUCTOR = -497558622;
        public int totalCount;
        public ChatMember[] members;

        public ChatMembers() {
        }

        public ChatMembers(int totalCount, ChatMember[] members) {
            this.totalCount = totalCount;
            this.members = members;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatMembersFilter extends Object {
    }

    public static class ChatMembersFilterContacts extends ChatMembersFilter {

        public static final int CONSTRUCTOR = 1774485671;

        public ChatMembersFilterContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterAdministrators extends ChatMembersFilter {

        public static final int CONSTRUCTOR = -1266893796;

        public ChatMembersFilterAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterMembers extends ChatMembersFilter {

        public static final int CONSTRUCTOR = 670504342;

        public ChatMembersFilterMembers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterMention extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 856419831;
        public long messageThreadId;

        public ChatMembersFilterMention() {
        }

        public ChatMembersFilterMention(long messageThreadId) {
            this.messageThreadId = messageThreadId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterRestricted extends ChatMembersFilter {

        public static final int CONSTRUCTOR = 1256282813;

        public ChatMembersFilterRestricted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterBanned extends ChatMembersFilter {

        public static final int CONSTRUCTOR = -1863102648;

        public ChatMembersFilterBanned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatMembersFilterBots extends ChatMembersFilter {

        public static final int CONSTRUCTOR = -1422567288;

        public ChatMembersFilterBots() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatNearby extends Object {
        public static final int CONSTRUCTOR = 48120405;
        public long chatId;
        public int distance;

        public ChatNearby() {
        }

        public ChatNearby(long chatId, int distance) {
            this.chatId = chatId;
            this.distance = distance;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatNotificationSettings extends Object {
        public static final int CONSTRUCTOR = 944322400;
        public boolean useDefaultMuteFor;
        public int muteFor;
        public boolean useDefaultSound;
        public long soundId;
        public boolean useDefaultShowPreview;
        public boolean showPreview;
        public boolean useDefaultDisablePinnedMessageNotifications;
        public boolean disablePinnedMessageNotifications;
        public boolean useDefaultDisableMentionNotifications;
        public boolean disableMentionNotifications;

        public ChatNotificationSettings() {
        }

        public ChatNotificationSettings(boolean useDefaultMuteFor, int muteFor, boolean useDefaultSound, long soundId, boolean useDefaultShowPreview, boolean showPreview, boolean useDefaultDisablePinnedMessageNotifications, boolean disablePinnedMessageNotifications, boolean useDefaultDisableMentionNotifications, boolean disableMentionNotifications) {
            this.useDefaultMuteFor = useDefaultMuteFor;
            this.muteFor = muteFor;
            this.useDefaultSound = useDefaultSound;
            this.soundId = soundId;
            this.useDefaultShowPreview = useDefaultShowPreview;
            this.showPreview = showPreview;
            this.useDefaultDisablePinnedMessageNotifications = useDefaultDisablePinnedMessageNotifications;
            this.disablePinnedMessageNotifications = disablePinnedMessageNotifications;
            this.useDefaultDisableMentionNotifications = useDefaultDisableMentionNotifications;
            this.disableMentionNotifications = disableMentionNotifications;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatPermissions extends Object {
        public static final int CONSTRUCTOR = 1584650463;
        public boolean canSendMessages;
        public boolean canSendMediaMessages;
        public boolean canSendPolls;
        public boolean canSendOtherMessages;
        public boolean canAddWebPagePreviews;
        public boolean canChangeInfo;
        public boolean canInviteUsers;
        public boolean canPinMessages;

        public ChatPermissions() {
        }

        public ChatPermissions(boolean canSendMessages, boolean canSendMediaMessages, boolean canSendPolls, boolean canSendOtherMessages, boolean canAddWebPagePreviews, boolean canChangeInfo, boolean canInviteUsers, boolean canPinMessages) {
            this.canSendMessages = canSendMessages;
            this.canSendMediaMessages = canSendMediaMessages;
            this.canSendPolls = canSendPolls;
            this.canSendOtherMessages = canSendOtherMessages;
            this.canAddWebPagePreviews = canAddWebPagePreviews;
            this.canChangeInfo = canChangeInfo;
            this.canInviteUsers = canInviteUsers;
            this.canPinMessages = canPinMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatPhoto extends Object {
        public static final int CONSTRUCTOR = 1854980206;
        public long id;
        public int addedDate;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;
        public AnimatedChatPhoto animation;
        public AnimatedChatPhoto smallAnimation;

        public ChatPhoto() {
        }

        public ChatPhoto(long id, int addedDate, Minithumbnail minithumbnail, PhotoSize[] sizes, AnimatedChatPhoto animation, AnimatedChatPhoto smallAnimation) {
            this.id = id;
            this.addedDate = addedDate;
            this.minithumbnail = minithumbnail;
            this.sizes = sizes;
            this.animation = animation;
            this.smallAnimation = smallAnimation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatPhotoInfo extends Object {
        public static final int CONSTRUCTOR = 167058358;
        public File small;
        public File big;
        public Minithumbnail minithumbnail;
        public boolean hasAnimation;

        public ChatPhotoInfo() {
        }

        public ChatPhotoInfo(File small, File big, Minithumbnail minithumbnail, boolean hasAnimation) {
            this.small = small;
            this.big = big;
            this.minithumbnail = minithumbnail;
            this.hasAnimation = hasAnimation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatPhotos extends Object {
        public static final int CONSTRUCTOR = -1510699180;
        public int totalCount;
        public ChatPhoto[] photos;

        public ChatPhotos() {
        }

        public ChatPhotos(int totalCount, ChatPhoto[] photos) {
            this.totalCount = totalCount;
            this.photos = photos;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatPosition extends Object {
        public static final int CONSTRUCTOR = -622557355;
        public ChatList list;
        public long order;
        public boolean isPinned;
        public ChatSource source;

        public ChatPosition() {
        }

        public ChatPosition(ChatList list, long order, boolean isPinned, ChatSource source) {
            this.list = list;
            this.order = order;
            this.isPinned = isPinned;
            this.source = source;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatReportReason extends Object {
    }

    public static class ChatReportReasonSpam extends ChatReportReason {

        public static final int CONSTRUCTOR = -510848863;

        public ChatReportReasonSpam() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonViolence extends ChatReportReason {

        public static final int CONSTRUCTOR = -1330235395;

        public ChatReportReasonViolence() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonPornography extends ChatReportReason {

        public static final int CONSTRUCTOR = 722614385;

        public ChatReportReasonPornography() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonChildAbuse extends ChatReportReason {

        public static final int CONSTRUCTOR = -1070686531;

        public ChatReportReasonChildAbuse() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonCopyright extends ChatReportReason {

        public static final int CONSTRUCTOR = 986898080;

        public ChatReportReasonCopyright() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonUnrelatedLocation extends ChatReportReason {

        public static final int CONSTRUCTOR = 2632403;

        public ChatReportReasonUnrelatedLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonFake extends ChatReportReason {

        public static final int CONSTRUCTOR = -1713230446;

        public ChatReportReasonFake() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonIllegalDrugs extends ChatReportReason {

        public static final int CONSTRUCTOR = -844539307;

        public ChatReportReasonIllegalDrugs() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonPersonalDetails extends ChatReportReason {

        public static final int CONSTRUCTOR = 1121159029;

        public ChatReportReasonPersonalDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatReportReasonCustom extends ChatReportReason {

        public static final int CONSTRUCTOR = 1288925974;

        public ChatReportReasonCustom() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatSource extends Object {
    }

    public static class ChatSourceMtprotoProxy extends ChatSource {

        public static final int CONSTRUCTOR = 394074115;

        public ChatSourceMtprotoProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatSourcePublicServiceAnnouncement extends ChatSource {
        public static final int CONSTRUCTOR = -328571244;
        public String type;
        public String text;

        public ChatSourcePublicServiceAnnouncement() {
        }

        public ChatSourcePublicServiceAnnouncement(String type, String text) {
            this.type = type;
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatStatistics extends Object {
    }

    public static class ChatStatisticsSupergroup extends ChatStatistics {
        public static final int CONSTRUCTOR = -17244633;
        public DateRange period;
        public StatisticalValue memberCount;
        public StatisticalValue messageCount;
        public StatisticalValue viewerCount;
        public StatisticalValue senderCount;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph languageGraph;
        public StatisticalGraph messageContentGraph;
        public StatisticalGraph actionGraph;
        public StatisticalGraph dayGraph;
        public StatisticalGraph weekGraph;
        public ChatStatisticsMessageSenderInfo[] topSenders;
        public ChatStatisticsAdministratorActionsInfo[] topAdministrators;
        public ChatStatisticsInviterInfo[] topInviters;

        public ChatStatisticsSupergroup() {
        }

        public ChatStatisticsSupergroup(DateRange period, StatisticalValue memberCount, StatisticalValue messageCount, StatisticalValue viewerCount, StatisticalValue senderCount, StatisticalGraph memberCountGraph, StatisticalGraph joinGraph, StatisticalGraph joinBySourceGraph, StatisticalGraph languageGraph, StatisticalGraph messageContentGraph, StatisticalGraph actionGraph, StatisticalGraph dayGraph, StatisticalGraph weekGraph, ChatStatisticsMessageSenderInfo[] topSenders, ChatStatisticsAdministratorActionsInfo[] topAdministrators, ChatStatisticsInviterInfo[] topInviters) {
            this.period = period;
            this.memberCount = memberCount;
            this.messageCount = messageCount;
            this.viewerCount = viewerCount;
            this.senderCount = senderCount;
            this.memberCountGraph = memberCountGraph;
            this.joinGraph = joinGraph;
            this.joinBySourceGraph = joinBySourceGraph;
            this.languageGraph = languageGraph;
            this.messageContentGraph = messageContentGraph;
            this.actionGraph = actionGraph;
            this.dayGraph = dayGraph;
            this.weekGraph = weekGraph;
            this.topSenders = topSenders;
            this.topAdministrators = topAdministrators;
            this.topInviters = topInviters;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatStatisticsChannel extends ChatStatistics {
        public static final int CONSTRUCTOR = -825434183;
        public DateRange period;
        public StatisticalValue memberCount;
        public StatisticalValue meanViewCount;
        public StatisticalValue meanShareCount;
        public double enabledNotificationsPercentage;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph muteGraph;
        public StatisticalGraph viewCountByHourGraph;
        public StatisticalGraph viewCountBySourceGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph languageGraph;
        public StatisticalGraph messageInteractionGraph;
        public StatisticalGraph instantViewInteractionGraph;
        public ChatStatisticsMessageInteractionInfo[] recentMessageInteractions;

        public ChatStatisticsChannel() {
        }

        public ChatStatisticsChannel(DateRange period, StatisticalValue memberCount, StatisticalValue meanViewCount, StatisticalValue meanShareCount, double enabledNotificationsPercentage, StatisticalGraph memberCountGraph, StatisticalGraph joinGraph, StatisticalGraph muteGraph, StatisticalGraph viewCountByHourGraph, StatisticalGraph viewCountBySourceGraph, StatisticalGraph joinBySourceGraph, StatisticalGraph languageGraph, StatisticalGraph messageInteractionGraph, StatisticalGraph instantViewInteractionGraph, ChatStatisticsMessageInteractionInfo[] recentMessageInteractions) {
            this.period = period;
            this.memberCount = memberCount;
            this.meanViewCount = meanViewCount;
            this.meanShareCount = meanShareCount;
            this.enabledNotificationsPercentage = enabledNotificationsPercentage;
            this.memberCountGraph = memberCountGraph;
            this.joinGraph = joinGraph;
            this.muteGraph = muteGraph;
            this.viewCountByHourGraph = viewCountByHourGraph;
            this.viewCountBySourceGraph = viewCountBySourceGraph;
            this.joinBySourceGraph = joinBySourceGraph;
            this.languageGraph = languageGraph;
            this.messageInteractionGraph = messageInteractionGraph;
            this.instantViewInteractionGraph = instantViewInteractionGraph;
            this.recentMessageInteractions = recentMessageInteractions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatStatisticsAdministratorActionsInfo extends Object {
        public static final int CONSTRUCTOR = -406467202;
        public long userId;
        public int deletedMessageCount;
        public int bannedUserCount;
        public int restrictedUserCount;

        public ChatStatisticsAdministratorActionsInfo() {
        }

        public ChatStatisticsAdministratorActionsInfo(long userId, int deletedMessageCount, int bannedUserCount, int restrictedUserCount) {
            this.userId = userId;
            this.deletedMessageCount = deletedMessageCount;
            this.bannedUserCount = bannedUserCount;
            this.restrictedUserCount = restrictedUserCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatStatisticsInviterInfo extends Object {
        public static final int CONSTRUCTOR = 629396619;
        public long userId;
        public int addedMemberCount;

        public ChatStatisticsInviterInfo() {
        }

        public ChatStatisticsInviterInfo(long userId, int addedMemberCount) {
            this.userId = userId;
            this.addedMemberCount = addedMemberCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatStatisticsMessageInteractionInfo extends Object {
        public static final int CONSTRUCTOR = -765580756;
        public long messageId;
        public int viewCount;
        public int forwardCount;

        public ChatStatisticsMessageInteractionInfo() {
        }

        public ChatStatisticsMessageInteractionInfo(long messageId, int viewCount, int forwardCount) {
            this.messageId = messageId;
            this.viewCount = viewCount;
            this.forwardCount = forwardCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatStatisticsMessageSenderInfo extends Object {
        public static final int CONSTRUCTOR = 1762295371;
        public long userId;
        public int sentMessageCount;
        public int averageCharacterCount;

        public ChatStatisticsMessageSenderInfo() {
        }

        public ChatStatisticsMessageSenderInfo(long userId, int sentMessageCount, int averageCharacterCount) {
            this.userId = userId;
            this.sentMessageCount = sentMessageCount;
            this.averageCharacterCount = averageCharacterCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatTheme extends Object {
        public static final int CONSTRUCTOR = -113218503;
        public String name;
        public ThemeSettings lightSettings;
        public ThemeSettings darkSettings;

        public ChatTheme() {
        }

        public ChatTheme(String name, ThemeSettings lightSettings, ThemeSettings darkSettings) {
            this.name = name;
            this.lightSettings = lightSettings;
            this.darkSettings = darkSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ChatType extends Object {
    }

    public static class ChatTypePrivate extends ChatType {
        public static final int CONSTRUCTOR = 1579049844;
        public long userId;

        public ChatTypePrivate() {
        }

        public ChatTypePrivate(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatTypeBasicGroup extends ChatType {
        public static final int CONSTRUCTOR = 973884508;
        public long basicGroupId;

        public ChatTypeBasicGroup() {
        }

        public ChatTypeBasicGroup(long basicGroupId) {
            this.basicGroupId = basicGroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatTypeSupergroup extends ChatType {
        public static final int CONSTRUCTOR = -1472570774;
        public long supergroupId;
        public boolean isChannel;

        public ChatTypeSupergroup() {
        }

        public ChatTypeSupergroup(long supergroupId, boolean isChannel) {
            this.supergroupId = supergroupId;
            this.isChannel = isChannel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatTypeSecret extends ChatType {
        public static final int CONSTRUCTOR = 862366513;
        public int secretChatId;
        public long userId;

        public ChatTypeSecret() {
        }

        public ChatTypeSecret(int secretChatId, long userId) {
            this.secretChatId = secretChatId;
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Chats extends Object {
        public static final int CONSTRUCTOR = 1809654812;
        public int totalCount;
        public long[] chatIds;

        public Chats() {
        }

        public Chats(int totalCount, long[] chatIds) {
            this.totalCount = totalCount;
            this.chatIds = chatIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChatsNearby extends Object {
        public static final int CONSTRUCTOR = 187746081;
        public ChatNearby[] usersNearby;
        public ChatNearby[] supergroupsNearby;

        public ChatsNearby() {
        }

        public ChatsNearby(ChatNearby[] usersNearby, ChatNearby[] supergroupsNearby) {
            this.usersNearby = usersNearby;
            this.supergroupsNearby = supergroupsNearby;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CheckChatUsernameResult extends Object {
    }

    public static class CheckChatUsernameResultOk extends CheckChatUsernameResult {

        public static final int CONSTRUCTOR = -1498956964;

        public CheckChatUsernameResultOk() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultUsernameInvalid extends CheckChatUsernameResult {

        public static final int CONSTRUCTOR = -636979370;

        public CheckChatUsernameResultUsernameInvalid() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultUsernameOccupied extends CheckChatUsernameResult {

        public static final int CONSTRUCTOR = 1320892201;

        public CheckChatUsernameResultUsernameOccupied() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultPublicChatsTooMuch extends CheckChatUsernameResult {

        public static final int CONSTRUCTOR = 858247741;

        public CheckChatUsernameResultPublicChatsTooMuch() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsernameResultPublicGroupsUnavailable extends CheckChatUsernameResult {

        public static final int CONSTRUCTOR = -51833641;

        public CheckChatUsernameResultPublicGroupsUnavailable() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class CheckStickerSetNameResult extends Object {
    }

    public static class CheckStickerSetNameResultOk extends CheckStickerSetNameResult {

        public static final int CONSTRUCTOR = -1404308904;

        public CheckStickerSetNameResultOk() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckStickerSetNameResultNameInvalid extends CheckStickerSetNameResult {

        public static final int CONSTRUCTOR = 177992244;

        public CheckStickerSetNameResultNameInvalid() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckStickerSetNameResultNameOccupied extends CheckStickerSetNameResult {

        public static final int CONSTRUCTOR = 1012980872;

        public CheckStickerSetNameResultNameOccupied() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClosedVectorPath extends Object {
        public static final int CONSTRUCTOR = 589951657;
        public VectorPathCommand[] commands;

        public ClosedVectorPath() {
        }

        public ClosedVectorPath(VectorPathCommand[] commands) {
            this.commands = commands;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectedWebsite extends Object {
        public static final int CONSTRUCTOR = 844014445;
        public long id;
        public String domainName;
        public long botUserId;
        public String browser;
        public String platform;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String location;

        public ConnectedWebsite() {
        }

        public ConnectedWebsite(long id, String domainName, long botUserId, String browser, String platform, int logInDate, int lastActiveDate, String ip, String location) {
            this.id = id;
            this.domainName = domainName;
            this.botUserId = botUserId;
            this.browser = browser;
            this.platform = platform;
            this.logInDate = logInDate;
            this.lastActiveDate = lastActiveDate;
            this.ip = ip;
            this.location = location;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectedWebsites extends Object {
        public static final int CONSTRUCTOR = -1727949694;
        public ConnectedWebsite[] websites;

        public ConnectedWebsites() {
        }

        public ConnectedWebsites(ConnectedWebsite[] websites) {
            this.websites = websites;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ConnectionState extends Object {
    }

    public static class ConnectionStateWaitingForNetwork extends ConnectionState {

        public static final int CONSTRUCTOR = 1695405912;

        public ConnectionStateWaitingForNetwork() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateConnectingToProxy extends ConnectionState {

        public static final int CONSTRUCTOR = -93187239;

        public ConnectionStateConnectingToProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateConnecting extends ConnectionState {

        public static final int CONSTRUCTOR = -1298400670;

        public ConnectionStateConnecting() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateUpdating extends ConnectionState {

        public static final int CONSTRUCTOR = -188104009;

        public ConnectionStateUpdating() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConnectionStateReady extends ConnectionState {

        public static final int CONSTRUCTOR = 48608492;

        public ConnectionStateReady() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Contact extends Object {
        public static final int CONSTRUCTOR = -1993844876;
        public String phoneNumber;
        public String firstName;
        public String lastName;
        public String vcard;
        public long userId;

        public Contact() {
        }

        public Contact(String phoneNumber, String firstName, String lastName, String vcard, long userId) {
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.vcard = vcard;
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Count extends Object {
        public static final int CONSTRUCTOR = 1295577348;
        public int count;

        public Count() {
        }

        public Count(int count) {
            this.count = count;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Countries extends Object {
        public static final int CONSTRUCTOR = 1854211813;
        public CountryInfo[] countries;

        public Countries() {
        }

        public Countries(CountryInfo[] countries) {
            this.countries = countries;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CountryInfo extends Object {
        public static final int CONSTRUCTOR = 1617195722;
        public String countryCode;
        public String name;
        public String englishName;
        public boolean isHidden;
        public String[] callingCodes;

        public CountryInfo() {
        }

        public CountryInfo(String countryCode, String name, String englishName, boolean isHidden, String[] callingCodes) {
            this.countryCode = countryCode;
            this.name = name;
            this.englishName = englishName;
            this.isHidden = isHidden;
            this.callingCodes = callingCodes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CustomRequestResult extends Object {
        public static final int CONSTRUCTOR = -2009960452;
        public String result;

        public CustomRequestResult() {
        }

        public CustomRequestResult(String result) {
            this.result = result;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DatabaseStatistics extends Object {
        public static final int CONSTRUCTOR = -1123912880;
        public String statistics;

        public DatabaseStatistics() {
        }

        public DatabaseStatistics(String statistics) {
            this.statistics = statistics;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Date extends Object {
        public static final int CONSTRUCTOR = -277956960;
        public int day;
        public int month;
        public int year;

        public Date() {
        }

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DateRange extends Object {
        public static final int CONSTRUCTOR = 1360333926;
        public int startDate;
        public int endDate;

        public DateRange() {
        }

        public DateRange(int startDate, int endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DatedFile extends Object {
        public static final int CONSTRUCTOR = -1840795491;
        public File file;
        public int date;

        public DatedFile() {
        }

        public DatedFile(File file, int date) {
            this.file = file;
            this.date = date;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeepLinkInfo extends Object {
        public static final int CONSTRUCTOR = 1864081662;
        public FormattedText text;
        public boolean needUpdateApplication;

        public DeepLinkInfo() {
        }

        public DeepLinkInfo(FormattedText text, boolean needUpdateApplication) {
            this.text = text;
            this.needUpdateApplication = needUpdateApplication;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class DeviceToken extends Object {
    }

    public static class DeviceTokenFirebaseCloudMessaging extends DeviceToken {
        public static final int CONSTRUCTOR = -797881849;
        public String token;
        public boolean encrypt;

        public DeviceTokenFirebaseCloudMessaging() {
        }

        public DeviceTokenFirebaseCloudMessaging(String token, boolean encrypt) {
            this.token = token;
            this.encrypt = encrypt;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenApplePush extends DeviceToken {
        public static final int CONSTRUCTOR = 387541955;
        public String deviceToken;
        public boolean isAppSandbox;

        public DeviceTokenApplePush() {
        }

        public DeviceTokenApplePush(String deviceToken, boolean isAppSandbox) {
            this.deviceToken = deviceToken;
            this.isAppSandbox = isAppSandbox;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenApplePushVoIP extends DeviceToken {
        public static final int CONSTRUCTOR = 804275689;
        public String deviceToken;
        public boolean isAppSandbox;
        public boolean encrypt;

        public DeviceTokenApplePushVoIP() {
        }

        public DeviceTokenApplePushVoIP(String deviceToken, boolean isAppSandbox, boolean encrypt) {
            this.deviceToken = deviceToken;
            this.isAppSandbox = isAppSandbox;
            this.encrypt = encrypt;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenWindowsPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1410514289;
        public String accessToken;

        public DeviceTokenWindowsPush() {
        }

        public DeviceTokenWindowsPush(String accessToken) {
            this.accessToken = accessToken;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenMicrosoftPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1224269900;
        public String channelUri;

        public DeviceTokenMicrosoftPush() {
        }

        public DeviceTokenMicrosoftPush(String channelUri) {
            this.channelUri = channelUri;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenMicrosoftPushVoIP extends DeviceToken {
        public static final int CONSTRUCTOR = -785603759;
        public String channelUri;

        public DeviceTokenMicrosoftPushVoIP() {
        }

        public DeviceTokenMicrosoftPushVoIP(String channelUri) {
            this.channelUri = channelUri;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenWebPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1694507273;
        public String endpoint;
        public String p256dhBase64url;
        public String authBase64url;

        public DeviceTokenWebPush() {
        }

        public DeviceTokenWebPush(String endpoint, String p256dhBase64url, String authBase64url) {
            this.endpoint = endpoint;
            this.p256dhBase64url = p256dhBase64url;
            this.authBase64url = authBase64url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenSimplePush extends DeviceToken {
        public static final int CONSTRUCTOR = 49584736;
        public String endpoint;

        public DeviceTokenSimplePush() {
        }

        public DeviceTokenSimplePush(String endpoint) {
            this.endpoint = endpoint;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenUbuntuPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1782320422;
        public String token;

        public DeviceTokenUbuntuPush() {
        }

        public DeviceTokenUbuntuPush(String token) {
            this.token = token;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenBlackBerryPush extends DeviceToken {
        public static final int CONSTRUCTOR = 1559167234;
        public String token;

        public DeviceTokenBlackBerryPush() {
        }

        public DeviceTokenBlackBerryPush(String token) {
            this.token = token;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeviceTokenTizenPush extends DeviceToken {
        public static final int CONSTRUCTOR = -1359947213;
        public String regId;

        public DeviceTokenTizenPush() {
        }

        public DeviceTokenTizenPush(String regId) {
            this.regId = regId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class DiceStickers extends Object {
    }

    public static class DiceStickersRegular extends DiceStickers {
        public static final int CONSTRUCTOR = -740299570;
        public Sticker sticker;

        public DiceStickersRegular() {
        }

        public DiceStickersRegular(Sticker sticker) {
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DiceStickersSlotMachine extends DiceStickers {
        public static final int CONSTRUCTOR = -375223124;
        public Sticker background;
        public Sticker lever;
        public Sticker leftReel;
        public Sticker centerReel;
        public Sticker rightReel;

        public DiceStickersSlotMachine() {
        }

        public DiceStickersSlotMachine(Sticker background, Sticker lever, Sticker leftReel, Sticker centerReel, Sticker rightReel) {
            this.background = background;
            this.lever = lever;
            this.leftReel = leftReel;
            this.centerReel = centerReel;
            this.rightReel = rightReel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Document extends Object {
        public static final int CONSTRUCTOR = -1357271080;
        public String fileName;
        public String mimeType;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File document;

        public Document() {
        }

        public Document(String fileName, String mimeType, Minithumbnail minithumbnail, Thumbnail thumbnail, File document) {
            this.fileName = fileName;
            this.mimeType = mimeType;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.document = document;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DownloadedFileCounts extends Object {
        public static final int CONSTRUCTOR = -1973999550;
        public int activeCount;
        public int pausedCount;
        public int completedCount;

        public DownloadedFileCounts() {
        }

        public DownloadedFileCounts(int activeCount, int pausedCount, int completedCount) {
            this.activeCount = activeCount;
            this.pausedCount = pausedCount;
            this.completedCount = completedCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DraftMessage extends Object {
        public static final int CONSTRUCTOR = 1373050112;
        public long replyToMessageId;
        public int date;
        public InputMessageContent inputMessageText;

        public DraftMessage() {
        }

        public DraftMessage(long replyToMessageId, int date, InputMessageContent inputMessageText) {
            this.replyToMessageId = replyToMessageId;
            this.date = date;
            this.inputMessageText = inputMessageText;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EmailAddressAuthenticationCodeInfo extends Object {
        public static final int CONSTRUCTOR = 1151066659;
        public String emailAddressPattern;
        public int length;

        public EmailAddressAuthenticationCodeInfo() {
        }

        public EmailAddressAuthenticationCodeInfo(String emailAddressPattern, int length) {
            this.emailAddressPattern = emailAddressPattern;
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Emojis extends Object {
        public static final int CONSTRUCTOR = 950339552;
        public String[] emojis;

        public Emojis() {
        }

        public Emojis(String[] emojis) {
            this.emojis = emojis;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EncryptedCredentials extends Object {
        public static final int CONSTRUCTOR = 1331106766;
        public byte[] data;
        public byte[] hash;
        public byte[] secret;

        public EncryptedCredentials() {
        }

        public EncryptedCredentials(byte[] data, byte[] hash, byte[] secret) {
            this.data = data;
            this.hash = hash;
            this.secret = secret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EncryptedPassportElement extends Object {
        public static final int CONSTRUCTOR = 2002386193;
        public PassportElementType type;
        public byte[] data;
        public DatedFile frontSide;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;
        public DatedFile[] files;
        public String value;
        public String hash;

        public EncryptedPassportElement() {
        }

        public EncryptedPassportElement(PassportElementType type, byte[] data, DatedFile frontSide, DatedFile reverseSide, DatedFile selfie, DatedFile[] translation, DatedFile[] files, String value, String hash) {
            this.type = type;
            this.data = data;
            this.frontSide = frontSide;
            this.reverseSide = reverseSide;
            this.selfie = selfie;
            this.translation = translation;
            this.files = files;
            this.value = value;
            this.hash = hash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Error extends Object {
        public static final int CONSTRUCTOR = -1679978726;
        public int code;
        public String message;

        public Error() {
        }

        public Error(int code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class File extends Object {
        public static final int CONSTRUCTOR = 1263291956;
        public int id;
        public long size;
        public long expectedSize;
        public LocalFile local;
        public RemoteFile remote;

        public File() {
        }

        public File(int id, long size, long expectedSize, LocalFile local, RemoteFile remote) {
            this.id = id;
            this.size = size;
            this.expectedSize = expectedSize;
            this.local = local;
            this.remote = remote;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileDownload extends Object {
        public static final int CONSTRUCTOR = -2092100780;
        public int fileId;
        public Message message;
        public int addDate;
        public int completeDate;
        public boolean isPaused;

        public FileDownload() {
        }

        public FileDownload(int fileId, Message message, int addDate, int completeDate, boolean isPaused) {
            this.fileId = fileId;
            this.message = message;
            this.addDate = addDate;
            this.completeDate = completeDate;
            this.isPaused = isPaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileDownloadedPrefixSize extends Object {
        public static final int CONSTRUCTOR = -2015205381;
        public long size;

        public FileDownloadedPrefixSize() {
        }

        public FileDownloadedPrefixSize(long size) {
            this.size = size;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FilePart extends Object {
        public static final int CONSTRUCTOR = 911821878;
        public byte[] data;

        public FilePart() {
        }

        public FilePart(byte[] data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class FileType extends Object {
    }

    public static class FileTypeNone extends FileType {

        public static final int CONSTRUCTOR = 2003009189;

        public FileTypeNone() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeAnimation extends FileType {

        public static final int CONSTRUCTOR = -290816582;

        public FileTypeAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeAudio extends FileType {

        public static final int CONSTRUCTOR = -709112160;

        public FileTypeAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeDocument extends FileType {

        public static final int CONSTRUCTOR = -564722929;

        public FileTypeDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeNotificationSound extends FileType {

        public static final int CONSTRUCTOR = -1020289271;

        public FileTypeNotificationSound() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypePhoto extends FileType {

        public static final int CONSTRUCTOR = -1718914651;

        public FileTypePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeProfilePhoto extends FileType {

        public static final int CONSTRUCTOR = 1795089315;

        public FileTypeProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecret extends FileType {

        public static final int CONSTRUCTOR = -1871899401;

        public FileTypeSecret() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecretThumbnail extends FileType {

        public static final int CONSTRUCTOR = -1401326026;

        public FileTypeSecretThumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSecure extends FileType {

        public static final int CONSTRUCTOR = -1419133146;

        public FileTypeSecure() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeSticker extends FileType {

        public static final int CONSTRUCTOR = 475233385;

        public FileTypeSticker() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeThumbnail extends FileType {

        public static final int CONSTRUCTOR = -12443298;

        public FileTypeThumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeUnknown extends FileType {

        public static final int CONSTRUCTOR = -2011566768;

        public FileTypeUnknown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVideo extends FileType {

        public static final int CONSTRUCTOR = 1430816539;

        public FileTypeVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVideoNote extends FileType {

        public static final int CONSTRUCTOR = -518412385;

        public FileTypeVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeVoiceNote extends FileType {

        public static final int CONSTRUCTOR = -588681661;

        public FileTypeVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FileTypeWallpaper extends FileType {

        public static final int CONSTRUCTOR = 1854930076;

        public FileTypeWallpaper() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FormattedText extends Object {
        public static final int CONSTRUCTOR = -252624564;
        public String text;
        public TextEntity[] entities;

        public FormattedText() {
        }

        public FormattedText(String text, TextEntity[] entities) {
            this.text = text;
            this.entities = entities;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FoundFileDownloads extends Object {
        public static final int CONSTRUCTOR = 1395890392;
        public DownloadedFileCounts totalCounts;
        public FileDownload[] files;
        public String nextOffset;

        public FoundFileDownloads() {
        }

        public FoundFileDownloads(DownloadedFileCounts totalCounts, FileDownload[] files, String nextOffset) {
            this.totalCounts = totalCounts;
            this.files = files;
            this.nextOffset = nextOffset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FoundMessages extends Object {
        public static final int CONSTRUCTOR = -529809608;
        public int totalCount;
        public Message[] messages;
        public String nextOffset;

        public FoundMessages() {
        }

        public FoundMessages(int totalCount, Message[] messages, String nextOffset) {
            this.totalCount = totalCount;
            this.messages = messages;
            this.nextOffset = nextOffset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Game extends Object {
        public static final int CONSTRUCTOR = -1565597752;
        public long id;
        public String shortName;
        public String title;
        public FormattedText text;
        public String description;
        public Photo photo;
        public Animation animation;

        public Game() {
        }

        public Game(long id, String shortName, String title, FormattedText text, String description, Photo photo, Animation animation) {
            this.id = id;
            this.shortName = shortName;
            this.title = title;
            this.text = text;
            this.description = description;
            this.photo = photo;
            this.animation = animation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GameHighScore extends Object {
        public static final int CONSTRUCTOR = 342871838;
        public int position;
        public long userId;
        public int score;

        public GameHighScore() {
        }

        public GameHighScore(int position, long userId, int score) {
            this.position = position;
            this.userId = userId;
            this.score = score;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GameHighScores extends Object {
        public static final int CONSTRUCTOR = -725770727;
        public GameHighScore[] scores;

        public GameHighScores() {
        }

        public GameHighScores(GameHighScore[] scores) {
            this.scores = scores;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCall extends Object {
        public static final int CONSTRUCTOR = -123443355;
        public int id;
        public String title;
        public int scheduledStartDate;
        public boolean enabledStartNotification;
        public boolean isActive;
        public boolean isRtmpStream;
        public boolean isJoined;
        public boolean needRejoin;
        public boolean canBeManaged;
        public int participantCount;
        public boolean hasHiddenListeners;
        public boolean loadedAllParticipants;
        public GroupCallRecentSpeaker[] recentSpeakers;
        public boolean isMyVideoEnabled;
        public boolean isMyVideoPaused;
        public boolean canEnableVideo;
        public boolean muteNewParticipants;
        public boolean canToggleMuteNewParticipants;
        public int recordDuration;
        public boolean isVideoRecorded;
        public int duration;

        public GroupCall() {
        }

        public GroupCall(int id, String title, int scheduledStartDate, boolean enabledStartNotification, boolean isActive, boolean isRtmpStream, boolean isJoined, boolean needRejoin, boolean canBeManaged, int participantCount, boolean hasHiddenListeners, boolean loadedAllParticipants, GroupCallRecentSpeaker[] recentSpeakers, boolean isMyVideoEnabled, boolean isMyVideoPaused, boolean canEnableVideo, boolean muteNewParticipants, boolean canToggleMuteNewParticipants, int recordDuration, boolean isVideoRecorded, int duration) {
            this.id = id;
            this.title = title;
            this.scheduledStartDate = scheduledStartDate;
            this.enabledStartNotification = enabledStartNotification;
            this.isActive = isActive;
            this.isRtmpStream = isRtmpStream;
            this.isJoined = isJoined;
            this.needRejoin = needRejoin;
            this.canBeManaged = canBeManaged;
            this.participantCount = participantCount;
            this.hasHiddenListeners = hasHiddenListeners;
            this.loadedAllParticipants = loadedAllParticipants;
            this.recentSpeakers = recentSpeakers;
            this.isMyVideoEnabled = isMyVideoEnabled;
            this.isMyVideoPaused = isMyVideoPaused;
            this.canEnableVideo = canEnableVideo;
            this.muteNewParticipants = muteNewParticipants;
            this.canToggleMuteNewParticipants = canToggleMuteNewParticipants;
            this.recordDuration = recordDuration;
            this.isVideoRecorded = isVideoRecorded;
            this.duration = duration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallId extends Object {
        public static final int CONSTRUCTOR = 350534469;
        public int id;

        public GroupCallId() {
        }

        public GroupCallId(int id) {
            this.id = id;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallParticipant extends Object {
        public static final int CONSTRUCTOR = 2059182571;
        public MessageSender participantId;
        public int audioSourceId;
        public int screenSharingAudioSourceId;
        public GroupCallParticipantVideoInfo videoInfo;
        public GroupCallParticipantVideoInfo screenSharingVideoInfo;
        public String bio;
        public boolean isCurrentUser;
        public boolean isSpeaking;
        public boolean isHandRaised;
        public boolean canBeMutedForAllUsers;
        public boolean canBeUnmutedForAllUsers;
        public boolean canBeMutedForCurrentUser;
        public boolean canBeUnmutedForCurrentUser;
        public boolean isMutedForAllUsers;
        public boolean isMutedForCurrentUser;
        public boolean canUnmuteSelf;
        public int volumeLevel;
        public String order;

        public GroupCallParticipant() {
        }

        public GroupCallParticipant(MessageSender participantId, int audioSourceId, int screenSharingAudioSourceId, GroupCallParticipantVideoInfo videoInfo, GroupCallParticipantVideoInfo screenSharingVideoInfo, String bio, boolean isCurrentUser, boolean isSpeaking, boolean isHandRaised, boolean canBeMutedForAllUsers, boolean canBeUnmutedForAllUsers, boolean canBeMutedForCurrentUser, boolean canBeUnmutedForCurrentUser, boolean isMutedForAllUsers, boolean isMutedForCurrentUser, boolean canUnmuteSelf, int volumeLevel, String order) {
            this.participantId = participantId;
            this.audioSourceId = audioSourceId;
            this.screenSharingAudioSourceId = screenSharingAudioSourceId;
            this.videoInfo = videoInfo;
            this.screenSharingVideoInfo = screenSharingVideoInfo;
            this.bio = bio;
            this.isCurrentUser = isCurrentUser;
            this.isSpeaking = isSpeaking;
            this.isHandRaised = isHandRaised;
            this.canBeMutedForAllUsers = canBeMutedForAllUsers;
            this.canBeUnmutedForAllUsers = canBeUnmutedForAllUsers;
            this.canBeMutedForCurrentUser = canBeMutedForCurrentUser;
            this.canBeUnmutedForCurrentUser = canBeUnmutedForCurrentUser;
            this.isMutedForAllUsers = isMutedForAllUsers;
            this.isMutedForCurrentUser = isMutedForCurrentUser;
            this.canUnmuteSelf = canUnmuteSelf;
            this.volumeLevel = volumeLevel;
            this.order = order;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallParticipantVideoInfo extends Object {
        public static final int CONSTRUCTOR = -14294645;
        public GroupCallVideoSourceGroup[] sourceGroups;
        public String endpointId;
        public boolean isPaused;

        public GroupCallParticipantVideoInfo() {
        }

        public GroupCallParticipantVideoInfo(GroupCallVideoSourceGroup[] sourceGroups, String endpointId, boolean isPaused) {
            this.sourceGroups = sourceGroups;
            this.endpointId = endpointId;
            this.isPaused = isPaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallRecentSpeaker extends Object {
        public static final int CONSTRUCTOR = 1819519436;
        public MessageSender participantId;
        public boolean isSpeaking;

        public GroupCallRecentSpeaker() {
        }

        public GroupCallRecentSpeaker(MessageSender participantId, boolean isSpeaking) {
            this.participantId = participantId;
            this.isSpeaking = isSpeaking;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallStream extends Object {
        public static final int CONSTRUCTOR = -264564795;
        public int channelId;
        public int scale;
        public long timeOffset;

        public GroupCallStream() {
        }

        public GroupCallStream(int channelId, int scale, long timeOffset) {
            this.channelId = channelId;
            this.scale = scale;
            this.timeOffset = timeOffset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallStreams extends Object {
        public static final int CONSTRUCTOR = -1032959578;
        public GroupCallStream[] streams;

        public GroupCallStreams() {
        }

        public GroupCallStreams(GroupCallStream[] streams) {
            this.streams = streams;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class GroupCallVideoQuality extends Object {
    }

    public static class GroupCallVideoQualityThumbnail extends GroupCallVideoQuality {

        public static final int CONSTRUCTOR = -379186304;

        public GroupCallVideoQualityThumbnail() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoQualityMedium extends GroupCallVideoQuality {

        public static final int CONSTRUCTOR = 394968234;

        public GroupCallVideoQualityMedium() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoQualityFull extends GroupCallVideoQuality {

        public static final int CONSTRUCTOR = -2125916617;

        public GroupCallVideoQualityFull() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GroupCallVideoSourceGroup extends Object {
        public static final int CONSTRUCTOR = -1190900785;
        public String semantics;
        public int[] sourceIds;

        public GroupCallVideoSourceGroup() {
        }

        public GroupCallVideoSourceGroup(String semantics, int[] sourceIds) {
            this.semantics = semantics;
            this.sourceIds = sourceIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Hashtags extends Object {
        public static final int CONSTRUCTOR = 676798885;
        public String[] hashtags;

        public Hashtags() {
        }

        public Hashtags(String[] hashtags) {
            this.hashtags = hashtags;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class HttpUrl extends Object {
        public static final int CONSTRUCTOR = -2018019930;
        public String url;

        public HttpUrl() {
        }

        public HttpUrl(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class IdentityDocument extends Object {
        public static final int CONSTRUCTOR = 445952972;
        public String number;
        public Date expiryDate;
        public DatedFile frontSide;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;

        public IdentityDocument() {
        }

        public IdentityDocument(String number, Date expiryDate, DatedFile frontSide, DatedFile reverseSide, DatedFile selfie, DatedFile[] translation) {
            this.number = number;
            this.expiryDate = expiryDate;
            this.frontSide = frontSide;
            this.reverseSide = reverseSide;
            this.selfie = selfie;
            this.translation = translation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportedContacts extends Object {
        public static final int CONSTRUCTOR = 2068432290;
        public long[] userIds;
        public int[] importerCount;

        public ImportedContacts() {
        }

        public ImportedContacts(long[] userIds, int[] importerCount) {
            this.userIds = userIds;
            this.importerCount = importerCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButton extends Object {
        public static final int CONSTRUCTOR = -372105704;
        public String text;
        public InlineKeyboardButtonType type;

        public InlineKeyboardButton() {
        }

        public InlineKeyboardButton(String text, InlineKeyboardButtonType type) {
            this.text = text;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InlineKeyboardButtonType extends Object {
    }

    public static class InlineKeyboardButtonTypeUrl extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1130741420;
        public String url;

        public InlineKeyboardButtonTypeUrl() {
        }

        public InlineKeyboardButtonTypeUrl(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeLoginUrl extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -1203413081;
        public String url;
        public long id;
        public String forwardText;

        public InlineKeyboardButtonTypeLoginUrl() {
        }

        public InlineKeyboardButtonTypeLoginUrl(String url, long id, String forwardText) {
            this.url = url;
            this.id = id;
            this.forwardText = forwardText;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeWebApp extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -1767471672;
        public String url;

        public InlineKeyboardButtonTypeWebApp() {
        }

        public InlineKeyboardButtonTypeWebApp(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeCallback extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -1127515139;
        public byte[] data;

        public InlineKeyboardButtonTypeCallback() {
        }

        public InlineKeyboardButtonTypeCallback(byte[] data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackWithPassword extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 908018248;
        public byte[] data;

        public InlineKeyboardButtonTypeCallbackWithPassword() {
        }

        public InlineKeyboardButtonTypeCallbackWithPassword(byte[] data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackGame extends InlineKeyboardButtonType {

        public static final int CONSTRUCTOR = -383429528;

        public InlineKeyboardButtonTypeCallbackGame() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeSwitchInline extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -2035563307;
        public String query;
        public boolean inCurrentChat;

        public InlineKeyboardButtonTypeSwitchInline() {
        }

        public InlineKeyboardButtonTypeSwitchInline(String query, boolean inCurrentChat) {
            this.query = query;
            this.inCurrentChat = inCurrentChat;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeBuy extends InlineKeyboardButtonType {

        public static final int CONSTRUCTOR = 1360739440;

        public InlineKeyboardButtonTypeBuy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineKeyboardButtonTypeUser extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1836574114;
        public long userId;

        public InlineKeyboardButtonTypeUser() {
        }

        public InlineKeyboardButtonTypeUser(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InlineQueryResult extends Object {
    }

    public static class InlineQueryResultArticle extends InlineQueryResult {
        public static final int CONSTRUCTOR = 206340825;
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public Thumbnail thumbnail;

        public InlineQueryResultArticle() {
        }

        public InlineQueryResultArticle(String id, String url, boolean hideUrl, String title, String description, Thumbnail thumbnail) {
            this.id = id;
            this.url = url;
            this.hideUrl = hideUrl;
            this.title = title;
            this.description = description;
            this.thumbnail = thumbnail;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultContact extends InlineQueryResult {
        public static final int CONSTRUCTOR = -181960174;
        public String id;
        public Contact contact;
        public Thumbnail thumbnail;

        public InlineQueryResultContact() {
        }

        public InlineQueryResultContact(String id, Contact contact, Thumbnail thumbnail) {
            this.id = id;
            this.contact = contact;
            this.thumbnail = thumbnail;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultLocation extends InlineQueryResult {
        public static final int CONSTRUCTOR = 466004752;
        public String id;
        public Location location;
        public String title;
        public Thumbnail thumbnail;

        public InlineQueryResultLocation() {
        }

        public InlineQueryResultLocation(String id, Location location, String title, Thumbnail thumbnail) {
            this.id = id;
            this.location = location;
            this.title = title;
            this.thumbnail = thumbnail;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultVenue extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1281036382;
        public String id;
        public Venue venue;
        public Thumbnail thumbnail;

        public InlineQueryResultVenue() {
        }

        public InlineQueryResultVenue(String id, Venue venue, Thumbnail thumbnail) {
            this.id = id;
            this.venue = venue;
            this.thumbnail = thumbnail;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultGame extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1706916987;
        public String id;
        public Game game;

        public InlineQueryResultGame() {
        }

        public InlineQueryResultGame(String id, Game game) {
            this.id = id;
            this.game = game;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultAnimation extends InlineQueryResult {
        public static final int CONSTRUCTOR = 2009984267;
        public String id;
        public Animation animation;
        public String title;

        public InlineQueryResultAnimation() {
        }

        public InlineQueryResultAnimation(String id, Animation animation, String title) {
            this.id = id;
            this.animation = animation;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultAudio extends InlineQueryResult {
        public static final int CONSTRUCTOR = 842650360;
        public String id;
        public Audio audio;

        public InlineQueryResultAudio() {
        }

        public InlineQueryResultAudio(String id, Audio audio) {
            this.id = id;
            this.audio = audio;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultDocument extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1491268539;
        public String id;
        public Document document;
        public String title;
        public String description;

        public InlineQueryResultDocument() {
        }

        public InlineQueryResultDocument(String id, Document document, String title, String description) {
            this.id = id;
            this.document = document;
            this.title = title;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultPhoto extends InlineQueryResult {
        public static final int CONSTRUCTOR = 1848319440;
        public String id;
        public Photo photo;
        public String title;
        public String description;

        public InlineQueryResultPhoto() {
        }

        public InlineQueryResultPhoto(String id, Photo photo, String title, String description) {
            this.id = id;
            this.photo = photo;
            this.title = title;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultSticker extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1848224245;
        public String id;
        public Sticker sticker;

        public InlineQueryResultSticker() {
        }

        public InlineQueryResultSticker(String id, Sticker sticker) {
            this.id = id;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultVideo extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1373158683;
        public String id;
        public Video video;
        public String title;
        public String description;

        public InlineQueryResultVideo() {
        }

        public InlineQueryResultVideo(String id, Video video, String title, String description) {
            this.id = id;
            this.video = video;
            this.title = title;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResultVoiceNote extends InlineQueryResult {
        public static final int CONSTRUCTOR = -1897393105;
        public String id;
        public VoiceNote voiceNote;
        public String title;

        public InlineQueryResultVoiceNote() {
        }

        public InlineQueryResultVoiceNote(String id, VoiceNote voiceNote, String title) {
            this.id = id;
            this.voiceNote = voiceNote;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InlineQueryResults extends Object {
        public static final int CONSTRUCTOR = 1000709656;
        public long inlineQueryId;
        public String nextOffset;
        public InlineQueryResult[] results;
        public String switchPmText;
        public String switchPmParameter;

        public InlineQueryResults() {
        }

        public InlineQueryResults(long inlineQueryId, String nextOffset, InlineQueryResult[] results, String switchPmText, String switchPmParameter) {
            this.inlineQueryId = inlineQueryId;
            this.nextOffset = nextOffset;
            this.results = results;
            this.switchPmText = switchPmText;
            this.switchPmParameter = switchPmParameter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputBackground extends Object {
    }

    public static class InputBackgroundLocal extends InputBackground {
        public static final int CONSTRUCTOR = -1747094364;
        public InputFile background;

        public InputBackgroundLocal() {
        }

        public InputBackgroundLocal(InputFile background) {
            this.background = background;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputBackgroundRemote extends InputBackground {
        public static final int CONSTRUCTOR = -274976231;
        public long backgroundId;

        public InputBackgroundRemote() {
        }

        public InputBackgroundRemote(long backgroundId) {
            this.backgroundId = backgroundId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputChatPhoto extends Object {
    }

    public static class InputChatPhotoPrevious extends InputChatPhoto {
        public static final int CONSTRUCTOR = 23128529;
        public long chatPhotoId;

        public InputChatPhotoPrevious() {
        }

        public InputChatPhotoPrevious(long chatPhotoId) {
            this.chatPhotoId = chatPhotoId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputChatPhotoStatic extends InputChatPhoto {
        public static final int CONSTRUCTOR = 1979179699;
        public InputFile photo;

        public InputChatPhotoStatic() {
        }

        public InputChatPhotoStatic(InputFile photo) {
            this.photo = photo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputChatPhotoAnimation extends InputChatPhoto {
        public static final int CONSTRUCTOR = 90846242;
        public InputFile animation;
        public double mainFrameTimestamp;

        public InputChatPhotoAnimation() {
        }

        public InputChatPhotoAnimation(InputFile animation, double mainFrameTimestamp) {
            this.animation = animation;
            this.mainFrameTimestamp = mainFrameTimestamp;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputCredentials extends Object {
    }

    public static class InputCredentialsSaved extends InputCredentials {
        public static final int CONSTRUCTOR = -2034385364;
        public String savedCredentialsId;

        public InputCredentialsSaved() {
        }

        public InputCredentialsSaved(String savedCredentialsId) {
            this.savedCredentialsId = savedCredentialsId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputCredentialsNew extends InputCredentials {
        public static final int CONSTRUCTOR = -829689558;
        public String data;
        public boolean allowSave;

        public InputCredentialsNew() {
        }

        public InputCredentialsNew(String data, boolean allowSave) {
            this.data = data;
            this.allowSave = allowSave;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputCredentialsApplePay extends InputCredentials {
        public static final int CONSTRUCTOR = -1246570799;
        public String data;

        public InputCredentialsApplePay() {
        }

        public InputCredentialsApplePay(String data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputCredentialsGooglePay extends InputCredentials {
        public static final int CONSTRUCTOR = 844384100;
        public String data;

        public InputCredentialsGooglePay() {
        }

        public InputCredentialsGooglePay(String data) {
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputFile extends Object {
    }

    public static class InputFileId extends InputFile {
        public static final int CONSTRUCTOR = 1788906253;
        public int id;

        public InputFileId() {
        }

        public InputFileId(int id) {
            this.id = id;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputFileRemote extends InputFile {
        public static final int CONSTRUCTOR = -107574466;
        public String id;

        public InputFileRemote() {
        }

        public InputFileRemote(String id) {
            this.id = id;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputFileLocal extends InputFile {
        public static final int CONSTRUCTOR = 2056030919;
        public String path;

        public InputFileLocal() {
        }

        public InputFileLocal(String path) {
            this.path = path;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputFileGenerated extends InputFile {
        public static final int CONSTRUCTOR = -1333385216;
        public String originalPath;
        public String conversion;
        public long expectedSize;

        public InputFileGenerated() {
        }

        public InputFileGenerated(String originalPath, String conversion, long expectedSize) {
            this.originalPath = originalPath;
            this.conversion = conversion;
            this.expectedSize = expectedSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputIdentityDocument extends Object {
        public static final int CONSTRUCTOR = -381776063;
        public String number;
        public Date expiryDate;
        public InputFile frontSide;
        public InputFile reverseSide;
        public InputFile selfie;
        public InputFile[] translation;

        public InputIdentityDocument() {
        }

        public InputIdentityDocument(String number, Date expiryDate, InputFile frontSide, InputFile reverseSide, InputFile selfie, InputFile[] translation) {
            this.number = number;
            this.expiryDate = expiryDate;
            this.frontSide = frontSide;
            this.reverseSide = reverseSide;
            this.selfie = selfie;
            this.translation = translation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputInlineQueryResult extends Object {
    }

    public static class InputInlineQueryResultAnimation extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1489808874;
        public String id;
        public String title;
        public String thumbnailUrl;
        public String thumbnailMimeType;
        public String videoUrl;
        public String videoMimeType;
        public int videoDuration;
        public int videoWidth;
        public int videoHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultAnimation() {
        }

        public InputInlineQueryResultAnimation(String id, String title, String thumbnailUrl, String thumbnailMimeType, String videoUrl, String videoMimeType, int videoDuration, int videoWidth, int videoHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailMimeType = thumbnailMimeType;
            this.videoUrl = videoUrl;
            this.videoMimeType = videoMimeType;
            this.videoDuration = videoDuration;
            this.videoWidth = videoWidth;
            this.videoHeight = videoHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultArticle extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1973670156;
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultArticle() {
        }

        public InputInlineQueryResultArticle(String id, String url, boolean hideUrl, String title, String description, String thumbnailUrl, int thumbnailWidth, int thumbnailHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.url = url;
            this.hideUrl = hideUrl;
            this.title = title;
            this.description = description;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultAudio extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1260139988;
        public String id;
        public String title;
        public String performer;
        public String audioUrl;
        public int audioDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultAudio() {
        }

        public InputInlineQueryResultAudio(String id, String title, String performer, String audioUrl, int audioDuration, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.performer = performer;
            this.audioUrl = audioUrl;
            this.audioDuration = audioDuration;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultContact extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1846064594;
        public String id;
        public Contact contact;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultContact() {
        }

        public InputInlineQueryResultContact(String id, Contact contact, String thumbnailUrl, int thumbnailWidth, int thumbnailHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.contact = contact;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultDocument extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 578801869;
        public String id;
        public String title;
        public String description;
        public String documentUrl;
        public String mimeType;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultDocument() {
        }

        public InputInlineQueryResultDocument(String id, String title, String description, String documentUrl, String mimeType, String thumbnailUrl, int thumbnailWidth, int thumbnailHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.documentUrl = documentUrl;
            this.mimeType = mimeType;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultGame extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 966074327;
        public String id;
        public String gameShortName;
        public ReplyMarkup replyMarkup;

        public InputInlineQueryResultGame() {
        }

        public InputInlineQueryResultGame(String id, String gameShortName, ReplyMarkup replyMarkup) {
            this.id = id;
            this.gameShortName = gameShortName;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultLocation extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1887650218;
        public String id;
        public Location location;
        public int livePeriod;
        public String title;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultLocation() {
        }

        public InputInlineQueryResultLocation(String id, Location location, int livePeriod, String title, String thumbnailUrl, int thumbnailWidth, int thumbnailHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.location = location;
            this.livePeriod = livePeriod;
            this.title = title;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultPhoto extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1123338721;
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String photoUrl;
        public int photoWidth;
        public int photoHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultPhoto() {
        }

        public InputInlineQueryResultPhoto(String id, String title, String description, String thumbnailUrl, String photoUrl, int photoWidth, int photoHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.thumbnailUrl = thumbnailUrl;
            this.photoUrl = photoUrl;
            this.photoWidth = photoWidth;
            this.photoHeight = photoHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultSticker extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 274007129;
        public String id;
        public String thumbnailUrl;
        public String stickerUrl;
        public int stickerWidth;
        public int stickerHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultSticker() {
        }

        public InputInlineQueryResultSticker(String id, String thumbnailUrl, String stickerUrl, int stickerWidth, int stickerHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.thumbnailUrl = thumbnailUrl;
            this.stickerUrl = stickerUrl;
            this.stickerWidth = stickerWidth;
            this.stickerHeight = stickerHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultVenue extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 541704509;
        public String id;
        public Venue venue;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultVenue() {
        }

        public InputInlineQueryResultVenue(String id, Venue venue, String thumbnailUrl, int thumbnailWidth, int thumbnailHeight, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.venue = venue;
            this.thumbnailUrl = thumbnailUrl;
            this.thumbnailWidth = thumbnailWidth;
            this.thumbnailHeight = thumbnailHeight;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultVideo extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = 1724073191;
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String videoUrl;
        public String mimeType;
        public int videoWidth;
        public int videoHeight;
        public int videoDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultVideo() {
        }

        public InputInlineQueryResultVideo(String id, String title, String description, String thumbnailUrl, String videoUrl, String mimeType, int videoWidth, int videoHeight, int videoDuration, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.thumbnailUrl = thumbnailUrl;
            this.videoUrl = videoUrl;
            this.mimeType = mimeType;
            this.videoWidth = videoWidth;
            this.videoHeight = videoHeight;
            this.videoDuration = videoDuration;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInlineQueryResultVoiceNote extends InputInlineQueryResult {
        public static final int CONSTRUCTOR = -1790072503;
        public String id;
        public String title;
        public String voiceNoteUrl;
        public int voiceNoteDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public InputInlineQueryResultVoiceNote() {
        }

        public InputInlineQueryResultVoiceNote(String id, String title, String voiceNoteUrl, int voiceNoteDuration, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.id = id;
            this.title = title;
            this.voiceNoteUrl = voiceNoteUrl;
            this.voiceNoteDuration = voiceNoteDuration;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputInvoice extends Object {
    }

    public static class InputInvoiceMessage extends InputInvoice {
        public static final int CONSTRUCTOR = 1490872848;
        public long chatId;
        public long messageId;

        public InputInvoiceMessage() {
        }

        public InputInvoiceMessage(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputInvoiceName extends InputInvoice {
        public static final int CONSTRUCTOR = -1312155917;
        public String name;

        public InputInvoiceName() {
        }

        public InputInvoiceName(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputMessageContent extends Object {
    }

    public static class InputMessageText extends InputMessageContent {
        public static final int CONSTRUCTOR = 247050392;
        public FormattedText text;
        public boolean disableWebPagePreview;
        public boolean clearDraft;

        public InputMessageText() {
        }

        public InputMessageText(FormattedText text, boolean disableWebPagePreview, boolean clearDraft) {
            this.text = text;
            this.disableWebPagePreview = disableWebPagePreview;
            this.clearDraft = clearDraft;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageAnimation extends InputMessageContent {
        public static final int CONSTRUCTOR = 1208433535;
        public InputFile animation;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public FormattedText caption;

        public InputMessageAnimation() {
        }

        public InputMessageAnimation(InputFile animation, InputThumbnail thumbnail, int[] addedStickerFileIds, int duration, int width, int height, FormattedText caption) {
            this.animation = animation;
            this.thumbnail = thumbnail;
            this.addedStickerFileIds = addedStickerFileIds;
            this.duration = duration;
            this.width = width;
            this.height = height;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageAudio extends InputMessageContent {
        public static final int CONSTRUCTOR = -626786126;
        public InputFile audio;
        public InputThumbnail albumCoverThumbnail;
        public int duration;
        public String title;
        public String performer;
        public FormattedText caption;

        public InputMessageAudio() {
        }

        public InputMessageAudio(InputFile audio, InputThumbnail albumCoverThumbnail, int duration, String title, String performer, FormattedText caption) {
            this.audio = audio;
            this.albumCoverThumbnail = albumCoverThumbnail;
            this.duration = duration;
            this.title = title;
            this.performer = performer;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageDocument extends InputMessageContent {
        public static final int CONSTRUCTOR = 1633383097;
        public InputFile document;
        public InputThumbnail thumbnail;
        public boolean disableContentTypeDetection;
        public FormattedText caption;

        public InputMessageDocument() {
        }

        public InputMessageDocument(InputFile document, InputThumbnail thumbnail, boolean disableContentTypeDetection, FormattedText caption) {
            this.document = document;
            this.thumbnail = thumbnail;
            this.disableContentTypeDetection = disableContentTypeDetection;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessagePhoto extends InputMessageContent {
        public static final int CONSTRUCTOR = 1648801584;
        public InputFile photo;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int width;
        public int height;
        public FormattedText caption;
        public int ttl;

        public InputMessagePhoto() {
        }

        public InputMessagePhoto(InputFile photo, InputThumbnail thumbnail, int[] addedStickerFileIds, int width, int height, FormattedText caption, int ttl) {
            this.photo = photo;
            this.thumbnail = thumbnail;
            this.addedStickerFileIds = addedStickerFileIds;
            this.width = width;
            this.height = height;
            this.caption = caption;
            this.ttl = ttl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageSticker extends InputMessageContent {
        public static final int CONSTRUCTOR = 1072805625;
        public InputFile sticker;
        public InputThumbnail thumbnail;
        public int width;
        public int height;
        public String emoji;

        public InputMessageSticker() {
        }

        public InputMessageSticker(InputFile sticker, InputThumbnail thumbnail, int width, int height, String emoji) {
            this.sticker = sticker;
            this.thumbnail = thumbnail;
            this.width = width;
            this.height = height;
            this.emoji = emoji;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageVideo extends InputMessageContent {
        public static final int CONSTRUCTOR = -2108486755;
        public InputFile video;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public boolean supportsStreaming;
        public FormattedText caption;
        public int ttl;

        public InputMessageVideo() {
        }

        public InputMessageVideo(InputFile video, InputThumbnail thumbnail, int[] addedStickerFileIds, int duration, int width, int height, boolean supportsStreaming, FormattedText caption, int ttl) {
            this.video = video;
            this.thumbnail = thumbnail;
            this.addedStickerFileIds = addedStickerFileIds;
            this.duration = duration;
            this.width = width;
            this.height = height;
            this.supportsStreaming = supportsStreaming;
            this.caption = caption;
            this.ttl = ttl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageVideoNote extends InputMessageContent {
        public static final int CONSTRUCTOR = 279108859;
        public InputFile videoNote;
        public InputThumbnail thumbnail;
        public int duration;
        public int length;

        public InputMessageVideoNote() {
        }

        public InputMessageVideoNote(InputFile videoNote, InputThumbnail thumbnail, int duration, int length) {
            this.videoNote = videoNote;
            this.thumbnail = thumbnail;
            this.duration = duration;
            this.length = length;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageVoiceNote extends InputMessageContent {
        public static final int CONSTRUCTOR = 2136519657;
        public InputFile voiceNote;
        public int duration;
        public byte[] waveform;
        public FormattedText caption;

        public InputMessageVoiceNote() {
        }

        public InputMessageVoiceNote(InputFile voiceNote, int duration, byte[] waveform, FormattedText caption) {
            this.voiceNote = voiceNote;
            this.duration = duration;
            this.waveform = waveform;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageLocation extends InputMessageContent {
        public static final int CONSTRUCTOR = 648735088;
        public Location location;
        public int livePeriod;
        public int heading;
        public int proximityAlertRadius;

        public InputMessageLocation() {
        }

        public InputMessageLocation(Location location, int livePeriod, int heading, int proximityAlertRadius) {
            this.location = location;
            this.livePeriod = livePeriod;
            this.heading = heading;
            this.proximityAlertRadius = proximityAlertRadius;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageVenue extends InputMessageContent {
        public static final int CONSTRUCTOR = 1447926269;
        public Venue venue;

        public InputMessageVenue() {
        }

        public InputMessageVenue(Venue venue) {
            this.venue = venue;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageContact extends InputMessageContent {
        public static final int CONSTRUCTOR = -982446849;
        public Contact contact;

        public InputMessageContact() {
        }

        public InputMessageContact(Contact contact) {
            this.contact = contact;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageDice extends InputMessageContent {
        public static final int CONSTRUCTOR = 841574313;
        public String emoji;
        public boolean clearDraft;

        public InputMessageDice() {
        }

        public InputMessageDice(String emoji, boolean clearDraft) {
            this.emoji = emoji;
            this.clearDraft = clearDraft;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageGame extends InputMessageContent {
        public static final int CONSTRUCTOR = 1252944610;
        public long botUserId;
        public String gameShortName;

        public InputMessageGame() {
        }

        public InputMessageGame(long botUserId, String gameShortName) {
            this.botUserId = botUserId;
            this.gameShortName = gameShortName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageInvoice extends InputMessageContent {
        public static final int CONSTRUCTOR = 1038812175;
        public Invoice invoice;
        public String title;
        public String description;
        public String photoUrl;
        public int photoSize;
        public int photoWidth;
        public int photoHeight;
        public byte[] payload;
        public String providerToken;
        public String providerData;
        public String startParameter;

        public InputMessageInvoice() {
        }

        public InputMessageInvoice(Invoice invoice, String title, String description, String photoUrl, int photoSize, int photoWidth, int photoHeight, byte[] payload, String providerToken, String providerData, String startParameter) {
            this.invoice = invoice;
            this.title = title;
            this.description = description;
            this.photoUrl = photoUrl;
            this.photoSize = photoSize;
            this.photoWidth = photoWidth;
            this.photoHeight = photoHeight;
            this.payload = payload;
            this.providerToken = providerToken;
            this.providerData = providerData;
            this.startParameter = startParameter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessagePoll extends InputMessageContent {
        public static final int CONSTRUCTOR = 2054629900;
        public String question;
        public String[] options;
        public boolean isAnonymous;
        public PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;

        public InputMessagePoll() {
        }

        public InputMessagePoll(String question, String[] options, boolean isAnonymous, PollType type, int openPeriod, int closeDate, boolean isClosed) {
            this.question = question;
            this.options = options;
            this.isAnonymous = isAnonymous;
            this.type = type;
            this.openPeriod = openPeriod;
            this.closeDate = closeDate;
            this.isClosed = isClosed;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputMessageForwarded extends InputMessageContent {
        public static final int CONSTRUCTOR = 1696232440;
        public long fromChatId;
        public long messageId;
        public boolean inGameShare;
        public MessageCopyOptions copyOptions;

        public InputMessageForwarded() {
        }

        public InputMessageForwarded(long fromChatId, long messageId, boolean inGameShare, MessageCopyOptions copyOptions) {
            this.fromChatId = fromChatId;
            this.messageId = messageId;
            this.inGameShare = inGameShare;
            this.copyOptions = copyOptions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputPassportElement extends Object {
    }

    public static class InputPassportElementPersonalDetails extends InputPassportElement {
        public static final int CONSTRUCTOR = 164791359;
        public PersonalDetails personalDetails;

        public InputPassportElementPersonalDetails() {
        }

        public InputPassportElementPersonalDetails(PersonalDetails personalDetails) {
            this.personalDetails = personalDetails;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementPassport extends InputPassportElement {
        public static final int CONSTRUCTOR = -497011356;
        public InputIdentityDocument passport;

        public InputPassportElementPassport() {
        }

        public InputPassportElementPassport(InputIdentityDocument passport) {
            this.passport = passport;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementDriverLicense extends InputPassportElement {
        public static final int CONSTRUCTOR = 304813264;
        public InputIdentityDocument driverLicense;

        public InputPassportElementDriverLicense() {
        }

        public InputPassportElementDriverLicense(InputIdentityDocument driverLicense) {
            this.driverLicense = driverLicense;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementIdentityCard extends InputPassportElement {
        public static final int CONSTRUCTOR = -9963390;
        public InputIdentityDocument identityCard;

        public InputPassportElementIdentityCard() {
        }

        public InputPassportElementIdentityCard(InputIdentityDocument identityCard) {
            this.identityCard = identityCard;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementInternalPassport extends InputPassportElement {
        public static final int CONSTRUCTOR = 715360043;
        public InputIdentityDocument internalPassport;

        public InputPassportElementInternalPassport() {
        }

        public InputPassportElementInternalPassport(InputIdentityDocument internalPassport) {
            this.internalPassport = internalPassport;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementAddress extends InputPassportElement {
        public static final int CONSTRUCTOR = 461630480;
        public Address address;

        public InputPassportElementAddress() {
        }

        public InputPassportElementAddress(Address address) {
            this.address = address;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementUtilityBill extends InputPassportElement {
        public static final int CONSTRUCTOR = 1389203841;
        public InputPersonalDocument utilityBill;

        public InputPassportElementUtilityBill() {
        }

        public InputPassportElementUtilityBill(InputPersonalDocument utilityBill) {
            this.utilityBill = utilityBill;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementBankStatement extends InputPassportElement {
        public static final int CONSTRUCTOR = -26585208;
        public InputPersonalDocument bankStatement;

        public InputPassportElementBankStatement() {
        }

        public InputPassportElementBankStatement(InputPersonalDocument bankStatement) {
            this.bankStatement = bankStatement;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementRentalAgreement extends InputPassportElement {
        public static final int CONSTRUCTOR = 1736154155;
        public InputPersonalDocument rentalAgreement;

        public InputPassportElementRentalAgreement() {
        }

        public InputPassportElementRentalAgreement(InputPersonalDocument rentalAgreement) {
            this.rentalAgreement = rentalAgreement;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementPassportRegistration extends InputPassportElement {
        public static final int CONSTRUCTOR = 1314562128;
        public InputPersonalDocument passportRegistration;

        public InputPassportElementPassportRegistration() {
        }

        public InputPassportElementPassportRegistration(InputPersonalDocument passportRegistration) {
            this.passportRegistration = passportRegistration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementTemporaryRegistration extends InputPassportElement {
        public static final int CONSTRUCTOR = -1913238047;
        public InputPersonalDocument temporaryRegistration;

        public InputPassportElementTemporaryRegistration() {
        }

        public InputPassportElementTemporaryRegistration(InputPersonalDocument temporaryRegistration) {
            this.temporaryRegistration = temporaryRegistration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementPhoneNumber extends InputPassportElement {
        public static final int CONSTRUCTOR = 1319357497;
        public String phoneNumber;

        public InputPassportElementPhoneNumber() {
        }

        public InputPassportElementPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementEmailAddress extends InputPassportElement {
        public static final int CONSTRUCTOR = -248605659;
        public String emailAddress;

        public InputPassportElementEmailAddress() {
        }

        public InputPassportElementEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementError extends Object {
        public static final int CONSTRUCTOR = 285756898;
        public PassportElementType type;
        public String message;
        public InputPassportElementErrorSource source;

        public InputPassportElementError() {
        }

        public InputPassportElementError(PassportElementType type, String message, InputPassportElementErrorSource source) {
            this.type = type;
            this.message = message;
            this.source = source;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputPassportElementErrorSource extends Object {
    }

    public static class InputPassportElementErrorSourceUnspecified extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 267230319;
        public byte[] elementHash;

        public InputPassportElementErrorSourceUnspecified() {
        }

        public InputPassportElementErrorSourceUnspecified(byte[] elementHash) {
            this.elementHash = elementHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceDataField extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -426795002;
        public String fieldName;
        public byte[] dataHash;

        public InputPassportElementErrorSourceDataField() {
        }

        public InputPassportElementErrorSourceDataField(String fieldName, byte[] dataHash) {
            this.fieldName = fieldName;
            this.dataHash = dataHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceFrontSide extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 588023741;
        public byte[] fileHash;

        public InputPassportElementErrorSourceFrontSide() {
        }

        public InputPassportElementErrorSourceFrontSide(byte[] fileHash) {
            this.fileHash = fileHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceReverseSide extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 413072891;
        public byte[] fileHash;

        public InputPassportElementErrorSourceReverseSide() {
        }

        public InputPassportElementErrorSourceReverseSide(byte[] fileHash) {
            this.fileHash = fileHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceSelfie extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -773575528;
        public byte[] fileHash;

        public InputPassportElementErrorSourceSelfie() {
        }

        public InputPassportElementErrorSourceSelfie(byte[] fileHash) {
            this.fileHash = fileHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFile extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = 505842299;
        public byte[] fileHash;

        public InputPassportElementErrorSourceTranslationFile() {
        }

        public InputPassportElementErrorSourceTranslationFile(byte[] fileHash) {
            this.fileHash = fileHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFiles extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -527254048;
        public byte[][] fileHashes;

        public InputPassportElementErrorSourceTranslationFiles() {
        }

        public InputPassportElementErrorSourceTranslationFiles(byte[][] fileHashes) {
            this.fileHashes = fileHashes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceFile extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -298492469;
        public byte[] fileHash;

        public InputPassportElementErrorSourceFile() {
        }

        public InputPassportElementErrorSourceFile(byte[] fileHash) {
            this.fileHash = fileHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPassportElementErrorSourceFiles extends InputPassportElementErrorSource {
        public static final int CONSTRUCTOR = -2008541640;
        public byte[][] fileHashes;

        public InputPassportElementErrorSourceFiles() {
        }

        public InputPassportElementErrorSourceFiles(byte[][] fileHashes) {
            this.fileHashes = fileHashes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputPersonalDocument extends Object {
        public static final int CONSTRUCTOR = 1676966826;
        public InputFile[] files;
        public InputFile[] translation;

        public InputPersonalDocument() {
        }

        public InputPersonalDocument(InputFile[] files, InputFile[] translation) {
            this.files = files;
            this.translation = translation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputSticker extends Object {
        public static final int CONSTRUCTOR = 878376494;
        public InputFile sticker;
        public String emojis;
        public StickerType type;

        public InputSticker() {
        }

        public InputSticker(InputFile sticker, String emojis, StickerType type) {
            this.sticker = sticker;
            this.emojis = emojis;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputThumbnail extends Object {
        public static final int CONSTRUCTOR = 1582387236;
        public InputFile thumbnail;
        public int width;
        public int height;

        public InputThumbnail() {
        }

        public InputThumbnail(InputFile thumbnail, int width, int height) {
            this.thumbnail = thumbnail;
            this.width = width;
            this.height = height;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InternalLinkType extends Object {
    }

    public static class InternalLinkTypeActiveSessions extends InternalLinkType {

        public static final int CONSTRUCTOR = 1886108589;

        public InternalLinkTypeActiveSessions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeAttachmentMenuBot extends InternalLinkType {
        public static final int CONSTRUCTOR = 1682719269;
        public TargetChat targetChat;
        public String botUsername;
        public String url;

        public InternalLinkTypeAttachmentMenuBot() {
        }

        public InternalLinkTypeAttachmentMenuBot(TargetChat targetChat, String botUsername, String url) {
            this.targetChat = targetChat;
            this.botUsername = botUsername;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeAuthenticationCode extends InternalLinkType {
        public static final int CONSTRUCTOR = -209235982;
        public String code;

        public InternalLinkTypeAuthenticationCode() {
        }

        public InternalLinkTypeAuthenticationCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeBackground extends InternalLinkType {
        public static final int CONSTRUCTOR = 185411848;
        public String backgroundName;

        public InternalLinkTypeBackground() {
        }

        public InternalLinkTypeBackground(String backgroundName) {
            this.backgroundName = backgroundName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeBotStart extends InternalLinkType {
        public static final int CONSTRUCTOR = 1066950637;
        public String botUsername;
        public String startParameter;
        public boolean autostart;

        public InternalLinkTypeBotStart() {
        }

        public InternalLinkTypeBotStart(String botUsername, String startParameter, boolean autostart) {
            this.botUsername = botUsername;
            this.startParameter = startParameter;
            this.autostart = autostart;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeBotStartInGroup extends InternalLinkType {
        public static final int CONSTRUCTOR = -905081650;
        public String botUsername;
        public String startParameter;
        public ChatAdministratorRights administratorRights;

        public InternalLinkTypeBotStartInGroup() {
        }

        public InternalLinkTypeBotStartInGroup(String botUsername, String startParameter, ChatAdministratorRights administratorRights) {
            this.botUsername = botUsername;
            this.startParameter = startParameter;
            this.administratorRights = administratorRights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeBotAddToChannel extends InternalLinkType {
        public static final int CONSTRUCTOR = 1401602752;
        public String botUsername;
        public ChatAdministratorRights administratorRights;

        public InternalLinkTypeBotAddToChannel() {
        }

        public InternalLinkTypeBotAddToChannel(String botUsername, ChatAdministratorRights administratorRights) {
            this.botUsername = botUsername;
            this.administratorRights = administratorRights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeChangePhoneNumber extends InternalLinkType {

        public static final int CONSTRUCTOR = -265856255;

        public InternalLinkTypeChangePhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeChatInvite extends InternalLinkType {
        public static final int CONSTRUCTOR = 428621017;
        public String inviteLink;

        public InternalLinkTypeChatInvite() {
        }

        public InternalLinkTypeChatInvite(String inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeFilterSettings extends InternalLinkType {

        public static final int CONSTRUCTOR = 1501632411;

        public InternalLinkTypeFilterSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeGame extends InternalLinkType {
        public static final int CONSTRUCTOR = -260788787;
        public String botUsername;
        public String gameShortName;

        public InternalLinkTypeGame() {
        }

        public InternalLinkTypeGame(String botUsername, String gameShortName) {
            this.botUsername = botUsername;
            this.gameShortName = gameShortName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeInvoice extends InternalLinkType {
        public static final int CONSTRUCTOR = -213094996;
        public String invoiceName;

        public InternalLinkTypeInvoice() {
        }

        public InternalLinkTypeInvoice(String invoiceName) {
            this.invoiceName = invoiceName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeLanguagePack extends InternalLinkType {
        public static final int CONSTRUCTOR = -1450766996;
        public String languagePackId;

        public InternalLinkTypeLanguagePack() {
        }

        public InternalLinkTypeLanguagePack(String languagePackId) {
            this.languagePackId = languagePackId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeLanguageSettings extends InternalLinkType {

        public static final int CONSTRUCTOR = -1340479770;

        public InternalLinkTypeLanguageSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeMessage extends InternalLinkType {
        public static final int CONSTRUCTOR = 978541650;
        public String url;

        public InternalLinkTypeMessage() {
        }

        public InternalLinkTypeMessage(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeMessageDraft extends InternalLinkType {
        public static final int CONSTRUCTOR = 661633749;
        public FormattedText text;
        public boolean containsLink;

        public InternalLinkTypeMessageDraft() {
        }

        public InternalLinkTypeMessageDraft(FormattedText text, boolean containsLink) {
            this.text = text;
            this.containsLink = containsLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypePassportDataRequest extends InternalLinkType {
        public static final int CONSTRUCTOR = -988819839;
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;
        public String callbackUrl;

        public InternalLinkTypePassportDataRequest() {
        }

        public InternalLinkTypePassportDataRequest(long botUserId, String scope, String publicKey, String nonce, String callbackUrl) {
            this.botUserId = botUserId;
            this.scope = scope;
            this.publicKey = publicKey;
            this.nonce = nonce;
            this.callbackUrl = callbackUrl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypePhoneNumberConfirmation extends InternalLinkType {
        public static final int CONSTRUCTOR = 1757375254;
        public String hash;
        public String phoneNumber;

        public InternalLinkTypePhoneNumberConfirmation() {
        }

        public InternalLinkTypePhoneNumberConfirmation(String hash, String phoneNumber) {
            this.hash = hash;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypePremiumFeatures extends InternalLinkType {
        public static final int CONSTRUCTOR = 1216892745;
        public String referrer;

        public InternalLinkTypePremiumFeatures() {
        }

        public InternalLinkTypePremiumFeatures(String referrer) {
            this.referrer = referrer;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypePrivacyAndSecuritySettings extends InternalLinkType {

        public static final int CONSTRUCTOR = -1386255665;

        public InternalLinkTypePrivacyAndSecuritySettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeProxy extends InternalLinkType {
        public static final int CONSTRUCTOR = -1313788694;
        public String server;
        public int port;
        public ProxyType type;

        public InternalLinkTypeProxy() {
        }

        public InternalLinkTypeProxy(String server, int port, ProxyType type) {
            this.server = server;
            this.port = port;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypePublicChat extends InternalLinkType {
        public static final int CONSTRUCTOR = -1485547717;
        public String chatUsername;

        public InternalLinkTypePublicChat() {
        }

        public InternalLinkTypePublicChat(String chatUsername) {
            this.chatUsername = chatUsername;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeQrCodeAuthentication extends InternalLinkType {

        public static final int CONSTRUCTOR = -1089332956;

        public InternalLinkTypeQrCodeAuthentication() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeSettings extends InternalLinkType {

        public static final int CONSTRUCTOR = 393561524;

        public InternalLinkTypeSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeStickerSet extends InternalLinkType {
        public static final int CONSTRUCTOR = -529639751;
        public String stickerSetName;

        public InternalLinkTypeStickerSet() {
        }

        public InternalLinkTypeStickerSet(String stickerSetName) {
            this.stickerSetName = stickerSetName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeTheme extends InternalLinkType {
        public static final int CONSTRUCTOR = -200935417;
        public String themeName;

        public InternalLinkTypeTheme() {
        }

        public InternalLinkTypeTheme(String themeName) {
            this.themeName = themeName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeThemeSettings extends InternalLinkType {

        public static final int CONSTRUCTOR = -1051903722;

        public InternalLinkTypeThemeSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeUnknownDeepLink extends InternalLinkType {
        public static final int CONSTRUCTOR = 625596379;
        public String link;

        public InternalLinkTypeUnknownDeepLink() {
        }

        public InternalLinkTypeUnknownDeepLink(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeUnsupportedProxy extends InternalLinkType {

        public static final int CONSTRUCTOR = -566649079;

        public InternalLinkTypeUnsupportedProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeUserPhoneNumber extends InternalLinkType {
        public static final int CONSTRUCTOR = -1955751319;
        public String phoneNumber;

        public InternalLinkTypeUserPhoneNumber() {
        }

        public InternalLinkTypeUserPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalLinkTypeVideoChat extends InternalLinkType {
        public static final int CONSTRUCTOR = -2020149068;
        public String chatUsername;
        public String inviteHash;
        public boolean isLiveStream;

        public InternalLinkTypeVideoChat() {
        }

        public InternalLinkTypeVideoChat(String chatUsername, String inviteHash, boolean isLiveStream) {
            this.chatUsername = chatUsername;
            this.inviteHash = inviteHash;
            this.isLiveStream = isLiveStream;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Invoice extends Object {
        public static final int CONSTRUCTOR = 1977205639;
        public String currency;
        public LabeledPricePart[] priceParts;
        public long maxTipAmount;
        public long[] suggestedTipAmounts;
        public String recurringPaymentTermsOfServiceUrl;
        public boolean isTest;
        public boolean needName;
        public boolean needPhoneNumber;
        public boolean needEmailAddress;
        public boolean needShippingAddress;
        public boolean sendPhoneNumberToProvider;
        public boolean sendEmailAddressToProvider;
        public boolean isFlexible;

        public Invoice() {
        }

        public Invoice(String currency, LabeledPricePart[] priceParts, long maxTipAmount, long[] suggestedTipAmounts, String recurringPaymentTermsOfServiceUrl, boolean isTest, boolean needName, boolean needPhoneNumber, boolean needEmailAddress, boolean needShippingAddress, boolean sendPhoneNumberToProvider, boolean sendEmailAddressToProvider, boolean isFlexible) {
            this.currency = currency;
            this.priceParts = priceParts;
            this.maxTipAmount = maxTipAmount;
            this.suggestedTipAmounts = suggestedTipAmounts;
            this.recurringPaymentTermsOfServiceUrl = recurringPaymentTermsOfServiceUrl;
            this.isTest = isTest;
            this.needName = needName;
            this.needPhoneNumber = needPhoneNumber;
            this.needEmailAddress = needEmailAddress;
            this.needShippingAddress = needShippingAddress;
            this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
            this.sendEmailAddressToProvider = sendEmailAddressToProvider;
            this.isFlexible = isFlexible;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonObjectMember extends Object {
        public static final int CONSTRUCTOR = -1803309418;
        public String key;
        public JsonValue value;

        public JsonObjectMember() {
        }

        public JsonObjectMember(String key, JsonValue value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class JsonValue extends Object {
    }

    public static class JsonValueNull extends JsonValue {

        public static final int CONSTRUCTOR = -92872499;

        public JsonValueNull() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueBoolean extends JsonValue {
        public static final int CONSTRUCTOR = -2142186576;
        public boolean value;

        public JsonValueBoolean() {
        }

        public JsonValueBoolean(boolean value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueNumber extends JsonValue {
        public static final int CONSTRUCTOR = -1010822033;
        public double value;

        public JsonValueNumber() {
        }

        public JsonValueNumber(double value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueString extends JsonValue {
        public static final int CONSTRUCTOR = 1597947313;
        public String value;

        public JsonValueString() {
        }

        public JsonValueString(String value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueArray extends JsonValue {
        public static final int CONSTRUCTOR = -183913546;
        public JsonValue[] values;

        public JsonValueArray() {
        }

        public JsonValueArray(JsonValue[] values) {
            this.values = values;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JsonValueObject extends JsonValue {
        public static final int CONSTRUCTOR = 520252026;
        public JsonObjectMember[] members;

        public JsonValueObject() {
        }

        public JsonValueObject(JsonObjectMember[] members) {
            this.members = members;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButton extends Object {
        public static final int CONSTRUCTOR = -2069836172;
        public String text;
        public KeyboardButtonType type;

        public KeyboardButton() {
        }

        public KeyboardButton(String text, KeyboardButtonType type) {
            this.text = text;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class KeyboardButtonType extends Object {
    }

    public static class KeyboardButtonTypeText extends KeyboardButtonType {

        public static final int CONSTRUCTOR = -1773037256;

        public KeyboardButtonTypeText() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeRequestPhoneNumber extends KeyboardButtonType {

        public static final int CONSTRUCTOR = -1529235527;

        public KeyboardButtonTypeRequestPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeRequestLocation extends KeyboardButtonType {

        public static final int CONSTRUCTOR = -125661955;

        public KeyboardButtonTypeRequestLocation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeRequestPoll extends KeyboardButtonType {
        public static final int CONSTRUCTOR = 1902435512;
        public boolean forceRegular;
        public boolean forceQuiz;

        public KeyboardButtonTypeRequestPoll() {
        }

        public KeyboardButtonTypeRequestPoll(boolean forceRegular, boolean forceQuiz) {
            this.forceRegular = forceRegular;
            this.forceQuiz = forceQuiz;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyboardButtonTypeWebApp extends KeyboardButtonType {
        public static final int CONSTRUCTOR = 1892220770;
        public String url;

        public KeyboardButtonTypeWebApp() {
        }

        public KeyboardButtonTypeWebApp(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LabeledPricePart extends Object {
        public static final int CONSTRUCTOR = 552789798;
        public String label;
        public long amount;

        public LabeledPricePart() {
        }

        public LabeledPricePart(String label, long amount) {
            this.label = label;
            this.amount = amount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackInfo extends Object {
        public static final int CONSTRUCTOR = 542199642;
        public String id;
        public String baseLanguagePackId;
        public String name;
        public String nativeName;
        public String pluralCode;
        public boolean isOfficial;
        public boolean isRtl;
        public boolean isBeta;
        public boolean isInstalled;
        public int totalStringCount;
        public int translatedStringCount;
        public int localStringCount;
        public String translationUrl;

        public LanguagePackInfo() {
        }

        public LanguagePackInfo(String id, String baseLanguagePackId, String name, String nativeName, String pluralCode, boolean isOfficial, boolean isRtl, boolean isBeta, boolean isInstalled, int totalStringCount, int translatedStringCount, int localStringCount, String translationUrl) {
            this.id = id;
            this.baseLanguagePackId = baseLanguagePackId;
            this.name = name;
            this.nativeName = nativeName;
            this.pluralCode = pluralCode;
            this.isOfficial = isOfficial;
            this.isRtl = isRtl;
            this.isBeta = isBeta;
            this.isInstalled = isInstalled;
            this.totalStringCount = totalStringCount;
            this.translatedStringCount = translatedStringCount;
            this.localStringCount = localStringCount;
            this.translationUrl = translationUrl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackString extends Object {
        public static final int CONSTRUCTOR = 1307632736;
        public String key;
        public LanguagePackStringValue value;

        public LanguagePackString() {
        }

        public LanguagePackString(String key, LanguagePackStringValue value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class LanguagePackStringValue extends Object {
    }

    public static class LanguagePackStringValueOrdinary extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = -249256352;
        public String value;

        public LanguagePackStringValueOrdinary() {
        }

        public LanguagePackStringValueOrdinary(String value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackStringValuePluralized extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = 1906840261;
        public String zeroValue;
        public String oneValue;
        public String twoValue;
        public String fewValue;
        public String manyValue;
        public String otherValue;

        public LanguagePackStringValuePluralized() {
        }

        public LanguagePackStringValuePluralized(String zeroValue, String oneValue, String twoValue, String fewValue, String manyValue, String otherValue) {
            this.zeroValue = zeroValue;
            this.oneValue = oneValue;
            this.twoValue = twoValue;
            this.fewValue = fewValue;
            this.manyValue = manyValue;
            this.otherValue = otherValue;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackStringValueDeleted extends LanguagePackStringValue {

        public static final int CONSTRUCTOR = 1834792698;

        public LanguagePackStringValueDeleted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LanguagePackStrings extends Object {
        public static final int CONSTRUCTOR = 1172082922;
        public LanguagePackString[] strings;

        public LanguagePackStrings() {
        }

        public LanguagePackStrings(LanguagePackString[] strings) {
            this.strings = strings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LocalFile extends Object {
        public static final int CONSTRUCTOR = -1562732153;
        public String path;
        public boolean canBeDownloaded;
        public boolean canBeDeleted;
        public boolean isDownloadingActive;
        public boolean isDownloadingCompleted;
        public long downloadOffset;
        public long downloadedPrefixSize;
        public long downloadedSize;

        public LocalFile() {
        }

        public LocalFile(String path, boolean canBeDownloaded, boolean canBeDeleted, boolean isDownloadingActive, boolean isDownloadingCompleted, long downloadOffset, long downloadedPrefixSize, long downloadedSize) {
            this.path = path;
            this.canBeDownloaded = canBeDownloaded;
            this.canBeDeleted = canBeDeleted;
            this.isDownloadingActive = isDownloadingActive;
            this.isDownloadingCompleted = isDownloadingCompleted;
            this.downloadOffset = downloadOffset;
            this.downloadedPrefixSize = downloadedPrefixSize;
            this.downloadedSize = downloadedSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LocalizationTargetInfo extends Object {
        public static final int CONSTRUCTOR = -2048670809;
        public LanguagePackInfo[] languagePacks;

        public LocalizationTargetInfo() {
        }

        public LocalizationTargetInfo(LanguagePackInfo[] languagePacks) {
            this.languagePacks = languagePacks;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Location extends Object {
        public static final int CONSTRUCTOR = -443392141;
        public double latitude;
        public double longitude;
        public double horizontalAccuracy;

        public Location() {
        }

        public Location(double latitude, double longitude, double horizontalAccuracy) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.horizontalAccuracy = horizontalAccuracy;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class LogStream extends Object {
    }

    public static class LogStreamDefault extends LogStream {

        public static final int CONSTRUCTOR = 1390581436;

        public LogStreamDefault() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamFile extends LogStream {
        public static final int CONSTRUCTOR = 1532136933;
        public String path;
        public long maxFileSize;
        public boolean redirectStderr;

        public LogStreamFile() {
        }

        public LogStreamFile(String path, long maxFileSize, boolean redirectStderr) {
            this.path = path;
            this.maxFileSize = maxFileSize;
            this.redirectStderr = redirectStderr;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamEmpty extends LogStream {

        public static final int CONSTRUCTOR = -499912244;

        public LogStreamEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogTags extends Object {
        public static final int CONSTRUCTOR = -1604930601;
        public String[] tags;

        public LogTags() {
        }

        public LogTags(String[] tags) {
            this.tags = tags;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogVerbosityLevel extends Object {
        public static final int CONSTRUCTOR = 1734624234;
        public int verbosityLevel;

        public LogVerbosityLevel() {
        }

        public LogVerbosityLevel(int verbosityLevel) {
            this.verbosityLevel = verbosityLevel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class LoginUrlInfo extends Object {
    }

    public static class LoginUrlInfoOpen extends LoginUrlInfo {
        public static final int CONSTRUCTOR = -1079045420;
        public String url;
        public boolean skipConfirm;

        public LoginUrlInfoOpen() {
        }

        public LoginUrlInfoOpen(String url, boolean skipConfirm) {
            this.url = url;
            this.skipConfirm = skipConfirm;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LoginUrlInfoRequestConfirmation extends LoginUrlInfo {
        public static final int CONSTRUCTOR = 2128290863;
        public String url;
        public String domain;
        public long botUserId;
        public boolean requestWriteAccess;

        public LoginUrlInfoRequestConfirmation() {
        }

        public LoginUrlInfoRequestConfirmation(String url, String domain, long botUserId, boolean requestWriteAccess) {
            this.url = url;
            this.domain = domain;
            this.botUserId = botUserId;
            this.requestWriteAccess = requestWriteAccess;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MaskPoint extends Object {
    }

    public static class MaskPointForehead extends MaskPoint {

        public static final int CONSTRUCTOR = 1027512005;

        public MaskPointForehead() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointEyes extends MaskPoint {

        public static final int CONSTRUCTOR = 1748310861;

        public MaskPointEyes() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointMouth extends MaskPoint {

        public static final int CONSTRUCTOR = 411773406;

        public MaskPointMouth() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPointChin extends MaskPoint {

        public static final int CONSTRUCTOR = 534995335;

        public MaskPointChin() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MaskPosition extends Object {
        public static final int CONSTRUCTOR = -2097433026;
        public MaskPoint point;
        public double xShift;
        public double yShift;
        public double scale;

        public MaskPosition() {
        }

        public MaskPosition(MaskPoint point, double xShift, double yShift, double scale) {
            this.point = point;
            this.xShift = xShift;
            this.yShift = yShift;
            this.scale = scale;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Message extends Object {
        public static final int CONSTRUCTOR = 1435961258;
        public long id;
        public MessageSender senderId;
        public long chatId;
        public MessageSendingState sendingState;
        public MessageSchedulingState schedulingState;
        public boolean isOutgoing;
        public boolean isPinned;
        public boolean canBeEdited;
        public boolean canBeForwarded;
        public boolean canBeSaved;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canGetAddedReactions;
        public boolean canGetStatistics;
        public boolean canGetMessageThread;
        public boolean canGetViewers;
        public boolean canGetMediaTimestampLinks;
        public boolean hasTimestampedMedia;
        public boolean isChannelPost;
        public boolean containsUnreadMention;
        public int date;
        public int editDate;
        public MessageForwardInfo forwardInfo;
        public MessageInteractionInfo interactionInfo;
        public UnreadReaction[] unreadReactions;
        public long replyInChatId;
        public long replyToMessageId;
        public long messageThreadId;
        public int ttl;
        public double ttlExpiresIn;
        public long viaBotUserId;
        public String authorSignature;
        public long mediaAlbumId;
        public String restrictionReason;
        public MessageContent content;
        public ReplyMarkup replyMarkup;

        public Message() {
        }

        public Message(long id, MessageSender senderId, long chatId, MessageSendingState sendingState, MessageSchedulingState schedulingState, boolean isOutgoing, boolean isPinned, boolean canBeEdited, boolean canBeForwarded, boolean canBeSaved, boolean canBeDeletedOnlyForSelf, boolean canBeDeletedForAllUsers, boolean canGetAddedReactions, boolean canGetStatistics, boolean canGetMessageThread, boolean canGetViewers, boolean canGetMediaTimestampLinks, boolean hasTimestampedMedia, boolean isChannelPost, boolean containsUnreadMention, int date, int editDate, MessageForwardInfo forwardInfo, MessageInteractionInfo interactionInfo, UnreadReaction[] unreadReactions, long replyInChatId, long replyToMessageId, long messageThreadId, int ttl, double ttlExpiresIn, long viaBotUserId, String authorSignature, long mediaAlbumId, String restrictionReason, MessageContent content, ReplyMarkup replyMarkup) {
            this.id = id;
            this.senderId = senderId;
            this.chatId = chatId;
            this.sendingState = sendingState;
            this.schedulingState = schedulingState;
            this.isOutgoing = isOutgoing;
            this.isPinned = isPinned;
            this.canBeEdited = canBeEdited;
            this.canBeForwarded = canBeForwarded;
            this.canBeSaved = canBeSaved;
            this.canBeDeletedOnlyForSelf = canBeDeletedOnlyForSelf;
            this.canBeDeletedForAllUsers = canBeDeletedForAllUsers;
            this.canGetAddedReactions = canGetAddedReactions;
            this.canGetStatistics = canGetStatistics;
            this.canGetMessageThread = canGetMessageThread;
            this.canGetViewers = canGetViewers;
            this.canGetMediaTimestampLinks = canGetMediaTimestampLinks;
            this.hasTimestampedMedia = hasTimestampedMedia;
            this.isChannelPost = isChannelPost;
            this.containsUnreadMention = containsUnreadMention;
            this.date = date;
            this.editDate = editDate;
            this.forwardInfo = forwardInfo;
            this.interactionInfo = interactionInfo;
            this.unreadReactions = unreadReactions;
            this.replyInChatId = replyInChatId;
            this.replyToMessageId = replyToMessageId;
            this.messageThreadId = messageThreadId;
            this.ttl = ttl;
            this.ttlExpiresIn = ttlExpiresIn;
            this.viaBotUserId = viaBotUserId;
            this.authorSignature = authorSignature;
            this.mediaAlbumId = mediaAlbumId;
            this.restrictionReason = restrictionReason;
            this.content = content;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageCalendar extends Object {
        public static final int CONSTRUCTOR = -1682890519;
        public int totalCount;
        public MessageCalendarDay[] days;

        public MessageCalendar() {
        }

        public MessageCalendar(int totalCount, MessageCalendarDay[] days) {
            this.totalCount = totalCount;
            this.days = days;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageCalendarDay extends Object {
        public static final int CONSTRUCTOR = -376467614;
        public int totalCount;
        public Message message;

        public MessageCalendarDay() {
        }

        public MessageCalendarDay(int totalCount, Message message) {
            this.totalCount = totalCount;
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageContent extends Object {
    }

    public static class MessageText extends MessageContent {
        public static final int CONSTRUCTOR = 1989037971;
        public FormattedText text;
        public WebPage webPage;

        public MessageText() {
        }

        public MessageText(FormattedText text, WebPage webPage) {
            this.text = text;
            this.webPage = webPage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageAnimation extends MessageContent {
        public static final int CONSTRUCTOR = 1306939396;
        public Animation animation;
        public FormattedText caption;
        public boolean isSecret;

        public MessageAnimation() {
        }

        public MessageAnimation(Animation animation, FormattedText caption, boolean isSecret) {
            this.animation = animation;
            this.caption = caption;
            this.isSecret = isSecret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageAudio extends MessageContent {
        public static final int CONSTRUCTOR = 276722716;
        public Audio audio;
        public FormattedText caption;

        public MessageAudio() {
        }

        public MessageAudio(Audio audio, FormattedText caption) {
            this.audio = audio;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageDocument extends MessageContent {
        public static final int CONSTRUCTOR = 596945783;
        public Document document;
        public FormattedText caption;

        public MessageDocument() {
        }

        public MessageDocument(Document document, FormattedText caption) {
            this.document = document;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -1851395174;
        public Photo photo;
        public FormattedText caption;
        public boolean isSecret;

        public MessagePhoto() {
        }

        public MessagePhoto(Photo photo, FormattedText caption, boolean isSecret) {
            this.photo = photo;
            this.caption = caption;
            this.isSecret = isSecret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageExpiredPhoto extends MessageContent {

        public static final int CONSTRUCTOR = -1404641801;

        public MessageExpiredPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSticker extends MessageContent {
        public static final int CONSTRUCTOR = -437199670;
        public Sticker sticker;
        public boolean isPremium;

        public MessageSticker() {
        }

        public MessageSticker(Sticker sticker, boolean isPremium) {
            this.sticker = sticker;
            this.isPremium = isPremium;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVideo extends MessageContent {
        public static final int CONSTRUCTOR = 2021281344;
        public Video video;
        public FormattedText caption;
        public boolean isSecret;

        public MessageVideo() {
        }

        public MessageVideo(Video video, FormattedText caption, boolean isSecret) {
            this.video = video;
            this.caption = caption;
            this.isSecret = isSecret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageExpiredVideo extends MessageContent {

        public static final int CONSTRUCTOR = -1212209981;

        public MessageExpiredVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVideoNote extends MessageContent {
        public static final int CONSTRUCTOR = 963323014;
        public VideoNote videoNote;
        public boolean isViewed;
        public boolean isSecret;

        public MessageVideoNote() {
        }

        public MessageVideoNote(VideoNote videoNote, boolean isViewed, boolean isSecret) {
            this.videoNote = videoNote;
            this.isViewed = isViewed;
            this.isSecret = isSecret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVoiceNote extends MessageContent {
        public static final int CONSTRUCTOR = 527777781;
        public VoiceNote voiceNote;
        public FormattedText caption;
        public boolean isListened;

        public MessageVoiceNote() {
        }

        public MessageVoiceNote(VoiceNote voiceNote, FormattedText caption, boolean isListened) {
            this.voiceNote = voiceNote;
            this.caption = caption;
            this.isListened = isListened;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageLocation extends MessageContent {
        public static final int CONSTRUCTOR = 303973492;
        public Location location;
        public int livePeriod;
        public int expiresIn;
        public int heading;
        public int proximityAlertRadius;

        public MessageLocation() {
        }

        public MessageLocation(Location location, int livePeriod, int expiresIn, int heading, int proximityAlertRadius) {
            this.location = location;
            this.livePeriod = livePeriod;
            this.expiresIn = expiresIn;
            this.heading = heading;
            this.proximityAlertRadius = proximityAlertRadius;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVenue extends MessageContent {
        public static final int CONSTRUCTOR = -2146492043;
        public Venue venue;

        public MessageVenue() {
        }

        public MessageVenue(Venue venue) {
            this.venue = venue;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageContact extends MessageContent {
        public static final int CONSTRUCTOR = -512684966;
        public Contact contact;

        public MessageContact() {
        }

        public MessageContact(Contact contact) {
            this.contact = contact;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageAnimatedEmoji extends MessageContent {
        public static final int CONSTRUCTOR = 908195298;
        public AnimatedEmoji animatedEmoji;
        public String emoji;

        public MessageAnimatedEmoji() {
        }

        public MessageAnimatedEmoji(AnimatedEmoji animatedEmoji, String emoji) {
            this.animatedEmoji = animatedEmoji;
            this.emoji = emoji;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageDice extends MessageContent {
        public static final int CONSTRUCTOR = 1115779641;
        public DiceStickers initialState;
        public DiceStickers finalState;
        public String emoji;
        public int value;
        public int successAnimationFrameNumber;

        public MessageDice() {
        }

        public MessageDice(DiceStickers initialState, DiceStickers finalState, String emoji, int value, int successAnimationFrameNumber) {
            this.initialState = initialState;
            this.finalState = finalState;
            this.emoji = emoji;
            this.value = value;
            this.successAnimationFrameNumber = successAnimationFrameNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageGame extends MessageContent {
        public static final int CONSTRUCTOR = -69441162;
        public Game game;

        public MessageGame() {
        }

        public MessageGame(Game game) {
            this.game = game;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePoll extends MessageContent {
        public static final int CONSTRUCTOR = -662130099;
        public Poll poll;

        public MessagePoll() {
        }

        public MessagePoll(Poll poll) {
            this.poll = poll;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageInvoice extends MessageContent {
        public static final int CONSTRUCTOR = -668839796;
        public String title;
        public FormattedText description;
        public Photo photo;
        public String currency;
        public long totalAmount;
        public String startParameter;
        public boolean isTest;
        public boolean needShippingAddress;
        public long receiptMessageId;

        public MessageInvoice() {
        }

        public MessageInvoice(String title, FormattedText description, Photo photo, String currency, long totalAmount, String startParameter, boolean isTest, boolean needShippingAddress, long receiptMessageId) {
            this.title = title;
            this.description = description;
            this.photo = photo;
            this.currency = currency;
            this.totalAmount = totalAmount;
            this.startParameter = startParameter;
            this.isTest = isTest;
            this.needShippingAddress = needShippingAddress;
            this.receiptMessageId = receiptMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageCall extends MessageContent {
        public static final int CONSTRUCTOR = 538893824;
        public boolean isVideo;
        public CallDiscardReason discardReason;
        public int duration;

        public MessageCall() {
        }

        public MessageCall(boolean isVideo, CallDiscardReason discardReason, int duration) {
            this.isVideo = isVideo;
            this.discardReason = discardReason;
            this.duration = duration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVideoChatScheduled extends MessageContent {
        public static final int CONSTRUCTOR = -1855185481;
        public int groupCallId;
        public int startDate;

        public MessageVideoChatScheduled() {
        }

        public MessageVideoChatScheduled(int groupCallId, int startDate) {
            this.groupCallId = groupCallId;
            this.startDate = startDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVideoChatStarted extends MessageContent {
        public static final int CONSTRUCTOR = 521225561;
        public int groupCallId;

        public MessageVideoChatStarted() {
        }

        public MessageVideoChatStarted(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageVideoChatEnded extends MessageContent {
        public static final int CONSTRUCTOR = 2032544855;
        public int duration;

        public MessageVideoChatEnded() {
        }

        public MessageVideoChatEnded(int duration) {
            this.duration = duration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageInviteVideoChatParticipants extends MessageContent {
        public static final int CONSTRUCTOR = -1459065585;
        public int groupCallId;
        public long[] userIds;

        public MessageInviteVideoChatParticipants() {
        }

        public MessageInviteVideoChatParticipants(int groupCallId, long[] userIds) {
            this.groupCallId = groupCallId;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageBasicGroupChatCreate extends MessageContent {
        public static final int CONSTRUCTOR = 795404060;
        public String title;
        public long[] memberUserIds;

        public MessageBasicGroupChatCreate() {
        }

        public MessageBasicGroupChatCreate(String title, long[] memberUserIds) {
            this.title = title;
            this.memberUserIds = memberUserIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSupergroupChatCreate extends MessageContent {
        public static final int CONSTRUCTOR = -434325733;
        public String title;

        public MessageSupergroupChatCreate() {
        }

        public MessageSupergroupChatCreate(String title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatChangeTitle extends MessageContent {
        public static final int CONSTRUCTOR = 748272449;
        public String title;

        public MessageChatChangeTitle() {
        }

        public MessageChatChangeTitle(String title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatChangePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -813415093;
        public ChatPhoto photo;

        public MessageChatChangePhoto() {
        }

        public MessageChatChangePhoto(ChatPhoto photo) {
            this.photo = photo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatDeletePhoto extends MessageContent {

        public static final int CONSTRUCTOR = -184374809;

        public MessageChatDeletePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatAddMembers extends MessageContent {
        public static final int CONSTRUCTOR = 1701117908;
        public long[] memberUserIds;

        public MessageChatAddMembers() {
        }

        public MessageChatAddMembers(long[] memberUserIds) {
            this.memberUserIds = memberUserIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatJoinByLink extends MessageContent {

        public static final int CONSTRUCTOR = 1846493311;

        public MessageChatJoinByLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatJoinByRequest extends MessageContent {

        public static final int CONSTRUCTOR = 1195428732;

        public MessageChatJoinByRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatDeleteMember extends MessageContent {
        public static final int CONSTRUCTOR = 938029481;
        public long userId;

        public MessageChatDeleteMember() {
        }

        public MessageChatDeleteMember(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatUpgradeTo extends MessageContent {
        public static final int CONSTRUCTOR = 104813723;
        public long supergroupId;

        public MessageChatUpgradeTo() {
        }

        public MessageChatUpgradeTo(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatUpgradeFrom extends MessageContent {
        public static final int CONSTRUCTOR = 325954268;
        public String title;
        public long basicGroupId;

        public MessageChatUpgradeFrom() {
        }

        public MessageChatUpgradeFrom(String title, long basicGroupId) {
            this.title = title;
            this.basicGroupId = basicGroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePinMessage extends MessageContent {
        public static final int CONSTRUCTOR = 953503801;
        public long messageId;

        public MessagePinMessage() {
        }

        public MessagePinMessage(long messageId) {
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageScreenshotTaken extends MessageContent {

        public static final int CONSTRUCTOR = -1564971605;

        public MessageScreenshotTaken() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatSetTheme extends MessageContent {
        public static final int CONSTRUCTOR = -1716612088;
        public String themeName;

        public MessageChatSetTheme() {
        }

        public MessageChatSetTheme(String themeName) {
            this.themeName = themeName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageChatSetTtl extends MessageContent {
        public static final int CONSTRUCTOR = 1810060209;
        public int ttl;

        public MessageChatSetTtl() {
        }

        public MessageChatSetTtl(int ttl) {
            this.ttl = ttl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageCustomServiceAction extends MessageContent {
        public static final int CONSTRUCTOR = 1435879282;
        public String text;

        public MessageCustomServiceAction() {
        }

        public MessageCustomServiceAction(String text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageGameScore extends MessageContent {
        public static final int CONSTRUCTOR = 1344904575;
        public long gameMessageId;
        public long gameId;
        public int score;

        public MessageGameScore() {
        }

        public MessageGameScore(long gameMessageId, long gameId, int score) {
            this.gameMessageId = gameMessageId;
            this.gameId = gameId;
            this.score = score;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePaymentSuccessful extends MessageContent {
        public static final int CONSTRUCTOR = 1406745820;
        public long invoiceChatId;
        public long invoiceMessageId;
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public String invoiceName;

        public MessagePaymentSuccessful() {
        }

        public MessagePaymentSuccessful(long invoiceChatId, long invoiceMessageId, String currency, long totalAmount, boolean isRecurring, boolean isFirstRecurring, String invoiceName) {
            this.invoiceChatId = invoiceChatId;
            this.invoiceMessageId = invoiceMessageId;
            this.currency = currency;
            this.totalAmount = totalAmount;
            this.isRecurring = isRecurring;
            this.isFirstRecurring = isFirstRecurring;
            this.invoiceName = invoiceName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePaymentSuccessfulBot extends MessageContent {
        public static final int CONSTRUCTOR = 1759592121;
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public OrderInfo orderInfo;
        public String telegramPaymentChargeId;
        public String providerPaymentChargeId;

        public MessagePaymentSuccessfulBot() {
        }

        public MessagePaymentSuccessfulBot(String currency, long totalAmount, boolean isRecurring, boolean isFirstRecurring, byte[] invoicePayload, String shippingOptionId, OrderInfo orderInfo, String telegramPaymentChargeId, String providerPaymentChargeId) {
            this.currency = currency;
            this.totalAmount = totalAmount;
            this.isRecurring = isRecurring;
            this.isFirstRecurring = isFirstRecurring;
            this.invoicePayload = invoicePayload;
            this.shippingOptionId = shippingOptionId;
            this.orderInfo = orderInfo;
            this.telegramPaymentChargeId = telegramPaymentChargeId;
            this.providerPaymentChargeId = providerPaymentChargeId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageContactRegistered extends MessageContent {

        public static final int CONSTRUCTOR = -1502020353;

        public MessageContactRegistered() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageWebsiteConnected extends MessageContent {
        public static final int CONSTRUCTOR = -1074551800;
        public String domainName;

        public MessageWebsiteConnected() {
        }

        public MessageWebsiteConnected(String domainName) {
            this.domainName = domainName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageWebAppDataSent extends MessageContent {
        public static final int CONSTRUCTOR = -83674862;
        public String buttonText;

        public MessageWebAppDataSent() {
        }

        public MessageWebAppDataSent(String buttonText) {
            this.buttonText = buttonText;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageWebAppDataReceived extends MessageContent {
        public static final int CONSTRUCTOR = -8578539;
        public String buttonText;
        public String data;

        public MessageWebAppDataReceived() {
        }

        public MessageWebAppDataReceived(String buttonText, String data) {
            this.buttonText = buttonText;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePassportDataSent extends MessageContent {
        public static final int CONSTRUCTOR = 1017405171;
        public PassportElementType[] types;

        public MessagePassportDataSent() {
        }

        public MessagePassportDataSent(PassportElementType[] types) {
            this.types = types;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePassportDataReceived extends MessageContent {
        public static final int CONSTRUCTOR = -1367863624;
        public EncryptedPassportElement[] elements;
        public EncryptedCredentials credentials;

        public MessagePassportDataReceived() {
        }

        public MessagePassportDataReceived(EncryptedPassportElement[] elements, EncryptedCredentials credentials) {
            this.elements = elements;
            this.credentials = credentials;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageProximityAlertTriggered extends MessageContent {
        public static final int CONSTRUCTOR = 67761875;
        public MessageSender travelerId;
        public MessageSender watcherId;
        public int distance;

        public MessageProximityAlertTriggered() {
        }

        public MessageProximityAlertTriggered(MessageSender travelerId, MessageSender watcherId, int distance) {
            this.travelerId = travelerId;
            this.watcherId = watcherId;
            this.distance = distance;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageUnsupported extends MessageContent {

        public static final int CONSTRUCTOR = -1816726139;

        public MessageUnsupported() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageCopyOptions extends Object {
        public static final int CONSTRUCTOR = 1208442937;
        public boolean sendCopy;
        public boolean replaceCaption;
        public FormattedText newCaption;

        public MessageCopyOptions() {
        }

        public MessageCopyOptions(boolean sendCopy, boolean replaceCaption, FormattedText newCaption) {
            this.sendCopy = sendCopy;
            this.replaceCaption = replaceCaption;
            this.newCaption = newCaption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageFileType extends Object {
    }

    public static class MessageFileTypePrivate extends MessageFileType {
        public static final int CONSTRUCTOR = -521908524;
        public String name;

        public MessageFileTypePrivate() {
        }

        public MessageFileTypePrivate(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageFileTypeGroup extends MessageFileType {
        public static final int CONSTRUCTOR = -219836568;
        public String title;

        public MessageFileTypeGroup() {
        }

        public MessageFileTypeGroup(String title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageFileTypeUnknown extends MessageFileType {

        public static final int CONSTRUCTOR = 1176353458;

        public MessageFileTypeUnknown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardInfo extends Object {
        public static final int CONSTRUCTOR = -327300408;
        public MessageForwardOrigin origin;
        public int date;
        public String publicServiceAnnouncementType;
        public long fromChatId;
        public long fromMessageId;

        public MessageForwardInfo() {
        }

        public MessageForwardInfo(MessageForwardOrigin origin, int date, String publicServiceAnnouncementType, long fromChatId, long fromMessageId) {
            this.origin = origin;
            this.date = date;
            this.publicServiceAnnouncementType = publicServiceAnnouncementType;
            this.fromChatId = fromChatId;
            this.fromMessageId = fromMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageForwardOrigin extends Object {
    }

    public static class MessageForwardOriginUser extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -355174191;
        public long senderUserId;

        public MessageForwardOriginUser() {
        }

        public MessageForwardOriginUser(long senderUserId) {
            this.senderUserId = senderUserId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardOriginChat extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = 1526010724;
        public long senderChatId;
        public String authorSignature;

        public MessageForwardOriginChat() {
        }

        public MessageForwardOriginChat(long senderChatId, String authorSignature) {
            this.senderChatId = senderChatId;
            this.authorSignature = authorSignature;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardOriginHiddenUser extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -271257885;
        public String senderName;

        public MessageForwardOriginHiddenUser() {
        }

        public MessageForwardOriginHiddenUser(String senderName) {
            this.senderName = senderName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardOriginChannel extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = 1490730723;
        public long chatId;
        public long messageId;
        public String authorSignature;

        public MessageForwardOriginChannel() {
        }

        public MessageForwardOriginChannel(long chatId, long messageId, String authorSignature) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.authorSignature = authorSignature;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageForwardOriginMessageImport extends MessageForwardOrigin {
        public static final int CONSTRUCTOR = -739561951;
        public String senderName;

        public MessageForwardOriginMessageImport() {
        }

        public MessageForwardOriginMessageImport(String senderName) {
            this.senderName = senderName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageInteractionInfo extends Object {
        public static final int CONSTRUCTOR = -574858485;
        public int viewCount;
        public int forwardCount;
        public MessageReplyInfo replyInfo;
        public MessageReaction[] reactions;

        public MessageInteractionInfo() {
        }

        public MessageInteractionInfo(int viewCount, int forwardCount, MessageReplyInfo replyInfo, MessageReaction[] reactions) {
            this.viewCount = viewCount;
            this.forwardCount = forwardCount;
            this.replyInfo = replyInfo;
            this.reactions = reactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageLink extends Object {
        public static final int CONSTRUCTOR = -1354089818;
        public String link;
        public boolean isPublic;

        public MessageLink() {
        }

        public MessageLink(String link, boolean isPublic) {
            this.link = link;
            this.isPublic = isPublic;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageLinkInfo extends Object {
        public static final int CONSTRUCTOR = -981646294;
        public boolean isPublic;
        public long chatId;
        public Message message;
        public int mediaTimestamp;
        public boolean forAlbum;
        public boolean forComment;

        public MessageLinkInfo() {
        }

        public MessageLinkInfo(boolean isPublic, long chatId, Message message, int mediaTimestamp, boolean forAlbum, boolean forComment) {
            this.isPublic = isPublic;
            this.chatId = chatId;
            this.message = message;
            this.mediaTimestamp = mediaTimestamp;
            this.forAlbum = forAlbum;
            this.forComment = forComment;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePosition extends Object {
        public static final int CONSTRUCTOR = 1292189935;
        public int position;
        public long messageId;
        public int date;

        public MessagePosition() {
        }

        public MessagePosition(int position, long messageId, int date) {
            this.position = position;
            this.messageId = messageId;
            this.date = date;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessagePositions extends Object {
        public static final int CONSTRUCTOR = -1930466649;
        public int totalCount;
        public MessagePosition[] positions;

        public MessagePositions() {
        }

        public MessagePositions(int totalCount, MessagePosition[] positions) {
            this.totalCount = totalCount;
            this.positions = positions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageReaction extends Object {
        public static final int CONSTRUCTOR = -1168486082;
        public String reaction;
        public int totalCount;
        public boolean isChosen;
        public MessageSender[] recentSenderIds;

        public MessageReaction() {
        }

        public MessageReaction(String reaction, int totalCount, boolean isChosen, MessageSender[] recentSenderIds) {
            this.reaction = reaction;
            this.totalCount = totalCount;
            this.isChosen = isChosen;
            this.recentSenderIds = recentSenderIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageReplyInfo extends Object {
        public static final int CONSTRUCTOR = -2093702263;
        public int replyCount;
        public MessageSender[] recentReplierIds;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public long lastMessageId;

        public MessageReplyInfo() {
        }

        public MessageReplyInfo(int replyCount, MessageSender[] recentReplierIds, long lastReadInboxMessageId, long lastReadOutboxMessageId, long lastMessageId) {
            this.replyCount = replyCount;
            this.recentReplierIds = recentReplierIds;
            this.lastReadInboxMessageId = lastReadInboxMessageId;
            this.lastReadOutboxMessageId = lastReadOutboxMessageId;
            this.lastMessageId = lastMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageSchedulingState extends Object {
    }

    public static class MessageSchedulingStateSendAtDate extends MessageSchedulingState {
        public static final int CONSTRUCTOR = -1485570073;
        public int sendDate;

        public MessageSchedulingStateSendAtDate() {
        }

        public MessageSchedulingStateSendAtDate(int sendDate) {
            this.sendDate = sendDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSchedulingStateSendWhenOnline extends MessageSchedulingState {

        public static final int CONSTRUCTOR = 2092947464;

        public MessageSchedulingStateSendWhenOnline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSendOptions extends Object {
        public static final int CONSTRUCTOR = -871066572;
        public boolean disableNotification;
        public boolean fromBackground;
        public boolean protectContent;
        public MessageSchedulingState schedulingState;

        public MessageSendOptions() {
        }

        public MessageSendOptions(boolean disableNotification, boolean fromBackground, boolean protectContent, MessageSchedulingState schedulingState) {
            this.disableNotification = disableNotification;
            this.fromBackground = fromBackground;
            this.protectContent = protectContent;
            this.schedulingState = schedulingState;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageSender extends Object {
    }

    public static class MessageSenderUser extends MessageSender {
        public static final int CONSTRUCTOR = -336109341;
        public long userId;

        public MessageSenderUser() {
        }

        public MessageSenderUser(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSenderChat extends MessageSender {
        public static final int CONSTRUCTOR = -239660751;
        public long chatId;

        public MessageSenderChat() {
        }

        public MessageSenderChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSenders extends Object {
        public static final int CONSTRUCTOR = -690158467;
        public int totalCount;
        public MessageSender[] senders;

        public MessageSenders() {
        }

        public MessageSenders(int totalCount, MessageSender[] senders) {
            this.totalCount = totalCount;
            this.senders = senders;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MessageSendingState extends Object {
    }

    public static class MessageSendingStatePending extends MessageSendingState {

        public static final int CONSTRUCTOR = -1381803582;

        public MessageSendingStatePending() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageSendingStateFailed extends MessageSendingState {
        public static final int CONSTRUCTOR = -1741887228;
        public int errorCode;
        public String errorMessage;
        public boolean canRetry;
        public boolean needAnotherSender;
        public double retryAfter;

        public MessageSendingStateFailed() {
        }

        public MessageSendingStateFailed(int errorCode, String errorMessage, boolean canRetry, boolean needAnotherSender, double retryAfter) {
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
            this.canRetry = canRetry;
            this.needAnotherSender = needAnotherSender;
            this.retryAfter = retryAfter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageStatistics extends Object {
        public static final int CONSTRUCTOR = -1011383888;
        public StatisticalGraph messageInteractionGraph;

        public MessageStatistics() {
        }

        public MessageStatistics(StatisticalGraph messageInteractionGraph) {
            this.messageInteractionGraph = messageInteractionGraph;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MessageThreadInfo extends Object {
        public static final int CONSTRUCTOR = -248536056;
        public long chatId;
        public long messageThreadId;
        public MessageReplyInfo replyInfo;
        public int unreadMessageCount;
        public Message[] messages;
        public DraftMessage draftMessage;

        public MessageThreadInfo() {
        }

        public MessageThreadInfo(long chatId, long messageThreadId, MessageReplyInfo replyInfo, int unreadMessageCount, Message[] messages, DraftMessage draftMessage) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.replyInfo = replyInfo;
            this.unreadMessageCount = unreadMessageCount;
            this.messages = messages;
            this.draftMessage = draftMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Messages extends Object {
        public static final int CONSTRUCTOR = -16498159;
        public int totalCount;
        public Message[] messages;

        public Messages() {
        }

        public Messages(int totalCount, Message[] messages) {
            this.totalCount = totalCount;
            this.messages = messages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Minithumbnail extends Object {
        public static final int CONSTRUCTOR = -328540758;
        public int width;
        public int height;
        public byte[] data;

        public Minithumbnail() {
        }

        public Minithumbnail(int width, int height, byte[] data) {
            this.width = width;
            this.height = height;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkStatistics extends Object {
        public static final int CONSTRUCTOR = 1615554212;
        public int sinceDate;
        public NetworkStatisticsEntry[] entries;

        public NetworkStatistics() {
        }

        public NetworkStatistics(int sinceDate, NetworkStatisticsEntry[] entries) {
            this.sinceDate = sinceDate;
            this.entries = entries;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class NetworkStatisticsEntry extends Object {
    }

    public static class NetworkStatisticsEntryFile extends NetworkStatisticsEntry {
        public static final int CONSTRUCTOR = 188452706;
        public FileType fileType;
        public NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;

        public NetworkStatisticsEntryFile() {
        }

        public NetworkStatisticsEntryFile(FileType fileType, NetworkType networkType, long sentBytes, long receivedBytes) {
            this.fileType = fileType;
            this.networkType = networkType;
            this.sentBytes = sentBytes;
            this.receivedBytes = receivedBytes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkStatisticsEntryCall extends NetworkStatisticsEntry {
        public static final int CONSTRUCTOR = 737000365;
        public NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;
        public double duration;

        public NetworkStatisticsEntryCall() {
        }

        public NetworkStatisticsEntryCall(NetworkType networkType, long sentBytes, long receivedBytes, double duration) {
            this.networkType = networkType;
            this.sentBytes = sentBytes;
            this.receivedBytes = receivedBytes;
            this.duration = duration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class NetworkType extends Object {
    }

    public static class NetworkTypeNone extends NetworkType {

        public static final int CONSTRUCTOR = -1971691759;

        public NetworkTypeNone() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeMobile extends NetworkType {

        public static final int CONSTRUCTOR = 819228239;

        public NetworkTypeMobile() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeMobileRoaming extends NetworkType {

        public static final int CONSTRUCTOR = -1435199760;

        public NetworkTypeMobileRoaming() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeWiFi extends NetworkType {

        public static final int CONSTRUCTOR = -633872070;

        public NetworkTypeWiFi() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NetworkTypeOther extends NetworkType {

        public static final int CONSTRUCTOR = 1942128539;

        public NetworkTypeOther() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Notification extends Object {
        public static final int CONSTRUCTOR = 788743120;
        public int id;
        public int date;
        public boolean isSilent;
        public NotificationType type;

        public Notification() {
        }

        public Notification(int id, int date, boolean isSilent, NotificationType type) {
            this.id = id;
            this.date = date;
            this.isSilent = isSilent;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroup extends Object {
        public static final int CONSTRUCTOR = 780691541;
        public int id;
        public NotificationGroupType type;
        public long chatId;
        public int totalCount;
        public Notification[] notifications;

        public NotificationGroup() {
        }

        public NotificationGroup(int id, NotificationGroupType type, long chatId, int totalCount, Notification[] notifications) {
            this.id = id;
            this.type = type;
            this.chatId = chatId;
            this.totalCount = totalCount;
            this.notifications = notifications;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class NotificationGroupType extends Object {
    }

    public static class NotificationGroupTypeMessages extends NotificationGroupType {

        public static final int CONSTRUCTOR = -1702481123;

        public NotificationGroupTypeMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeMentions extends NotificationGroupType {

        public static final int CONSTRUCTOR = -2050324051;

        public NotificationGroupTypeMentions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeSecretChat extends NotificationGroupType {

        public static final int CONSTRUCTOR = 1390759476;

        public NotificationGroupTypeSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationGroupTypeCalls extends NotificationGroupType {

        public static final int CONSTRUCTOR = 1379123538;

        public NotificationGroupTypeCalls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class NotificationSettingsScope extends Object {
    }

    public static class NotificationSettingsScopePrivateChats extends NotificationSettingsScope {

        public static final int CONSTRUCTOR = 937446759;

        public NotificationSettingsScopePrivateChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSettingsScopeGroupChats extends NotificationSettingsScope {

        public static final int CONSTRUCTOR = 1212142067;

        public NotificationSettingsScopeGroupChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSettingsScopeChannelChats extends NotificationSettingsScope {

        public static final int CONSTRUCTOR = 548013448;

        public NotificationSettingsScopeChannelChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSound extends Object {
        public static final int CONSTRUCTOR = -185638601;
        public long id;
        public int duration;
        public int date;
        public String title;
        public String data;
        public File sound;

        public NotificationSound() {
        }

        public NotificationSound(long id, int duration, int date, String title, String data, File sound) {
            this.id = id;
            this.duration = duration;
            this.date = date;
            this.title = title;
            this.data = data;
            this.sound = sound;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationSounds extends Object {
        public static final int CONSTRUCTOR = -630813169;
        public NotificationSound[] notificationSounds;

        public NotificationSounds() {
        }

        public NotificationSounds(NotificationSound[] notificationSounds) {
            this.notificationSounds = notificationSounds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class NotificationType extends Object {
    }

    public static class NotificationTypeNewMessage extends NotificationType {
        public static final int CONSTRUCTOR = -254745614;
        public Message message;
        public boolean showPreview;

        public NotificationTypeNewMessage() {
        }

        public NotificationTypeNewMessage(Message message, boolean showPreview) {
            this.message = message;
            this.showPreview = showPreview;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationTypeNewSecretChat extends NotificationType {

        public static final int CONSTRUCTOR = 1198638768;

        public NotificationTypeNewSecretChat() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationTypeNewCall extends NotificationType {
        public static final int CONSTRUCTOR = 1712734585;
        public int callId;

        public NotificationTypeNewCall() {
        }

        public NotificationTypeNewCall(int callId) {
            this.callId = callId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class NotificationTypeNewPushMessage extends NotificationType {
        public static final int CONSTRUCTOR = -711680462;
        public long messageId;
        public MessageSender senderId;
        public String senderName;
        public boolean isOutgoing;
        public PushMessageContent content;

        public NotificationTypeNewPushMessage() {
        }

        public NotificationTypeNewPushMessage(long messageId, MessageSender senderId, String senderName, boolean isOutgoing, PushMessageContent content) {
            this.messageId = messageId;
            this.senderId = senderId;
            this.senderName = senderName;
            this.isOutgoing = isOutgoing;
            this.content = content;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Ok extends Object {

        public static final int CONSTRUCTOR = -722616727;

        public Ok() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class OptionValue extends Object {
    }

    public static class OptionValueBoolean extends OptionValue {
        public static final int CONSTRUCTOR = 63135518;
        public boolean value;

        public OptionValueBoolean() {
        }

        public OptionValueBoolean(boolean value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionValueEmpty extends OptionValue {

        public static final int CONSTRUCTOR = 918955155;

        public OptionValueEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionValueInteger extends OptionValue {
        public static final int CONSTRUCTOR = -186858780;
        public long value;

        public OptionValueInteger() {
        }

        public OptionValueInteger(long value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionValueString extends OptionValue {
        public static final int CONSTRUCTOR = 756248212;
        public String value;

        public OptionValueString() {
        }

        public OptionValueString(String value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OrderInfo extends Object {
        public static final int CONSTRUCTOR = 783997294;
        public String name;
        public String phoneNumber;
        public String emailAddress;
        public Address shippingAddress;

        public OrderInfo() {
        }

        public OrderInfo(String name, String phoneNumber, String emailAddress, Address shippingAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
            this.shippingAddress = shippingAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PageBlock extends Object {
    }

    public static class PageBlockTitle extends PageBlock {
        public static final int CONSTRUCTOR = 1629664784;
        public RichText title;

        public PageBlockTitle() {
        }

        public PageBlockTitle(RichText title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockSubtitle extends PageBlock {
        public static final int CONSTRUCTOR = 264524263;
        public RichText subtitle;

        public PageBlockSubtitle() {
        }

        public PageBlockSubtitle(RichText subtitle) {
            this.subtitle = subtitle;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockAuthorDate extends PageBlock {
        public static final int CONSTRUCTOR = 1300231184;
        public RichText author;
        public int publishDate;

        public PageBlockAuthorDate() {
        }

        public PageBlockAuthorDate(RichText author, int publishDate) {
            this.author = author;
            this.publishDate = publishDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockHeader extends PageBlock {
        public static final int CONSTRUCTOR = 1402854811;
        public RichText header;

        public PageBlockHeader() {
        }

        public PageBlockHeader(RichText header) {
            this.header = header;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockSubheader extends PageBlock {
        public static final int CONSTRUCTOR = 1263956774;
        public RichText subheader;

        public PageBlockSubheader() {
        }

        public PageBlockSubheader(RichText subheader) {
            this.subheader = subheader;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockKicker extends PageBlock {
        public static final int CONSTRUCTOR = 1361282635;
        public RichText kicker;

        public PageBlockKicker() {
        }

        public PageBlockKicker(RichText kicker) {
            this.kicker = kicker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockParagraph extends PageBlock {
        public static final int CONSTRUCTOR = 1182402406;
        public RichText text;

        public PageBlockParagraph() {
        }

        public PageBlockParagraph(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockPreformatted extends PageBlock {
        public static final int CONSTRUCTOR = -1066346178;
        public RichText text;
        public String language;

        public PageBlockPreformatted() {
        }

        public PageBlockPreformatted(RichText text, String language) {
            this.text = text;
            this.language = language;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockFooter extends PageBlock {
        public static final int CONSTRUCTOR = 886429480;
        public RichText footer;

        public PageBlockFooter() {
        }

        public PageBlockFooter(RichText footer) {
            this.footer = footer;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockDivider extends PageBlock {

        public static final int CONSTRUCTOR = -618614392;

        public PageBlockDivider() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockAnchor extends PageBlock {
        public static final int CONSTRUCTOR = -837994576;
        public String name;

        public PageBlockAnchor() {
        }

        public PageBlockAnchor(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockList extends PageBlock {
        public static final int CONSTRUCTOR = -1037074852;
        public PageBlockListItem[] items;

        public PageBlockList() {
        }

        public PageBlockList(PageBlockListItem[] items) {
            this.items = items;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockBlockQuote extends PageBlock {
        public static final int CONSTRUCTOR = 1657834142;
        public RichText text;
        public RichText credit;

        public PageBlockBlockQuote() {
        }

        public PageBlockBlockQuote(RichText text, RichText credit) {
            this.text = text;
            this.credit = credit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockPullQuote extends PageBlock {
        public static final int CONSTRUCTOR = 490242317;
        public RichText text;
        public RichText credit;

        public PageBlockPullQuote() {
        }

        public PageBlockPullQuote(RichText text, RichText credit) {
            this.text = text;
            this.credit = credit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockAnimation extends PageBlock {
        public static final int CONSTRUCTOR = 1355669513;
        public Animation animation;
        public PageBlockCaption caption;
        public boolean needAutoplay;

        public PageBlockAnimation() {
        }

        public PageBlockAnimation(Animation animation, PageBlockCaption caption, boolean needAutoplay) {
            this.animation = animation;
            this.caption = caption;
            this.needAutoplay = needAutoplay;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockAudio extends PageBlock {
        public static final int CONSTRUCTOR = -63371245;
        public Audio audio;
        public PageBlockCaption caption;

        public PageBlockAudio() {
        }

        public PageBlockAudio(Audio audio, PageBlockCaption caption) {
            this.audio = audio;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockPhoto extends PageBlock {
        public static final int CONSTRUCTOR = 417601156;
        public Photo photo;
        public PageBlockCaption caption;
        public String url;

        public PageBlockPhoto() {
        }

        public PageBlockPhoto(Photo photo, PageBlockCaption caption, String url) {
            this.photo = photo;
            this.caption = caption;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVideo extends PageBlock {
        public static final int CONSTRUCTOR = 510041394;
        public Video video;
        public PageBlockCaption caption;
        public boolean needAutoplay;
        public boolean isLooped;

        public PageBlockVideo() {
        }

        public PageBlockVideo(Video video, PageBlockCaption caption, boolean needAutoplay, boolean isLooped) {
            this.video = video;
            this.caption = caption;
            this.needAutoplay = needAutoplay;
            this.isLooped = isLooped;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVoiceNote extends PageBlock {
        public static final int CONSTRUCTOR = 1823310463;
        public VoiceNote voiceNote;
        public PageBlockCaption caption;

        public PageBlockVoiceNote() {
        }

        public PageBlockVoiceNote(VoiceNote voiceNote, PageBlockCaption caption) {
            this.voiceNote = voiceNote;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockCover extends PageBlock {
        public static final int CONSTRUCTOR = 972174080;
        public PageBlock cover;

        public PageBlockCover() {
        }

        public PageBlockCover(PageBlock cover) {
            this.cover = cover;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockEmbedded extends PageBlock {
        public static final int CONSTRUCTOR = -1942577763;
        public String url;
        public String html;
        public Photo posterPhoto;
        public int width;
        public int height;
        public PageBlockCaption caption;
        public boolean isFullWidth;
        public boolean allowScrolling;

        public PageBlockEmbedded() {
        }

        public PageBlockEmbedded(String url, String html, Photo posterPhoto, int width, int height, PageBlockCaption caption, boolean isFullWidth, boolean allowScrolling) {
            this.url = url;
            this.html = html;
            this.posterPhoto = posterPhoto;
            this.width = width;
            this.height = height;
            this.caption = caption;
            this.isFullWidth = isFullWidth;
            this.allowScrolling = allowScrolling;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockEmbeddedPost extends PageBlock {
        public static final int CONSTRUCTOR = 397600949;
        public String url;
        public String author;
        public Photo authorPhoto;
        public int date;
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;

        public PageBlockEmbeddedPost() {
        }

        public PageBlockEmbeddedPost(String url, String author, Photo authorPhoto, int date, PageBlock[] pageBlocks, PageBlockCaption caption) {
            this.url = url;
            this.author = author;
            this.authorPhoto = authorPhoto;
            this.date = date;
            this.pageBlocks = pageBlocks;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockCollage extends PageBlock {
        public static final int CONSTRUCTOR = 1163760110;
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;

        public PageBlockCollage() {
        }

        public PageBlockCollage(PageBlock[] pageBlocks, PageBlockCaption caption) {
            this.pageBlocks = pageBlocks;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockSlideshow extends PageBlock {
        public static final int CONSTRUCTOR = 539217375;
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;

        public PageBlockSlideshow() {
        }

        public PageBlockSlideshow(PageBlock[] pageBlocks, PageBlockCaption caption) {
            this.pageBlocks = pageBlocks;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockChatLink extends PageBlock {
        public static final int CONSTRUCTOR = -202091253;
        public String title;
        public ChatPhotoInfo photo;
        public String username;

        public PageBlockChatLink() {
        }

        public PageBlockChatLink(String title, ChatPhotoInfo photo, String username) {
            this.title = title;
            this.photo = photo;
            this.username = username;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockTable extends PageBlock {
        public static final int CONSTRUCTOR = -942649288;
        public RichText caption;
        public PageBlockTableCell[][] cells;
        public boolean isBordered;
        public boolean isStriped;

        public PageBlockTable() {
        }

        public PageBlockTable(RichText caption, PageBlockTableCell[][] cells, boolean isBordered, boolean isStriped) {
            this.caption = caption;
            this.cells = cells;
            this.isBordered = isBordered;
            this.isStriped = isStriped;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockDetails extends PageBlock {
        public static final int CONSTRUCTOR = -1599869809;
        public RichText header;
        public PageBlock[] pageBlocks;
        public boolean isOpen;

        public PageBlockDetails() {
        }

        public PageBlockDetails(RichText header, PageBlock[] pageBlocks, boolean isOpen) {
            this.header = header;
            this.pageBlocks = pageBlocks;
            this.isOpen = isOpen;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockRelatedArticles extends PageBlock {
        public static final int CONSTRUCTOR = -1807324374;
        public RichText header;
        public PageBlockRelatedArticle[] articles;

        public PageBlockRelatedArticles() {
        }

        public PageBlockRelatedArticles(RichText header, PageBlockRelatedArticle[] articles) {
            this.header = header;
            this.articles = articles;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockMap extends PageBlock {
        public static final int CONSTRUCTOR = 1510961171;
        public Location location;
        public int zoom;
        public int width;
        public int height;
        public PageBlockCaption caption;

        public PageBlockMap() {
        }

        public PageBlockMap(Location location, int zoom, int width, int height, PageBlockCaption caption) {
            this.location = location;
            this.zoom = zoom;
            this.width = width;
            this.height = height;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockCaption extends Object {
        public static final int CONSTRUCTOR = -1180064650;
        public RichText text;
        public RichText credit;

        public PageBlockCaption() {
        }

        public PageBlockCaption(RichText text, RichText credit) {
            this.text = text;
            this.credit = credit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PageBlockHorizontalAlignment extends Object {
    }

    public static class PageBlockHorizontalAlignmentLeft extends PageBlockHorizontalAlignment {

        public static final int CONSTRUCTOR = 848701417;

        public PageBlockHorizontalAlignmentLeft() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockHorizontalAlignmentCenter extends PageBlockHorizontalAlignment {

        public static final int CONSTRUCTOR = -1009203990;

        public PageBlockHorizontalAlignmentCenter() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockHorizontalAlignmentRight extends PageBlockHorizontalAlignment {

        public static final int CONSTRUCTOR = 1371369214;

        public PageBlockHorizontalAlignmentRight() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockListItem extends Object {
        public static final int CONSTRUCTOR = 323186259;
        public String label;
        public PageBlock[] pageBlocks;

        public PageBlockListItem() {
        }

        public PageBlockListItem(String label, PageBlock[] pageBlocks) {
            this.label = label;
            this.pageBlocks = pageBlocks;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockRelatedArticle extends Object {
        public static final int CONSTRUCTOR = 481199251;
        public String url;
        public String title;
        public String description;
        public Photo photo;
        public String author;
        public int publishDate;

        public PageBlockRelatedArticle() {
        }

        public PageBlockRelatedArticle(String url, String title, String description, Photo photo, String author, int publishDate) {
            this.url = url;
            this.title = title;
            this.description = description;
            this.photo = photo;
            this.author = author;
            this.publishDate = publishDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockTableCell extends Object {
        public static final int CONSTRUCTOR = 1417658214;
        public RichText text;
        public boolean isHeader;
        public int colspan;
        public int rowspan;
        public PageBlockHorizontalAlignment align;
        public PageBlockVerticalAlignment valign;

        public PageBlockTableCell() {
        }

        public PageBlockTableCell(RichText text, boolean isHeader, int colspan, int rowspan, PageBlockHorizontalAlignment align, PageBlockVerticalAlignment valign) {
            this.text = text;
            this.isHeader = isHeader;
            this.colspan = colspan;
            this.rowspan = rowspan;
            this.align = align;
            this.valign = valign;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PageBlockVerticalAlignment extends Object {
    }

    public static class PageBlockVerticalAlignmentTop extends PageBlockVerticalAlignment {

        public static final int CONSTRUCTOR = 195500454;

        public PageBlockVerticalAlignmentTop() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVerticalAlignmentMiddle extends PageBlockVerticalAlignment {

        public static final int CONSTRUCTOR = -2123096587;

        public PageBlockVerticalAlignmentMiddle() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PageBlockVerticalAlignmentBottom extends PageBlockVerticalAlignment {

        public static final int CONSTRUCTOR = 2092531158;

        public PageBlockVerticalAlignmentBottom() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportAuthorizationForm extends Object {
        public static final int CONSTRUCTOR = -1070673218;
        public int id;
        public PassportRequiredElement[] requiredElements;
        public String privacyPolicyUrl;

        public PassportAuthorizationForm() {
        }

        public PassportAuthorizationForm(int id, PassportRequiredElement[] requiredElements, String privacyPolicyUrl) {
            this.id = id;
            this.requiredElements = requiredElements;
            this.privacyPolicyUrl = privacyPolicyUrl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PassportElement extends Object {
    }

    public static class PassportElementPersonalDetails extends PassportElement {
        public static final int CONSTRUCTOR = 1217724035;
        public PersonalDetails personalDetails;

        public PassportElementPersonalDetails() {
        }

        public PassportElementPersonalDetails(PersonalDetails personalDetails) {
            this.personalDetails = personalDetails;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementPassport extends PassportElement {
        public static final int CONSTRUCTOR = -263985373;
        public IdentityDocument passport;

        public PassportElementPassport() {
        }

        public PassportElementPassport(IdentityDocument passport) {
            this.passport = passport;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementDriverLicense extends PassportElement {
        public static final int CONSTRUCTOR = 1643580589;
        public IdentityDocument driverLicense;

        public PassportElementDriverLicense() {
        }

        public PassportElementDriverLicense(IdentityDocument driverLicense) {
            this.driverLicense = driverLicense;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementIdentityCard extends PassportElement {
        public static final int CONSTRUCTOR = 2083775797;
        public IdentityDocument identityCard;

        public PassportElementIdentityCard() {
        }

        public PassportElementIdentityCard(IdentityDocument identityCard) {
            this.identityCard = identityCard;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementInternalPassport extends PassportElement {
        public static final int CONSTRUCTOR = 36220295;
        public IdentityDocument internalPassport;

        public PassportElementInternalPassport() {
        }

        public PassportElementInternalPassport(IdentityDocument internalPassport) {
            this.internalPassport = internalPassport;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementAddress extends PassportElement {
        public static final int CONSTRUCTOR = -782625232;
        public Address address;

        public PassportElementAddress() {
        }

        public PassportElementAddress(Address address) {
            this.address = address;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementUtilityBill extends PassportElement {
        public static final int CONSTRUCTOR = -234611246;
        public PersonalDocument utilityBill;

        public PassportElementUtilityBill() {
        }

        public PassportElementUtilityBill(PersonalDocument utilityBill) {
            this.utilityBill = utilityBill;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementBankStatement extends PassportElement {
        public static final int CONSTRUCTOR = -366464408;
        public PersonalDocument bankStatement;

        public PassportElementBankStatement() {
        }

        public PassportElementBankStatement(PersonalDocument bankStatement) {
            this.bankStatement = bankStatement;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementRentalAgreement extends PassportElement {
        public static final int CONSTRUCTOR = -290141400;
        public PersonalDocument rentalAgreement;

        public PassportElementRentalAgreement() {
        }

        public PassportElementRentalAgreement(PersonalDocument rentalAgreement) {
            this.rentalAgreement = rentalAgreement;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementPassportRegistration extends PassportElement {
        public static final int CONSTRUCTOR = 618323071;
        public PersonalDocument passportRegistration;

        public PassportElementPassportRegistration() {
        }

        public PassportElementPassportRegistration(PersonalDocument passportRegistration) {
            this.passportRegistration = passportRegistration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTemporaryRegistration extends PassportElement {
        public static final int CONSTRUCTOR = 1237626864;
        public PersonalDocument temporaryRegistration;

        public PassportElementTemporaryRegistration() {
        }

        public PassportElementTemporaryRegistration(PersonalDocument temporaryRegistration) {
            this.temporaryRegistration = temporaryRegistration;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementPhoneNumber extends PassportElement {
        public static final int CONSTRUCTOR = -1320118375;
        public String phoneNumber;

        public PassportElementPhoneNumber() {
        }

        public PassportElementPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementEmailAddress extends PassportElement {
        public static final int CONSTRUCTOR = -1528129531;
        public String emailAddress;

        public PassportElementEmailAddress() {
        }

        public PassportElementEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementError extends Object {
        public static final int CONSTRUCTOR = -1861902395;
        public PassportElementType type;
        public String message;
        public PassportElementErrorSource source;

        public PassportElementError() {
        }

        public PassportElementError(PassportElementType type, String message, PassportElementErrorSource source) {
            this.type = type;
            this.message = message;
            this.source = source;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PassportElementErrorSource extends Object {
    }

    public static class PassportElementErrorSourceUnspecified extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = -378320830;

        public PassportElementErrorSourceUnspecified() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceDataField extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -308650776;
        public String fieldName;

        public PassportElementErrorSourceDataField() {
        }

        public PassportElementErrorSourceDataField(String fieldName) {
            this.fieldName = fieldName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceFrontSide extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = 1895658292;

        public PassportElementErrorSourceFrontSide() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceReverseSide extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = 1918630391;

        public PassportElementErrorSourceReverseSide() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceSelfie extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = -797043672;

        public PassportElementErrorSourceSelfie() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceTranslationFile extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -689621228;
        public int fileIndex;

        public PassportElementErrorSourceTranslationFile() {
        }

        public PassportElementErrorSourceTranslationFile(int fileIndex) {
            this.fileIndex = fileIndex;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceTranslationFiles extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = 581280796;

        public PassportElementErrorSourceTranslationFiles() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceFile extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 2020358960;
        public int fileIndex;

        public PassportElementErrorSourceFile() {
        }

        public PassportElementErrorSourceFile(int fileIndex) {
            this.fileIndex = fileIndex;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementErrorSourceFiles extends PassportElementErrorSource {

        public static final int CONSTRUCTOR = 1894164178;

        public PassportElementErrorSourceFiles() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PassportElementType extends Object {
    }

    public static class PassportElementTypePersonalDetails extends PassportElementType {

        public static final int CONSTRUCTOR = -1032136365;

        public PassportElementTypePersonalDetails() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePassport extends PassportElementType {

        public static final int CONSTRUCTOR = -436360376;

        public PassportElementTypePassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeDriverLicense extends PassportElementType {

        public static final int CONSTRUCTOR = 1827298379;

        public PassportElementTypeDriverLicense() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeIdentityCard extends PassportElementType {

        public static final int CONSTRUCTOR = -502356132;

        public PassportElementTypeIdentityCard() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeInternalPassport extends PassportElementType {

        public static final int CONSTRUCTOR = -793781959;

        public PassportElementTypeInternalPassport() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeAddress extends PassportElementType {

        public static final int CONSTRUCTOR = 496327874;

        public PassportElementTypeAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeUtilityBill extends PassportElementType {

        public static final int CONSTRUCTOR = 627084906;

        public PassportElementTypeUtilityBill() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeBankStatement extends PassportElementType {

        public static final int CONSTRUCTOR = 574095667;

        public PassportElementTypeBankStatement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeRentalAgreement extends PassportElementType {

        public static final int CONSTRUCTOR = -2060583280;

        public PassportElementTypeRentalAgreement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePassportRegistration extends PassportElementType {

        public static final int CONSTRUCTOR = -159478209;

        public PassportElementTypePassportRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeTemporaryRegistration extends PassportElementType {

        public static final int CONSTRUCTOR = 1092498527;

        public PassportElementTypeTemporaryRegistration() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypePhoneNumber extends PassportElementType {

        public static final int CONSTRUCTOR = -995361172;

        public PassportElementTypePhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementTypeEmailAddress extends PassportElementType {

        public static final int CONSTRUCTOR = -79321405;

        public PassportElementTypeEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElements extends Object {
        public static final int CONSTRUCTOR = 1264617556;
        public PassportElement[] elements;

        public PassportElements() {
        }

        public PassportElements(PassportElement[] elements) {
            this.elements = elements;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportElementsWithErrors extends Object {
        public static final int CONSTRUCTOR = 1308923044;
        public PassportElement[] elements;
        public PassportElementError[] errors;

        public PassportElementsWithErrors() {
        }

        public PassportElementsWithErrors(PassportElement[] elements, PassportElementError[] errors) {
            this.elements = elements;
            this.errors = errors;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportRequiredElement extends Object {
        public static final int CONSTRUCTOR = -1983641651;
        public PassportSuitableElement[] suitableElements;

        public PassportRequiredElement() {
        }

        public PassportRequiredElement(PassportSuitableElement[] suitableElements) {
            this.suitableElements = suitableElements;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PassportSuitableElement extends Object {
        public static final int CONSTRUCTOR = -789019876;
        public PassportElementType type;
        public boolean isSelfieRequired;
        public boolean isTranslationRequired;
        public boolean isNativeNameRequired;

        public PassportSuitableElement() {
        }

        public PassportSuitableElement(PassportElementType type, boolean isSelfieRequired, boolean isTranslationRequired, boolean isNativeNameRequired) {
            this.type = type;
            this.isSelfieRequired = isSelfieRequired;
            this.isTranslationRequired = isTranslationRequired;
            this.isNativeNameRequired = isNativeNameRequired;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PasswordState extends Object {
        public static final int CONSTRUCTOR = -2001619202;
        public boolean hasPassword;
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public boolean hasPassportData;
        public EmailAddressAuthenticationCodeInfo recoveryEmailAddressCodeInfo;
        public int pendingResetDate;

        public PasswordState() {
        }

        public PasswordState(boolean hasPassword, String passwordHint, boolean hasRecoveryEmailAddress, boolean hasPassportData, EmailAddressAuthenticationCodeInfo recoveryEmailAddressCodeInfo, int pendingResetDate) {
            this.hasPassword = hasPassword;
            this.passwordHint = passwordHint;
            this.hasRecoveryEmailAddress = hasRecoveryEmailAddress;
            this.hasPassportData = hasPassportData;
            this.recoveryEmailAddressCodeInfo = recoveryEmailAddressCodeInfo;
            this.pendingResetDate = pendingResetDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PaymentForm extends Object {
        public static final int CONSTRUCTOR = -2120909129;
        public long id;
        public Invoice invoice;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public PaymentProvider paymentProvider;
        public OrderInfo savedOrderInfo;
        public SavedCredentials savedCredentials;
        public boolean canSaveCredentials;
        public boolean needPassword;
        public String productTitle;
        public FormattedText productDescription;
        public Photo productPhoto;

        public PaymentForm() {
        }

        public PaymentForm(long id, Invoice invoice, long sellerBotUserId, long paymentProviderUserId, PaymentProvider paymentProvider, OrderInfo savedOrderInfo, SavedCredentials savedCredentials, boolean canSaveCredentials, boolean needPassword, String productTitle, FormattedText productDescription, Photo productPhoto) {
            this.id = id;
            this.invoice = invoice;
            this.sellerBotUserId = sellerBotUserId;
            this.paymentProviderUserId = paymentProviderUserId;
            this.paymentProvider = paymentProvider;
            this.savedOrderInfo = savedOrderInfo;
            this.savedCredentials = savedCredentials;
            this.canSaveCredentials = canSaveCredentials;
            this.needPassword = needPassword;
            this.productTitle = productTitle;
            this.productDescription = productDescription;
            this.productPhoto = productPhoto;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PaymentProvider extends Object {
    }

    public static class PaymentProviderSmartGlocal extends PaymentProvider {
        public static final int CONSTRUCTOR = 1800479470;
        public String publicToken;

        public PaymentProviderSmartGlocal() {
        }

        public PaymentProviderSmartGlocal(String publicToken) {
            this.publicToken = publicToken;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PaymentProviderStripe extends PaymentProvider {
        public static final int CONSTRUCTOR = 370467227;
        public String publishableKey;
        public boolean needCountry;
        public boolean needPostalCode;
        public boolean needCardholderName;

        public PaymentProviderStripe() {
        }

        public PaymentProviderStripe(String publishableKey, boolean needCountry, boolean needPostalCode, boolean needCardholderName) {
            this.publishableKey = publishableKey;
            this.needCountry = needCountry;
            this.needPostalCode = needPostalCode;
            this.needCardholderName = needCardholderName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PaymentProviderOther extends PaymentProvider {
        public static final int CONSTRUCTOR = -1336876828;
        public String url;

        public PaymentProviderOther() {
        }

        public PaymentProviderOther(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PaymentReceipt extends Object {
        public static final int CONSTRUCTOR = -400955711;
        public String title;
        public FormattedText description;
        public Photo photo;
        public int date;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public Invoice invoice;
        public OrderInfo orderInfo;
        public ShippingOption shippingOption;
        public String credentialsTitle;
        public long tipAmount;

        public PaymentReceipt() {
        }

        public PaymentReceipt(String title, FormattedText description, Photo photo, int date, long sellerBotUserId, long paymentProviderUserId, Invoice invoice, OrderInfo orderInfo, ShippingOption shippingOption, String credentialsTitle, long tipAmount) {
            this.title = title;
            this.description = description;
            this.photo = photo;
            this.date = date;
            this.sellerBotUserId = sellerBotUserId;
            this.paymentProviderUserId = paymentProviderUserId;
            this.invoice = invoice;
            this.orderInfo = orderInfo;
            this.shippingOption = shippingOption;
            this.credentialsTitle = credentialsTitle;
            this.tipAmount = tipAmount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PaymentResult extends Object {
        public static final int CONSTRUCTOR = -804263843;
        public boolean success;
        public String verificationUrl;

        public PaymentResult() {
        }

        public PaymentResult(boolean success, String verificationUrl) {
            this.success = success;
            this.verificationUrl = verificationUrl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PersonalDetails extends Object {
        public static final int CONSTRUCTOR = -1061656137;
        public String firstName;
        public String middleName;
        public String lastName;
        public String nativeFirstName;
        public String nativeMiddleName;
        public String nativeLastName;
        public Date birthdate;
        public String gender;
        public String countryCode;
        public String residenceCountryCode;

        public PersonalDetails() {
        }

        public PersonalDetails(String firstName, String middleName, String lastName, String nativeFirstName, String nativeMiddleName, String nativeLastName, Date birthdate, String gender, String countryCode, String residenceCountryCode) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.nativeFirstName = nativeFirstName;
            this.nativeMiddleName = nativeMiddleName;
            this.nativeLastName = nativeLastName;
            this.birthdate = birthdate;
            this.gender = gender;
            this.countryCode = countryCode;
            this.residenceCountryCode = residenceCountryCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PersonalDocument extends Object {
        public static final int CONSTRUCTOR = -1011634661;
        public DatedFile[] files;
        public DatedFile[] translation;

        public PersonalDocument() {
        }

        public PersonalDocument(DatedFile[] files, DatedFile[] translation) {
            this.files = files;
            this.translation = translation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PhoneNumberAuthenticationSettings extends Object {
        public static final int CONSTRUCTOR = -421219756;
        public boolean allowFlashCall;
        public boolean allowMissedCall;
        public boolean isCurrentPhoneNumber;
        public boolean allowSmsRetrieverApi;
        public String[] authenticationTokens;

        public PhoneNumberAuthenticationSettings() {
        }

        public PhoneNumberAuthenticationSettings(boolean allowFlashCall, boolean allowMissedCall, boolean isCurrentPhoneNumber, boolean allowSmsRetrieverApi, String[] authenticationTokens) {
            this.allowFlashCall = allowFlashCall;
            this.allowMissedCall = allowMissedCall;
            this.isCurrentPhoneNumber = isCurrentPhoneNumber;
            this.allowSmsRetrieverApi = allowSmsRetrieverApi;
            this.authenticationTokens = authenticationTokens;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PhoneNumberInfo extends Object {
        public static final int CONSTRUCTOR = 560180961;
        public CountryInfo country;
        public String countryCallingCode;
        public String formattedPhoneNumber;

        public PhoneNumberInfo() {
        }

        public PhoneNumberInfo(CountryInfo country, String countryCallingCode, String formattedPhoneNumber) {
            this.country = country;
            this.countryCallingCode = countryCallingCode;
            this.formattedPhoneNumber = formattedPhoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Photo extends Object {
        public static final int CONSTRUCTOR = -2022871583;
        public boolean hasStickers;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;

        public Photo() {
        }

        public Photo(boolean hasStickers, Minithumbnail minithumbnail, PhotoSize[] sizes) {
            this.hasStickers = hasStickers;
            this.minithumbnail = minithumbnail;
            this.sizes = sizes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PhotoSize extends Object {
        public static final int CONSTRUCTOR = 1609182352;
        public String type;
        public File photo;
        public int width;
        public int height;
        public int[] progressiveSizes;

        public PhotoSize() {
        }

        public PhotoSize(String type, File photo, int width, int height, int[] progressiveSizes) {
            this.type = type;
            this.photo = photo;
            this.width = width;
            this.height = height;
            this.progressiveSizes = progressiveSizes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Point extends Object {
        public static final int CONSTRUCTOR = 437515705;
        public double x;
        public double y;

        public Point() {
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Poll extends Object {
        public static final int CONSTRUCTOR = 116940085;
        public long id;
        public String question;
        public PollOption[] options;
        public int totalVoterCount;
        public long[] recentVoterUserIds;
        public boolean isAnonymous;
        public PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;

        public Poll() {
        }

        public Poll(long id, String question, PollOption[] options, int totalVoterCount, long[] recentVoterUserIds, boolean isAnonymous, PollType type, int openPeriod, int closeDate, boolean isClosed) {
            this.id = id;
            this.question = question;
            this.options = options;
            this.totalVoterCount = totalVoterCount;
            this.recentVoterUserIds = recentVoterUserIds;
            this.isAnonymous = isAnonymous;
            this.type = type;
            this.openPeriod = openPeriod;
            this.closeDate = closeDate;
            this.isClosed = isClosed;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PollOption extends Object {
        public static final int CONSTRUCTOR = 1473893797;
        public String text;
        public int voterCount;
        public int votePercentage;
        public boolean isChosen;
        public boolean isBeingChosen;

        public PollOption() {
        }

        public PollOption(String text, int voterCount, int votePercentage, boolean isChosen, boolean isBeingChosen) {
            this.text = text;
            this.voterCount = voterCount;
            this.votePercentage = votePercentage;
            this.isChosen = isChosen;
            this.isBeingChosen = isBeingChosen;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PollType extends Object {
    }

    public static class PollTypeRegular extends PollType {
        public static final int CONSTRUCTOR = 641265698;
        public boolean allowMultipleAnswers;

        public PollTypeRegular() {
        }

        public PollTypeRegular(boolean allowMultipleAnswers) {
            this.allowMultipleAnswers = allowMultipleAnswers;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PollTypeQuiz extends PollType {
        public static final int CONSTRUCTOR = 657013913;
        public int correctOptionId;
        public FormattedText explanation;

        public PollTypeQuiz() {
        }

        public PollTypeQuiz(int correctOptionId, FormattedText explanation) {
            this.correctOptionId = correctOptionId;
            this.explanation = explanation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PremiumFeature extends Object {
    }

    public static class PremiumFeatureIncreasedLimits extends PremiumFeature {

        public static final int CONSTRUCTOR = 1785455031;

        public PremiumFeatureIncreasedLimits() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureIncreasedUploadFileSize extends PremiumFeature {

        public static final int CONSTRUCTOR = 1825367155;

        public PremiumFeatureIncreasedUploadFileSize() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureImprovedDownloadSpeed extends PremiumFeature {

        public static final int CONSTRUCTOR = -267695554;

        public PremiumFeatureImprovedDownloadSpeed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureVoiceRecognition extends PremiumFeature {

        public static final int CONSTRUCTOR = 1288216542;

        public PremiumFeatureVoiceRecognition() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureDisabledAds extends PremiumFeature {

        public static final int CONSTRUCTOR = -2008587702;

        public PremiumFeatureDisabledAds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureUniqueReactions extends PremiumFeature {

        public static final int CONSTRUCTOR = 766750743;

        public PremiumFeatureUniqueReactions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureUniqueStickers extends PremiumFeature {

        public static final int CONSTRUCTOR = -2101773312;

        public PremiumFeatureUniqueStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureAdvancedChatManagement extends PremiumFeature {

        public static final int CONSTRUCTOR = 796347674;

        public PremiumFeatureAdvancedChatManagement() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureProfileBadge extends PremiumFeature {

        public static final int CONSTRUCTOR = 233648322;

        public PremiumFeatureProfileBadge() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureAnimatedProfilePhoto extends PremiumFeature {

        public static final int CONSTRUCTOR = -100741914;

        public PremiumFeatureAnimatedProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatureAppIcons extends PremiumFeature {

        public static final int CONSTRUCTOR = 1585050761;

        public PremiumFeatureAppIcons() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeaturePromotionAnimation extends Object {
        public static final int CONSTRUCTOR = -1986155748;
        public PremiumFeature feature;
        public Animation animation;

        public PremiumFeaturePromotionAnimation() {
        }

        public PremiumFeaturePromotionAnimation(PremiumFeature feature, Animation animation) {
            this.feature = feature;
            this.animation = animation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumFeatures extends Object {
        public static final int CONSTRUCTOR = 1875162172;
        public PremiumFeature[] features;
        public PremiumLimit[] limits;
        public InternalLinkType paymentLink;

        public PremiumFeatures() {
        }

        public PremiumFeatures(PremiumFeature[] features, PremiumLimit[] limits, InternalLinkType paymentLink) {
            this.features = features;
            this.limits = limits;
            this.paymentLink = paymentLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimit extends Object {
        public static final int CONSTRUCTOR = 2127786726;
        public PremiumLimitType type;
        public int defaultValue;
        public int premiumValue;

        public PremiumLimit() {
        }

        public PremiumLimit(PremiumLimitType type, int defaultValue, int premiumValue) {
            this.type = type;
            this.defaultValue = defaultValue;
            this.premiumValue = premiumValue;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PremiumLimitType extends Object {
    }

    public static class PremiumLimitTypeSupergroupCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = -247467131;

        public PremiumLimitTypeSupergroupCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypePinnedChatCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = -998947871;

        public PremiumLimitTypePinnedChatCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeCreatedPublicChatCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = 446086841;

        public PremiumLimitTypeCreatedPublicChatCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeSavedAnimationCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = -19759735;

        public PremiumLimitTypeSavedAnimationCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeFavoriteStickerCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = 639754787;

        public PremiumLimitTypeFavoriteStickerCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeChatFilterCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = -644517214;

        public PremiumLimitTypeChatFilterCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeChatFilterChosenChatCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = 2057969759;

        public PremiumLimitTypeChatFilterChosenChatCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypePinnedArchivedChatCount extends PremiumLimitType {

        public static final int CONSTRUCTOR = 1485515276;

        public PremiumLimitTypePinnedArchivedChatCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeCaptionLength extends PremiumLimitType {

        public static final int CONSTRUCTOR = 293984314;

        public PremiumLimitTypeCaptionLength() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumLimitTypeBioLength extends PremiumLimitType {

        public static final int CONSTRUCTOR = -1146976765;

        public PremiumLimitTypeBioLength() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PremiumSource extends Object {
    }

    public static class PremiumSourceLimitExceeded extends PremiumSource {
        public static final int CONSTRUCTOR = -2052159742;
        public PremiumLimitType limitType;

        public PremiumSourceLimitExceeded() {
        }

        public PremiumSourceLimitExceeded(PremiumLimitType limitType) {
            this.limitType = limitType;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumSourceFeature extends PremiumSource {
        public static final int CONSTRUCTOR = 445813541;
        public PremiumFeature feature;

        public PremiumSourceFeature() {
        }

        public PremiumSourceFeature(PremiumFeature feature) {
            this.feature = feature;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumSourceLink extends PremiumSource {
        public static final int CONSTRUCTOR = 2135071132;
        public String referrer;

        public PremiumSourceLink() {
        }

        public PremiumSourceLink(String referrer) {
            this.referrer = referrer;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumSourceSettings extends PremiumSource {

        public static final int CONSTRUCTOR = -285702859;

        public PremiumSourceSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PremiumState extends Object {
        public static final int CONSTRUCTOR = 28460062;
        public FormattedText state;
        public String currency;
        public long monthlyAmount;
        public PremiumFeaturePromotionAnimation[] animations;

        public PremiumState() {
        }

        public PremiumState(FormattedText state, String currency, long monthlyAmount, PremiumFeaturePromotionAnimation[] animations) {
            this.state = state;
            this.currency = currency;
            this.monthlyAmount = monthlyAmount;
            this.animations = animations;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProfilePhoto extends Object {
        public static final int CONSTRUCTOR = -131097523;
        public long id;
        public File small;
        public File big;
        public Minithumbnail minithumbnail;
        public boolean hasAnimation;

        public ProfilePhoto() {
        }

        public ProfilePhoto(long id, File small, File big, Minithumbnail minithumbnail, boolean hasAnimation) {
            this.id = id;
            this.small = small;
            this.big = big;
            this.minithumbnail = minithumbnail;
            this.hasAnimation = hasAnimation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Proxies extends Object {
        public static final int CONSTRUCTOR = 1200447205;
        public Proxy[] proxies;

        public Proxies() {
        }

        public Proxies(Proxy[] proxies) {
            this.proxies = proxies;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Proxy extends Object {
        public static final int CONSTRUCTOR = 196049779;
        public int id;
        public String server;
        public int port;
        public int lastUsedDate;
        public boolean isEnabled;
        public ProxyType type;

        public Proxy() {
        }

        public Proxy(int id, String server, int port, int lastUsedDate, boolean isEnabled, ProxyType type) {
            this.id = id;
            this.server = server;
            this.port = port;
            this.lastUsedDate = lastUsedDate;
            this.isEnabled = isEnabled;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ProxyType extends Object {
    }

    public static class ProxyTypeSocks5 extends ProxyType {
        public static final int CONSTRUCTOR = -890027341;
        public String username;
        public String password;

        public ProxyTypeSocks5() {
        }

        public ProxyTypeSocks5(String username, String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProxyTypeHttp extends ProxyType {
        public static final int CONSTRUCTOR = -1547188361;
        public String username;
        public String password;
        public boolean httpOnly;

        public ProxyTypeHttp() {
        }

        public ProxyTypeHttp(String username, String password, boolean httpOnly) {
            this.username = username;
            this.password = password;
            this.httpOnly = httpOnly;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProxyTypeMtproto extends ProxyType {
        public static final int CONSTRUCTOR = -1964826627;
        public String secret;

        public ProxyTypeMtproto() {
        }

        public ProxyTypeMtproto(String secret) {
            this.secret = secret;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PublicChatType extends Object {
    }

    public static class PublicChatTypeHasUsername extends PublicChatType {

        public static final int CONSTRUCTOR = 350789758;

        public PublicChatTypeHasUsername() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PublicChatTypeIsLocationBased extends PublicChatType {

        public static final int CONSTRUCTOR = 1183735952;

        public PublicChatTypeIsLocationBased() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PushMessageContent extends Object {
    }

    public static class PushMessageContentHidden extends PushMessageContent {
        public static final int CONSTRUCTOR = -316950436;
        public boolean isPinned;

        public PushMessageContentHidden() {
        }

        public PushMessageContentHidden(boolean isPinned) {
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentAnimation extends PushMessageContent {
        public static final int CONSTRUCTOR = 1034215396;
        public Animation animation;
        public String caption;
        public boolean isPinned;

        public PushMessageContentAnimation() {
        }

        public PushMessageContentAnimation(Animation animation, String caption, boolean isPinned) {
            this.animation = animation;
            this.caption = caption;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentAudio extends PushMessageContent {
        public static final int CONSTRUCTOR = 381581426;
        public Audio audio;
        public boolean isPinned;

        public PushMessageContentAudio() {
        }

        public PushMessageContentAudio(Audio audio, boolean isPinned) {
            this.audio = audio;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentContact extends PushMessageContent {
        public static final int CONSTRUCTOR = -12219820;
        public String name;
        public boolean isPinned;

        public PushMessageContentContact() {
        }

        public PushMessageContentContact(String name, boolean isPinned) {
            this.name = name;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentContactRegistered extends PushMessageContent {

        public static final int CONSTRUCTOR = -303962720;

        public PushMessageContentContactRegistered() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentDocument extends PushMessageContent {
        public static final int CONSTRUCTOR = -458379775;
        public Document document;
        public boolean isPinned;

        public PushMessageContentDocument() {
        }

        public PushMessageContentDocument(Document document, boolean isPinned) {
            this.document = document;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentGame extends PushMessageContent {
        public static final int CONSTRUCTOR = -515131109;
        public String title;
        public boolean isPinned;

        public PushMessageContentGame() {
        }

        public PushMessageContentGame(String title, boolean isPinned) {
            this.title = title;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentGameScore extends PushMessageContent {
        public static final int CONSTRUCTOR = 901303688;
        public String title;
        public int score;
        public boolean isPinned;

        public PushMessageContentGameScore() {
        }

        public PushMessageContentGameScore(String title, int score, boolean isPinned) {
            this.title = title;
            this.score = score;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentInvoice extends PushMessageContent {
        public static final int CONSTRUCTOR = -1731687492;
        public String price;
        public boolean isPinned;

        public PushMessageContentInvoice() {
        }

        public PushMessageContentInvoice(String price, boolean isPinned) {
            this.price = price;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentLocation extends PushMessageContent {
        public static final int CONSTRUCTOR = -1288005709;
        public boolean isLive;
        public boolean isPinned;

        public PushMessageContentLocation() {
        }

        public PushMessageContentLocation(boolean isLive, boolean isPinned) {
            this.isLive = isLive;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentPhoto extends PushMessageContent {
        public static final int CONSTRUCTOR = 140631122;
        public Photo photo;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;

        public PushMessageContentPhoto() {
        }

        public PushMessageContentPhoto(Photo photo, String caption, boolean isSecret, boolean isPinned) {
            this.photo = photo;
            this.caption = caption;
            this.isSecret = isSecret;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentPoll extends PushMessageContent {
        public static final int CONSTRUCTOR = -44403654;
        public String question;
        public boolean isRegular;
        public boolean isPinned;

        public PushMessageContentPoll() {
        }

        public PushMessageContentPoll(String question, boolean isRegular, boolean isPinned) {
            this.question = question;
            this.isRegular = isRegular;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentScreenshotTaken extends PushMessageContent {

        public static final int CONSTRUCTOR = 214245369;

        public PushMessageContentScreenshotTaken() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentSticker extends PushMessageContent {
        public static final int CONSTRUCTOR = 1553513939;
        public Sticker sticker;
        public String emoji;
        public boolean isPinned;

        public PushMessageContentSticker() {
        }

        public PushMessageContentSticker(Sticker sticker, String emoji, boolean isPinned) {
            this.sticker = sticker;
            this.emoji = emoji;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentText extends PushMessageContent {
        public static final int CONSTRUCTOR = 274587305;
        public String text;
        public boolean isPinned;

        public PushMessageContentText() {
        }

        public PushMessageContentText(String text, boolean isPinned) {
            this.text = text;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentVideo extends PushMessageContent {
        public static final int CONSTRUCTOR = 310038831;
        public Video video;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;

        public PushMessageContentVideo() {
        }

        public PushMessageContentVideo(Video video, String caption, boolean isSecret, boolean isPinned) {
            this.video = video;
            this.caption = caption;
            this.isSecret = isSecret;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentVideoNote extends PushMessageContent {
        public static final int CONSTRUCTOR = -1122764417;
        public VideoNote videoNote;
        public boolean isPinned;

        public PushMessageContentVideoNote() {
        }

        public PushMessageContentVideoNote(VideoNote videoNote, boolean isPinned) {
            this.videoNote = videoNote;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentVoiceNote extends PushMessageContent {
        public static final int CONSTRUCTOR = 88910987;
        public VoiceNote voiceNote;
        public boolean isPinned;

        public PushMessageContentVoiceNote() {
        }

        public PushMessageContentVoiceNote(VoiceNote voiceNote, boolean isPinned) {
            this.voiceNote = voiceNote;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentBasicGroupChatCreate extends PushMessageContent {

        public static final int CONSTRUCTOR = -2114855172;

        public PushMessageContentBasicGroupChatCreate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatAddMembers extends PushMessageContent {
        public static final int CONSTRUCTOR = -1087145158;
        public String memberName;
        public boolean isCurrentUser;
        public boolean isReturned;

        public PushMessageContentChatAddMembers() {
        }

        public PushMessageContentChatAddMembers(String memberName, boolean isCurrentUser, boolean isReturned) {
            this.memberName = memberName;
            this.isCurrentUser = isCurrentUser;
            this.isReturned = isReturned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatChangePhoto extends PushMessageContent {

        public static final int CONSTRUCTOR = -1114222051;

        public PushMessageContentChatChangePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatChangeTitle extends PushMessageContent {
        public static final int CONSTRUCTOR = -1964902749;
        public String title;

        public PushMessageContentChatChangeTitle() {
        }

        public PushMessageContentChatChangeTitle(String title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatSetTheme extends PushMessageContent {
        public static final int CONSTRUCTOR = 173882216;
        public String themeName;

        public PushMessageContentChatSetTheme() {
        }

        public PushMessageContentChatSetTheme(String themeName) {
            this.themeName = themeName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatDeleteMember extends PushMessageContent {
        public static final int CONSTRUCTOR = 598714783;
        public String memberName;
        public boolean isCurrentUser;
        public boolean isLeft;

        public PushMessageContentChatDeleteMember() {
        }

        public PushMessageContentChatDeleteMember(String memberName, boolean isCurrentUser, boolean isLeft) {
            this.memberName = memberName;
            this.isCurrentUser = isCurrentUser;
            this.isLeft = isLeft;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatJoinByLink extends PushMessageContent {

        public static final int CONSTRUCTOR = 1553719113;

        public PushMessageContentChatJoinByLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentChatJoinByRequest extends PushMessageContent {

        public static final int CONSTRUCTOR = -205823627;

        public PushMessageContentChatJoinByRequest() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentRecurringPayment extends PushMessageContent {
        public static final int CONSTRUCTOR = 1619211802;
        public String amount;

        public PushMessageContentRecurringPayment() {
        }

        public PushMessageContentRecurringPayment(String amount) {
            this.amount = amount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentMessageForwards extends PushMessageContent {
        public static final int CONSTRUCTOR = -1913083876;
        public int totalCount;

        public PushMessageContentMessageForwards() {
        }

        public PushMessageContentMessageForwards(int totalCount) {
            this.totalCount = totalCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushMessageContentMediaAlbum extends PushMessageContent {
        public static final int CONSTRUCTOR = -748426897;
        public int totalCount;
        public boolean hasPhotos;
        public boolean hasVideos;
        public boolean hasAudios;
        public boolean hasDocuments;

        public PushMessageContentMediaAlbum() {
        }

        public PushMessageContentMediaAlbum(int totalCount, boolean hasPhotos, boolean hasVideos, boolean hasAudios, boolean hasDocuments) {
            this.totalCount = totalCount;
            this.hasPhotos = hasPhotos;
            this.hasVideos = hasVideos;
            this.hasAudios = hasAudios;
            this.hasDocuments = hasDocuments;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PushReceiverId extends Object {
        public static final int CONSTRUCTOR = 371056428;
        public long id;

        public PushReceiverId() {
        }

        public PushReceiverId(long id) {
            this.id = id;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Reaction extends Object {
        public static final int CONSTRUCTOR = -469169988;
        public String reaction;
        public String title;
        public boolean isActive;
        public boolean isPremium;
        public Sticker staticIcon;
        public Sticker appearAnimation;
        public Sticker selectAnimation;
        public Sticker activateAnimation;
        public Sticker effectAnimation;
        public Sticker aroundAnimation;
        public Sticker centerAnimation;

        public Reaction() {
        }

        public Reaction(String reaction, String title, boolean isActive, boolean isPremium, Sticker staticIcon, Sticker appearAnimation, Sticker selectAnimation, Sticker activateAnimation, Sticker effectAnimation, Sticker aroundAnimation, Sticker centerAnimation) {
            this.reaction = reaction;
            this.title = title;
            this.isActive = isActive;
            this.isPremium = isPremium;
            this.staticIcon = staticIcon;
            this.appearAnimation = appearAnimation;
            this.selectAnimation = selectAnimation;
            this.activateAnimation = activateAnimation;
            this.effectAnimation = effectAnimation;
            this.aroundAnimation = aroundAnimation;
            this.centerAnimation = centerAnimation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecommendedChatFilter extends Object {
        public static final int CONSTRUCTOR = 36048610;
        public ChatFilter filter;
        public String description;

        public RecommendedChatFilter() {
        }

        public RecommendedChatFilter(ChatFilter filter, String description) {
            this.filter = filter;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecommendedChatFilters extends Object {
        public static final int CONSTRUCTOR = -263416880;
        public RecommendedChatFilter[] chatFilters;

        public RecommendedChatFilters() {
        }

        public RecommendedChatFilters(RecommendedChatFilter[] chatFilters) {
            this.chatFilters = chatFilters;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecoveryEmailAddress extends Object {
        public static final int CONSTRUCTOR = 1290526187;
        public String recoveryEmailAddress;

        public RecoveryEmailAddress() {
        }

        public RecoveryEmailAddress(String recoveryEmailAddress) {
            this.recoveryEmailAddress = recoveryEmailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoteFile extends Object {
        public static final int CONSTRUCTOR = 747731030;
        public String id;
        public String uniqueId;
        public boolean isUploadingActive;
        public boolean isUploadingCompleted;
        public long uploadedSize;

        public RemoteFile() {
        }

        public RemoteFile(String id, String uniqueId, boolean isUploadingActive, boolean isUploadingCompleted, long uploadedSize) {
            this.id = id;
            this.uniqueId = uniqueId;
            this.isUploadingActive = isUploadingActive;
            this.isUploadingCompleted = isUploadingCompleted;
            this.uploadedSize = uploadedSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ReplyMarkup extends Object {
    }

    public static class ReplyMarkupRemoveKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -691252879;
        public boolean isPersonal;

        public ReplyMarkupRemoveKeyboard() {
        }

        public ReplyMarkupRemoveKeyboard(boolean isPersonal) {
            this.isPersonal = isPersonal;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReplyMarkupForceReply extends ReplyMarkup {
        public static final int CONSTRUCTOR = 1101461919;
        public boolean isPersonal;
        public String inputFieldPlaceholder;

        public ReplyMarkupForceReply() {
        }

        public ReplyMarkupForceReply(boolean isPersonal, String inputFieldPlaceholder) {
            this.isPersonal = isPersonal;
            this.inputFieldPlaceholder = inputFieldPlaceholder;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReplyMarkupShowKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -64985802;
        public KeyboardButton[][] rows;
        public boolean resizeKeyboard;
        public boolean oneTime;
        public boolean isPersonal;
        public String inputFieldPlaceholder;

        public ReplyMarkupShowKeyboard() {
        }

        public ReplyMarkupShowKeyboard(KeyboardButton[][] rows, boolean resizeKeyboard, boolean oneTime, boolean isPersonal, String inputFieldPlaceholder) {
            this.rows = rows;
            this.resizeKeyboard = resizeKeyboard;
            this.oneTime = oneTime;
            this.isPersonal = isPersonal;
            this.inputFieldPlaceholder = inputFieldPlaceholder;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReplyMarkupInlineKeyboard extends ReplyMarkup {
        public static final int CONSTRUCTOR = -619317658;
        public InlineKeyboardButton[][] rows;

        public ReplyMarkupInlineKeyboard() {
        }

        public ReplyMarkupInlineKeyboard(InlineKeyboardButton[][] rows) {
            this.rows = rows;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ResetPasswordResult extends Object {
    }

    public static class ResetPasswordResultOk extends ResetPasswordResult {

        public static final int CONSTRUCTOR = -1397267463;

        public ResetPasswordResultOk() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetPasswordResultPending extends ResetPasswordResult {
        public static final int CONSTRUCTOR = 1193925721;
        public int pendingResetDate;

        public ResetPasswordResultPending() {
        }

        public ResetPasswordResultPending(int pendingResetDate) {
            this.pendingResetDate = pendingResetDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetPasswordResultDeclined extends ResetPasswordResult {
        public static final int CONSTRUCTOR = -1202200373;
        public int retryDate;

        public ResetPasswordResultDeclined() {
        }

        public ResetPasswordResultDeclined(int retryDate) {
            this.retryDate = retryDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class RichText extends Object {
    }

    public static class RichTextPlain extends RichText {
        public static final int CONSTRUCTOR = 482617702;
        public String text;

        public RichTextPlain() {
        }

        public RichTextPlain(String text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextBold extends RichText {
        public static final int CONSTRUCTOR = 1670844268;
        public RichText text;

        public RichTextBold() {
        }

        public RichTextBold(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextItalic extends RichText {
        public static final int CONSTRUCTOR = 1853354047;
        public RichText text;

        public RichTextItalic() {
        }

        public RichTextItalic(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextUnderline extends RichText {
        public static final int CONSTRUCTOR = -536019572;
        public RichText text;

        public RichTextUnderline() {
        }

        public RichTextUnderline(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextStrikethrough extends RichText {
        public static final int CONSTRUCTOR = 723413585;
        public RichText text;

        public RichTextStrikethrough() {
        }

        public RichTextStrikethrough(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextFixed extends RichText {
        public static final int CONSTRUCTOR = -1271496249;
        public RichText text;

        public RichTextFixed() {
        }

        public RichTextFixed(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextUrl extends RichText {
        public static final int CONSTRUCTOR = 83939092;
        public RichText text;
        public String url;
        public boolean isCached;

        public RichTextUrl() {
        }

        public RichTextUrl(RichText text, String url, boolean isCached) {
            this.text = text;
            this.url = url;
            this.isCached = isCached;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextEmailAddress extends RichText {
        public static final int CONSTRUCTOR = 40018679;
        public RichText text;
        public String emailAddress;

        public RichTextEmailAddress() {
        }

        public RichTextEmailAddress(RichText text, String emailAddress) {
            this.text = text;
            this.emailAddress = emailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextSubscript extends RichText {
        public static final int CONSTRUCTOR = -868197812;
        public RichText text;

        public RichTextSubscript() {
        }

        public RichTextSubscript(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextSuperscript extends RichText {
        public static final int CONSTRUCTOR = -382241437;
        public RichText text;

        public RichTextSuperscript() {
        }

        public RichTextSuperscript(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextMarked extends RichText {
        public static final int CONSTRUCTOR = -1271999614;
        public RichText text;

        public RichTextMarked() {
        }

        public RichTextMarked(RichText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextPhoneNumber extends RichText {
        public static final int CONSTRUCTOR = 128521539;
        public RichText text;
        public String phoneNumber;

        public RichTextPhoneNumber() {
        }

        public RichTextPhoneNumber(RichText text, String phoneNumber) {
            this.text = text;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextIcon extends RichText {
        public static final int CONSTRUCTOR = -1480316158;
        public Document document;
        public int width;
        public int height;

        public RichTextIcon() {
        }

        public RichTextIcon(Document document, int width, int height) {
            this.document = document;
            this.width = width;
            this.height = height;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextReference extends RichText {
        public static final int CONSTRUCTOR = -1147530634;
        public RichText text;
        public String anchorName;
        public String url;

        public RichTextReference() {
        }

        public RichTextReference(RichText text, String anchorName, String url) {
            this.text = text;
            this.anchorName = anchorName;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextAnchor extends RichText {
        public static final int CONSTRUCTOR = 1316950068;
        public String name;

        public RichTextAnchor() {
        }

        public RichTextAnchor(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTextAnchorLink extends RichText {
        public static final int CONSTRUCTOR = -1541418282;
        public RichText text;
        public String anchorName;
        public String url;

        public RichTextAnchorLink() {
        }

        public RichTextAnchorLink(RichText text, String anchorName, String url) {
            this.text = text;
            this.anchorName = anchorName;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RichTexts extends RichText {
        public static final int CONSTRUCTOR = 1647457821;
        public RichText[] texts;

        public RichTexts() {
        }

        public RichTexts(RichText[] texts) {
            this.texts = texts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RtmpUrl extends Object {
        public static final int CONSTRUCTOR = 1009302613;
        public String url;
        public String streamKey;

        public RtmpUrl() {
        }

        public RtmpUrl(String url, String streamKey) {
            this.url = url;
            this.streamKey = streamKey;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SavedCredentials extends Object {
        public static final int CONSTRUCTOR = -370273060;
        public String id;
        public String title;

        public SavedCredentials() {
        }

        public SavedCredentials(String id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ScopeNotificationSettings extends Object {
        public static final int CONSTRUCTOR = -1383458661;
        public int muteFor;
        public long soundId;
        public boolean showPreview;
        public boolean disablePinnedMessageNotifications;
        public boolean disableMentionNotifications;

        public ScopeNotificationSettings() {
        }

        public ScopeNotificationSettings(int muteFor, long soundId, boolean showPreview, boolean disablePinnedMessageNotifications, boolean disableMentionNotifications) {
            this.muteFor = muteFor;
            this.soundId = soundId;
            this.showPreview = showPreview;
            this.disablePinnedMessageNotifications = disablePinnedMessageNotifications;
            this.disableMentionNotifications = disableMentionNotifications;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SearchMessagesFilter extends Object {
    }

    public static class SearchMessagesFilterEmpty extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -869395657;

        public SearchMessagesFilterEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterAnimation extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -155713339;

        public SearchMessagesFilterAnimation() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterAudio extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 867505275;

        public SearchMessagesFilterAudio() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterDocument extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 1526331215;

        public SearchMessagesFilterDocument() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPhoto extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 925932293;

        public SearchMessagesFilterPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVideo extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 115538222;

        public SearchMessagesFilterVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVoiceNote extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 1841439357;

        public SearchMessagesFilterVoiceNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPhotoAndVideo extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 1352130963;

        public SearchMessagesFilterPhotoAndVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUrl extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -1828724341;

        public SearchMessagesFilterUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterChatPhoto extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -1247751329;

        public SearchMessagesFilterChatPhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVideoNote extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 564323321;

        public SearchMessagesFilterVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterVoiceAndVideoNote extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 664174819;

        public SearchMessagesFilterVoiceAndVideoNote() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterMention extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 2001258652;

        public SearchMessagesFilterMention() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUnreadMention extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -95769149;

        public SearchMessagesFilterUnreadMention() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterUnreadReaction extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -1379651328;

        public SearchMessagesFilterUnreadReaction() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterFailedToSend extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = -596322564;

        public SearchMessagesFilterFailedToSend() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessagesFilterPinned extends SearchMessagesFilter {

        public static final int CONSTRUCTOR = 371805512;

        public SearchMessagesFilterPinned() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Seconds extends Object {
        public static final int CONSTRUCTOR = 959899022;
        public double seconds;

        public Seconds() {
        }

        public Seconds(double seconds) {
            this.seconds = seconds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SecretChat extends Object {
        public static final int CONSTRUCTOR = -676918325;
        public int id;
        public long userId;
        public SecretChatState state;
        public boolean isOutbound;
        public byte[] keyHash;
        public int layer;

        public SecretChat() {
        }

        public SecretChat(int id, long userId, SecretChatState state, boolean isOutbound, byte[] keyHash, int layer) {
            this.id = id;
            this.userId = userId;
            this.state = state;
            this.isOutbound = isOutbound;
            this.keyHash = keyHash;
            this.layer = layer;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SecretChatState extends Object {
    }

    public static class SecretChatStatePending extends SecretChatState {

        public static final int CONSTRUCTOR = -1637050756;

        public SecretChatStatePending() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SecretChatStateReady extends SecretChatState {

        public static final int CONSTRUCTOR = -1611352087;

        public SecretChatStateReady() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SecretChatStateClosed extends SecretChatState {

        public static final int CONSTRUCTOR = -1945106707;

        public SecretChatStateClosed() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SentWebAppMessage extends Object {
        public static final int CONSTRUCTOR = 1243934400;
        public String inlineMessageId;

        public SentWebAppMessage() {
        }

        public SentWebAppMessage(String inlineMessageId) {
            this.inlineMessageId = inlineMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Session extends Object {
        public static final int CONSTRUCTOR = -1961323642;
        public long id;
        public boolean isCurrent;
        public boolean isPasswordPending;
        public boolean canAcceptSecretChats;
        public boolean canAcceptCalls;
        public SessionType type;
        public int apiId;
        public String applicationName;
        public String applicationVersion;
        public boolean isOfficialApplication;
        public String deviceModel;
        public String platform;
        public String systemVersion;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String country;
        public String region;

        public Session() {
        }

        public Session(long id, boolean isCurrent, boolean isPasswordPending, boolean canAcceptSecretChats, boolean canAcceptCalls, SessionType type, int apiId, String applicationName, String applicationVersion, boolean isOfficialApplication, String deviceModel, String platform, String systemVersion, int logInDate, int lastActiveDate, String ip, String country, String region) {
            this.id = id;
            this.isCurrent = isCurrent;
            this.isPasswordPending = isPasswordPending;
            this.canAcceptSecretChats = canAcceptSecretChats;
            this.canAcceptCalls = canAcceptCalls;
            this.type = type;
            this.apiId = apiId;
            this.applicationName = applicationName;
            this.applicationVersion = applicationVersion;
            this.isOfficialApplication = isOfficialApplication;
            this.deviceModel = deviceModel;
            this.platform = platform;
            this.systemVersion = systemVersion;
            this.logInDate = logInDate;
            this.lastActiveDate = lastActiveDate;
            this.ip = ip;
            this.country = country;
            this.region = region;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SessionType extends Object {
    }

    public static class SessionTypeAndroid extends SessionType {

        public static final int CONSTRUCTOR = -2071764840;

        public SessionTypeAndroid() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeApple extends SessionType {

        public static final int CONSTRUCTOR = -1818635701;

        public SessionTypeApple() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeBrave extends SessionType {

        public static final int CONSTRUCTOR = -1216812563;

        public SessionTypeBrave() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeChrome extends SessionType {

        public static final int CONSTRUCTOR = 1573464425;

        public SessionTypeChrome() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeEdge extends SessionType {

        public static final int CONSTRUCTOR = -538916005;

        public SessionTypeEdge() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeFirefox extends SessionType {

        public static final int CONSTRUCTOR = 2122579364;

        public SessionTypeFirefox() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeIpad extends SessionType {

        public static final int CONSTRUCTOR = 1294647023;

        public SessionTypeIpad() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeIphone extends SessionType {

        public static final int CONSTRUCTOR = 97616573;

        public SessionTypeIphone() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeLinux extends SessionType {

        public static final int CONSTRUCTOR = -1487422871;

        public SessionTypeLinux() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeMac extends SessionType {

        public static final int CONSTRUCTOR = -612250975;

        public SessionTypeMac() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeOpera extends SessionType {

        public static final int CONSTRUCTOR = -1463673734;

        public SessionTypeOpera() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeSafari extends SessionType {

        public static final int CONSTRUCTOR = 710646873;

        public SessionTypeSafari() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeUbuntu extends SessionType {

        public static final int CONSTRUCTOR = 1569680069;

        public SessionTypeUbuntu() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeUnknown extends SessionType {

        public static final int CONSTRUCTOR = 233926704;

        public SessionTypeUnknown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeVivaldi extends SessionType {

        public static final int CONSTRUCTOR = 1120503279;

        public SessionTypeVivaldi() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeWindows extends SessionType {

        public static final int CONSTRUCTOR = -1676512600;

        public SessionTypeWindows() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SessionTypeXbox extends SessionType {

        public static final int CONSTRUCTOR = 1856216492;

        public SessionTypeXbox() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Sessions extends Object {
        public static final int CONSTRUCTOR = 842912274;
        public Session[] sessions;
        public int inactiveSessionTtlDays;

        public Sessions() {
        }

        public Sessions(Session[] sessions, int inactiveSessionTtlDays) {
            this.sessions = sessions;
            this.inactiveSessionTtlDays = inactiveSessionTtlDays;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ShippingOption extends Object {
        public static final int CONSTRUCTOR = 1425690001;
        public String id;
        public String title;
        public LabeledPricePart[] priceParts;

        public ShippingOption() {
        }

        public ShippingOption(String id, String title, LabeledPricePart[] priceParts) {
            this.id = id;
            this.title = title;
            this.priceParts = priceParts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SponsoredMessage extends Object {
        public static final int CONSTRUCTOR = 555261322;
        public long messageId;
        public boolean isRecommended;
        public long sponsorChatId;
        public ChatInviteLinkInfo sponsorChatInfo;
        public InternalLinkType link;
        public MessageContent content;

        public SponsoredMessage() {
        }

        public SponsoredMessage(long messageId, boolean isRecommended, long sponsorChatId, ChatInviteLinkInfo sponsorChatInfo, InternalLinkType link, MessageContent content) {
            this.messageId = messageId;
            this.isRecommended = isRecommended;
            this.sponsorChatId = sponsorChatId;
            this.sponsorChatInfo = sponsorChatInfo;
            this.link = link;
            this.content = content;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class StatisticalGraph extends Object {
    }

    public static class StatisticalGraphData extends StatisticalGraph {
        public static final int CONSTRUCTOR = -1988940244;
        public String jsonData;
        public String zoomToken;

        public StatisticalGraphData() {
        }

        public StatisticalGraphData(String jsonData, String zoomToken) {
            this.jsonData = jsonData;
            this.zoomToken = zoomToken;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StatisticalGraphAsync extends StatisticalGraph {
        public static final int CONSTRUCTOR = 435891103;
        public String token;

        public StatisticalGraphAsync() {
        }

        public StatisticalGraphAsync(String token) {
            this.token = token;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StatisticalGraphError extends StatisticalGraph {
        public static final int CONSTRUCTOR = -1006788526;
        public String errorMessage;

        public StatisticalGraphError() {
        }

        public StatisticalGraphError(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StatisticalValue extends Object {
        public static final int CONSTRUCTOR = 1651337846;
        public double value;
        public double previousValue;
        public double growthRatePercentage;

        public StatisticalValue() {
        }

        public StatisticalValue(double value, double previousValue, double growthRatePercentage) {
            this.value = value;
            this.previousValue = previousValue;
            this.growthRatePercentage = growthRatePercentage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Sticker extends Object {
        public static final int CONSTRUCTOR = -1889146496;
        public long setId;
        public int width;
        public int height;
        public String emoji;
        public StickerType type;
        public ClosedVectorPath[] outline;
        public Thumbnail thumbnail;
        public File premiumAnimation;
        public File sticker;

        public Sticker() {
        }

        public Sticker(long setId, int width, int height, String emoji, StickerType type, ClosedVectorPath[] outline, Thumbnail thumbnail, File premiumAnimation, File sticker) {
            this.setId = setId;
            this.width = width;
            this.height = height;
            this.emoji = emoji;
            this.type = type;
            this.outline = outline;
            this.thumbnail = thumbnail;
            this.premiumAnimation = premiumAnimation;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerSet extends Object {
        public static final int CONSTRUCTOR = -1816236758;
        public long id;
        public String title;
        public String name;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public StickerType stickerType;
        public boolean isViewed;
        public Sticker[] stickers;
        public Emojis[] emojis;

        public StickerSet() {
        }

        public StickerSet(long id, String title, String name, Thumbnail thumbnail, ClosedVectorPath[] thumbnailOutline, boolean isInstalled, boolean isArchived, boolean isOfficial, StickerType stickerType, boolean isViewed, Sticker[] stickers, Emojis[] emojis) {
            this.id = id;
            this.title = title;
            this.name = name;
            this.thumbnail = thumbnail;
            this.thumbnailOutline = thumbnailOutline;
            this.isInstalled = isInstalled;
            this.isArchived = isArchived;
            this.isOfficial = isOfficial;
            this.stickerType = stickerType;
            this.isViewed = isViewed;
            this.stickers = stickers;
            this.emojis = emojis;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerSetInfo extends Object {
        public static final int CONSTRUCTOR = 1207538697;
        public long id;
        public String title;
        public String name;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public StickerType stickerType;
        public boolean isViewed;
        public int size;
        public Sticker[] covers;

        public StickerSetInfo() {
        }

        public StickerSetInfo(long id, String title, String name, Thumbnail thumbnail, ClosedVectorPath[] thumbnailOutline, boolean isInstalled, boolean isArchived, boolean isOfficial, StickerType stickerType, boolean isViewed, int size, Sticker[] covers) {
            this.id = id;
            this.title = title;
            this.name = name;
            this.thumbnail = thumbnail;
            this.thumbnailOutline = thumbnailOutline;
            this.isInstalled = isInstalled;
            this.isArchived = isArchived;
            this.isOfficial = isOfficial;
            this.stickerType = stickerType;
            this.isViewed = isViewed;
            this.size = size;
            this.covers = covers;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerSets extends Object {
        public static final int CONSTRUCTOR = -1883828812;
        public int totalCount;
        public StickerSetInfo[] sets;

        public StickerSets() {
        }

        public StickerSets(int totalCount, StickerSetInfo[] sets) {
            this.totalCount = totalCount;
            this.sets = sets;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class StickerType extends Object {
    }

    public static class StickerTypeStatic extends StickerType {

        public static final int CONSTRUCTOR = 1804483793;

        public StickerTypeStatic() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerTypeAnimated extends StickerType {

        public static final int CONSTRUCTOR = 1763255981;

        public StickerTypeAnimated() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerTypeVideo extends StickerType {

        public static final int CONSTRUCTOR = 522366836;

        public StickerTypeVideo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StickerTypeMask extends StickerType {
        public static final int CONSTRUCTOR = -839756573;
        public MaskPosition maskPosition;

        public StickerTypeMask() {
        }

        public StickerTypeMask(MaskPosition maskPosition) {
            this.maskPosition = maskPosition;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Stickers extends Object {
        public static final int CONSTRUCTOR = 1974859260;
        public Sticker[] stickers;

        public Stickers() {
        }

        public Stickers(Sticker[] stickers) {
            this.stickers = stickers;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StorageStatistics extends Object {
        public static final int CONSTRUCTOR = 217237013;
        public long size;
        public int count;
        public StorageStatisticsByChat[] byChat;

        public StorageStatistics() {
        }

        public StorageStatistics(long size, int count, StorageStatisticsByChat[] byChat) {
            this.size = size;
            this.count = count;
            this.byChat = byChat;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StorageStatisticsByChat extends Object {
        public static final int CONSTRUCTOR = 635434531;
        public long chatId;
        public long size;
        public int count;
        public StorageStatisticsByFileType[] byFileType;

        public StorageStatisticsByChat() {
        }

        public StorageStatisticsByChat(long chatId, long size, int count, StorageStatisticsByFileType[] byFileType) {
            this.chatId = chatId;
            this.size = size;
            this.count = count;
            this.byFileType = byFileType;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StorageStatisticsByFileType extends Object {
        public static final int CONSTRUCTOR = 714012840;
        public FileType fileType;
        public long size;
        public int count;

        public StorageStatisticsByFileType() {
        }

        public StorageStatisticsByFileType(FileType fileType, long size, int count) {
            this.fileType = fileType;
            this.size = size;
            this.count = count;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StorageStatisticsFast extends Object {
        public static final int CONSTRUCTOR = -884922271;
        public long filesSize;
        public int fileCount;
        public long databaseSize;
        public long languagePackDatabaseSize;
        public long logSize;

        public StorageStatisticsFast() {
        }

        public StorageStatisticsFast(long filesSize, int fileCount, long databaseSize, long languagePackDatabaseSize, long logSize) {
            this.filesSize = filesSize;
            this.fileCount = fileCount;
            this.databaseSize = databaseSize;
            this.languagePackDatabaseSize = languagePackDatabaseSize;
            this.logSize = logSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SuggestedAction extends Object {
    }

    public static class SuggestedActionEnableArchiveAndMuteNewChats extends SuggestedAction {

        public static final int CONSTRUCTOR = 2017586255;

        public SuggestedActionEnableArchiveAndMuteNewChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionCheckPassword extends SuggestedAction {

        public static final int CONSTRUCTOR = 1910534839;

        public SuggestedActionCheckPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionCheckPhoneNumber extends SuggestedAction {

        public static final int CONSTRUCTOR = 648771563;

        public SuggestedActionCheckPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionViewChecksHint extends SuggestedAction {

        public static final int CONSTRUCTOR = 891303239;

        public SuggestedActionViewChecksHint() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionConvertToBroadcastGroup extends SuggestedAction {
        public static final int CONSTRUCTOR = -965071304;
        public long supergroupId;

        public SuggestedActionConvertToBroadcastGroup() {
        }

        public SuggestedActionConvertToBroadcastGroup(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SuggestedActionSetPassword extends SuggestedAction {
        public static final int CONSTRUCTOR = 1863613848;
        public int authorizationDelay;

        public SuggestedActionSetPassword() {
        }

        public SuggestedActionSetPassword(int authorizationDelay) {
            this.authorizationDelay = authorizationDelay;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Supergroup extends Object {
        public static final int CONSTRUCTOR = -868093427;
        public long id;
        public String username;
        public int date;
        public ChatMemberStatus status;
        public int memberCount;
        public boolean hasLinkedChat;
        public boolean hasLocation;
        public boolean signMessages;
        public boolean joinToSendMessages;
        public boolean joinByRequest;
        public boolean isSlowModeEnabled;
        public boolean isChannel;
        public boolean isBroadcastGroup;
        public boolean isVerified;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;

        public Supergroup() {
        }

        public Supergroup(long id, String username, int date, ChatMemberStatus status, int memberCount, boolean hasLinkedChat, boolean hasLocation, boolean signMessages, boolean joinToSendMessages, boolean joinByRequest, boolean isSlowModeEnabled, boolean isChannel, boolean isBroadcastGroup, boolean isVerified, String restrictionReason, boolean isScam, boolean isFake) {
            this.id = id;
            this.username = username;
            this.date = date;
            this.status = status;
            this.memberCount = memberCount;
            this.hasLinkedChat = hasLinkedChat;
            this.hasLocation = hasLocation;
            this.signMessages = signMessages;
            this.joinToSendMessages = joinToSendMessages;
            this.joinByRequest = joinByRequest;
            this.isSlowModeEnabled = isSlowModeEnabled;
            this.isChannel = isChannel;
            this.isBroadcastGroup = isBroadcastGroup;
            this.isVerified = isVerified;
            this.restrictionReason = restrictionReason;
            this.isScam = isScam;
            this.isFake = isFake;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupFullInfo extends Object {
        public static final int CONSTRUCTOR = -1035719349;
        public ChatPhoto photo;
        public String description;
        public int memberCount;
        public int administratorCount;
        public int restrictedCount;
        public int bannedCount;
        public long linkedChatId;
        public int slowModeDelay;
        public double slowModeDelayExpiresIn;
        public boolean canGetMembers;
        public boolean canSetUsername;
        public boolean canSetStickerSet;
        public boolean canSetLocation;
        public boolean canGetStatistics;
        public boolean isAllHistoryAvailable;
        public long stickerSetId;
        public ChatLocation location;
        public ChatInviteLink inviteLink;
        public BotCommands[] botCommands;
        public long upgradedFromBasicGroupId;
        public long upgradedFromMaxMessageId;

        public SupergroupFullInfo() {
        }

        public SupergroupFullInfo(ChatPhoto photo, String description, int memberCount, int administratorCount, int restrictedCount, int bannedCount, long linkedChatId, int slowModeDelay, double slowModeDelayExpiresIn, boolean canGetMembers, boolean canSetUsername, boolean canSetStickerSet, boolean canSetLocation, boolean canGetStatistics, boolean isAllHistoryAvailable, long stickerSetId, ChatLocation location, ChatInviteLink inviteLink, BotCommands[] botCommands, long upgradedFromBasicGroupId, long upgradedFromMaxMessageId) {
            this.photo = photo;
            this.description = description;
            this.memberCount = memberCount;
            this.administratorCount = administratorCount;
            this.restrictedCount = restrictedCount;
            this.bannedCount = bannedCount;
            this.linkedChatId = linkedChatId;
            this.slowModeDelay = slowModeDelay;
            this.slowModeDelayExpiresIn = slowModeDelayExpiresIn;
            this.canGetMembers = canGetMembers;
            this.canSetUsername = canSetUsername;
            this.canSetStickerSet = canSetStickerSet;
            this.canSetLocation = canSetLocation;
            this.canGetStatistics = canGetStatistics;
            this.isAllHistoryAvailable = isAllHistoryAvailable;
            this.stickerSetId = stickerSetId;
            this.location = location;
            this.inviteLink = inviteLink;
            this.botCommands = botCommands;
            this.upgradedFromBasicGroupId = upgradedFromBasicGroupId;
            this.upgradedFromMaxMessageId = upgradedFromMaxMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SupergroupMembersFilter extends Object {
    }

    public static class SupergroupMembersFilterRecent extends SupergroupMembersFilter {

        public static final int CONSTRUCTOR = 1178199509;

        public SupergroupMembersFilterRecent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterContacts extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1282910856;
        public String query;

        public SupergroupMembersFilterContacts() {
        }

        public SupergroupMembersFilterContacts(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterAdministrators extends SupergroupMembersFilter {

        public static final int CONSTRUCTOR = -2097380265;

        public SupergroupMembersFilterAdministrators() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterSearch extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1696358469;
        public String query;

        public SupergroupMembersFilterSearch() {
        }

        public SupergroupMembersFilterSearch(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterRestricted extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1107800034;
        public String query;

        public SupergroupMembersFilterRestricted() {
        }

        public SupergroupMembersFilterRestricted(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterBanned extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -1210621683;
        public String query;

        public SupergroupMembersFilterBanned() {
        }

        public SupergroupMembersFilterBanned(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterMention extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 947915036;
        public String query;
        public long messageThreadId;

        public SupergroupMembersFilterMention() {
        }

        public SupergroupMembersFilterMention(String query, long messageThreadId) {
            this.query = query;
            this.messageThreadId = messageThreadId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SupergroupMembersFilterBots extends SupergroupMembersFilter {

        public static final int CONSTRUCTOR = 492138918;

        public SupergroupMembersFilterBots() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrl extends Object {
        public static final int CONSTRUCTOR = -1140786622;
        public String url;
        public TMeUrlType type;

        public TMeUrl() {
        }

        public TMeUrl(String url, TMeUrlType type) {
            this.url = url;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TMeUrlType extends Object {
    }

    public static class TMeUrlTypeUser extends TMeUrlType {
        public static final int CONSTRUCTOR = 125336602;
        public long userId;

        public TMeUrlTypeUser() {
        }

        public TMeUrlTypeUser(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrlTypeSupergroup extends TMeUrlType {
        public static final int CONSTRUCTOR = -1353369944;
        public long supergroupId;

        public TMeUrlTypeSupergroup() {
        }

        public TMeUrlTypeSupergroup(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrlTypeChatInvite extends TMeUrlType {
        public static final int CONSTRUCTOR = 313907785;
        public ChatInviteLinkInfo info;

        public TMeUrlTypeChatInvite() {
        }

        public TMeUrlTypeChatInvite(ChatInviteLinkInfo info) {
            this.info = info;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrlTypeStickerSet extends TMeUrlType {
        public static final int CONSTRUCTOR = 1602473196;
        public long stickerSetId;

        public TMeUrlTypeStickerSet() {
        }

        public TMeUrlTypeStickerSet(long stickerSetId) {
            this.stickerSetId = stickerSetId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TMeUrls extends Object {
        public static final int CONSTRUCTOR = -1130595098;
        public TMeUrl[] urls;

        public TMeUrls() {
        }

        public TMeUrls(TMeUrl[] urls) {
            this.urls = urls;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TargetChat extends Object {
    }

    public static class TargetChatCurrent extends TargetChat {

        public static final int CONSTRUCTOR = -416689904;

        public TargetChatCurrent() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TargetChatChosen extends TargetChat {
        public static final int CONSTRUCTOR = -307442990;
        public boolean allowUserChats;
        public boolean allowBotChats;
        public boolean allowGroupChats;
        public boolean allowChannelChats;

        public TargetChatChosen() {
        }

        public TargetChatChosen(boolean allowUserChats, boolean allowBotChats, boolean allowGroupChats, boolean allowChannelChats) {
            this.allowUserChats = allowUserChats;
            this.allowBotChats = allowBotChats;
            this.allowGroupChats = allowGroupChats;
            this.allowChannelChats = allowChannelChats;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TargetChatInternalLink extends TargetChat {
        public static final int CONSTRUCTOR = -579301408;
        public InternalLinkType link;

        public TargetChatInternalLink() {
        }

        public TargetChatInternalLink(InternalLinkType link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TdlibParameters extends Object {
        public static final int CONSTRUCTOR = -761520773;
        public boolean useTestDc;
        public String databaseDirectory;
        public String filesDirectory;
        public boolean useFileDatabase;
        public boolean useChatInfoDatabase;
        public boolean useMessageDatabase;
        public boolean useSecretChats;
        public int apiId;
        public String apiHash;
        public String systemLanguageCode;
        public String deviceModel;
        public String systemVersion;
        public String applicationVersion;
        public boolean enableStorageOptimizer;
        public boolean ignoreFileNames;

        public TdlibParameters() {
        }

        public TdlibParameters(boolean useTestDc, String databaseDirectory, String filesDirectory, boolean useFileDatabase, boolean useChatInfoDatabase, boolean useMessageDatabase, boolean useSecretChats, int apiId, String apiHash, String systemLanguageCode, String deviceModel, String systemVersion, String applicationVersion, boolean enableStorageOptimizer, boolean ignoreFileNames) {
            this.useTestDc = useTestDc;
            this.databaseDirectory = databaseDirectory;
            this.filesDirectory = filesDirectory;
            this.useFileDatabase = useFileDatabase;
            this.useChatInfoDatabase = useChatInfoDatabase;
            this.useMessageDatabase = useMessageDatabase;
            this.useSecretChats = useSecretChats;
            this.apiId = apiId;
            this.apiHash = apiHash;
            this.systemLanguageCode = systemLanguageCode;
            this.deviceModel = deviceModel;
            this.systemVersion = systemVersion;
            this.applicationVersion = applicationVersion;
            this.enableStorageOptimizer = enableStorageOptimizer;
            this.ignoreFileNames = ignoreFileNames;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TemporaryPasswordState extends Object {
        public static final int CONSTRUCTOR = 939837410;
        public boolean hasPassword;
        public int validFor;

        public TemporaryPasswordState() {
        }

        public TemporaryPasswordState(boolean hasPassword, int validFor) {
            this.hasPassword = hasPassword;
            this.validFor = validFor;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TermsOfService extends Object {
        public static final int CONSTRUCTOR = 739422597;
        public FormattedText text;
        public int minUserAge;
        public boolean showPopup;

        public TermsOfService() {
        }

        public TermsOfService(FormattedText text, int minUserAge, boolean showPopup) {
            this.text = text;
            this.minUserAge = minUserAge;
            this.showPopup = showPopup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestBytes extends Object {
        public static final int CONSTRUCTOR = -1541225250;
        public byte[] value;

        public TestBytes() {
        }

        public TestBytes(byte[] value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestInt extends Object {
        public static final int CONSTRUCTOR = -574804983;
        public int value;

        public TestInt() {
        }

        public TestInt(int value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestString extends Object {
        public static final int CONSTRUCTOR = -27891572;
        public String value;

        public TestString() {
        }

        public TestString(String value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestVectorInt extends Object {
        public static final int CONSTRUCTOR = 593682027;
        public int[] value;

        public TestVectorInt() {
        }

        public TestVectorInt(int[] value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestVectorIntObject extends Object {
        public static final int CONSTRUCTOR = 125891546;
        public TestInt[] value;

        public TestVectorIntObject() {
        }

        public TestVectorIntObject(TestInt[] value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestVectorString extends Object {
        public static final int CONSTRUCTOR = 79339995;
        public String[] value;

        public TestVectorString() {
        }

        public TestVectorString(String[] value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestVectorStringObject extends Object {
        public static final int CONSTRUCTOR = 80780537;
        public TestString[] value;

        public TestVectorStringObject() {
        }

        public TestVectorStringObject(TestString[] value) {
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Text extends Object {
        public static final int CONSTRUCTOR = 578181272;
        public String text;

        public Text() {
        }

        public Text(String text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntities extends Object {
        public static final int CONSTRUCTOR = -933199172;
        public TextEntity[] entities;

        public TextEntities() {
        }

        public TextEntities(TextEntity[] entities) {
            this.entities = entities;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntity extends Object {
        public static final int CONSTRUCTOR = -1951688280;
        public int offset;
        public int length;
        public TextEntityType type;

        public TextEntity() {
        }

        public TextEntity(int offset, int length, TextEntityType type) {
            this.offset = offset;
            this.length = length;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TextEntityType extends Object {
    }

    public static class TextEntityTypeMention extends TextEntityType {

        public static final int CONSTRUCTOR = 934535013;

        public TextEntityTypeMention() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeHashtag extends TextEntityType {

        public static final int CONSTRUCTOR = -1023958307;

        public TextEntityTypeHashtag() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeCashtag extends TextEntityType {

        public static final int CONSTRUCTOR = 1222915915;

        public TextEntityTypeCashtag() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeBotCommand extends TextEntityType {

        public static final int CONSTRUCTOR = -1150997581;

        public TextEntityTypeBotCommand() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeUrl extends TextEntityType {

        public static final int CONSTRUCTOR = -1312762756;

        public TextEntityTypeUrl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeEmailAddress extends TextEntityType {

        public static final int CONSTRUCTOR = 1425545249;

        public TextEntityTypeEmailAddress() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypePhoneNumber extends TextEntityType {

        public static final int CONSTRUCTOR = -1160140246;

        public TextEntityTypePhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeBankCardNumber extends TextEntityType {

        public static final int CONSTRUCTOR = 105986320;

        public TextEntityTypeBankCardNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeBold extends TextEntityType {

        public static final int CONSTRUCTOR = -1128210000;

        public TextEntityTypeBold() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeItalic extends TextEntityType {

        public static final int CONSTRUCTOR = -118253987;

        public TextEntityTypeItalic() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeUnderline extends TextEntityType {

        public static final int CONSTRUCTOR = 792317842;

        public TextEntityTypeUnderline() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeStrikethrough extends TextEntityType {

        public static final int CONSTRUCTOR = 961529082;

        public TextEntityTypeStrikethrough() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeSpoiler extends TextEntityType {

        public static final int CONSTRUCTOR = 544019899;

        public TextEntityTypeSpoiler() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeCode extends TextEntityType {

        public static final int CONSTRUCTOR = -974534326;

        public TextEntityTypeCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypePre extends TextEntityType {

        public static final int CONSTRUCTOR = 1648958606;

        public TextEntityTypePre() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypePreCode extends TextEntityType {
        public static final int CONSTRUCTOR = -945325397;
        public String language;

        public TextEntityTypePreCode() {
        }

        public TextEntityTypePreCode(String language) {
            this.language = language;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeTextUrl extends TextEntityType {
        public static final int CONSTRUCTOR = 445719651;
        public String url;

        public TextEntityTypeTextUrl() {
        }

        public TextEntityTypeTextUrl(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeMentionName extends TextEntityType {
        public static final int CONSTRUCTOR = -1570974289;
        public long userId;

        public TextEntityTypeMentionName() {
        }

        public TextEntityTypeMentionName(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextEntityTypeMediaTimestamp extends TextEntityType {
        public static final int CONSTRUCTOR = -1841898992;
        public int mediaTimestamp;

        public TextEntityTypeMediaTimestamp() {
        }

        public TextEntityTypeMediaTimestamp(int mediaTimestamp) {
            this.mediaTimestamp = mediaTimestamp;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TextParseMode extends Object {
    }

    public static class TextParseModeMarkdown extends TextParseMode {
        public static final int CONSTRUCTOR = 360073407;
        public int version;

        public TextParseModeMarkdown() {
        }

        public TextParseModeMarkdown(int version) {
            this.version = version;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TextParseModeHTML extends TextParseMode {

        public static final int CONSTRUCTOR = 1660208627;

        public TextParseModeHTML() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThemeParameters extends Object {
        public static final int CONSTRUCTOR = -644809106;
        public int backgroundColor;
        public int secondaryBackgroundColor;
        public int textColor;
        public int hintColor;
        public int linkColor;
        public int buttonColor;
        public int buttonTextColor;

        public ThemeParameters() {
        }

        public ThemeParameters(int backgroundColor, int secondaryBackgroundColor, int textColor, int hintColor, int linkColor, int buttonColor, int buttonTextColor) {
            this.backgroundColor = backgroundColor;
            this.secondaryBackgroundColor = secondaryBackgroundColor;
            this.textColor = textColor;
            this.hintColor = hintColor;
            this.linkColor = linkColor;
            this.buttonColor = buttonColor;
            this.buttonTextColor = buttonTextColor;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThemeSettings extends Object {
        public static final int CONSTRUCTOR = -62120942;
        public int accentColor;
        public Background background;
        public BackgroundFill outgoingMessageFill;
        public boolean animateOutgoingMessageFill;
        public int outgoingMessageAccentColor;

        public ThemeSettings() {
        }

        public ThemeSettings(int accentColor, Background background, BackgroundFill outgoingMessageFill, boolean animateOutgoingMessageFill, int outgoingMessageAccentColor) {
            this.accentColor = accentColor;
            this.background = background;
            this.outgoingMessageFill = outgoingMessageFill;
            this.animateOutgoingMessageFill = animateOutgoingMessageFill;
            this.outgoingMessageAccentColor = outgoingMessageAccentColor;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Thumbnail extends Object {
        public static final int CONSTRUCTOR = 1243275371;
        public ThumbnailFormat format;
        public int width;
        public int height;
        public File file;

        public Thumbnail() {
        }

        public Thumbnail(ThumbnailFormat format, int width, int height, File file) {
            this.format = format;
            this.width = width;
            this.height = height;
            this.file = file;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class ThumbnailFormat extends Object {
    }

    public static class ThumbnailFormatJpeg extends ThumbnailFormat {

        public static final int CONSTRUCTOR = -653503352;

        public ThumbnailFormatJpeg() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatGif extends ThumbnailFormat {

        public static final int CONSTRUCTOR = 1252205962;

        public ThumbnailFormatGif() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatMpeg4 extends ThumbnailFormat {

        public static final int CONSTRUCTOR = 278616062;

        public ThumbnailFormatMpeg4() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatPng extends ThumbnailFormat {

        public static final int CONSTRUCTOR = 1577490421;

        public ThumbnailFormatPng() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatTgs extends ThumbnailFormat {

        public static final int CONSTRUCTOR = 1315522642;

        public ThumbnailFormatTgs() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatWebm extends ThumbnailFormat {

        public static final int CONSTRUCTOR = -660084953;

        public ThumbnailFormatWebm() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ThumbnailFormatWebp extends ThumbnailFormat {

        public static final int CONSTRUCTOR = -53588974;

        public ThumbnailFormatWebp() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TopChatCategory extends Object {
    }

    public static class TopChatCategoryUsers extends TopChatCategory {

        public static final int CONSTRUCTOR = 1026706816;

        public TopChatCategoryUsers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryBots extends TopChatCategory {

        public static final int CONSTRUCTOR = -1577129195;

        public TopChatCategoryBots() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryGroups extends TopChatCategory {

        public static final int CONSTRUCTOR = 1530056846;

        public TopChatCategoryGroups() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryChannels extends TopChatCategory {

        public static final int CONSTRUCTOR = -500825885;

        public TopChatCategoryChannels() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryInlineBots extends TopChatCategory {

        public static final int CONSTRUCTOR = 377023356;

        public TopChatCategoryInlineBots() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryCalls extends TopChatCategory {

        public static final int CONSTRUCTOR = 356208861;

        public TopChatCategoryCalls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TopChatCategoryForwardChats extends TopChatCategory {

        public static final int CONSTRUCTOR = 1695922133;

        public TopChatCategoryForwardChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TrendingStickerSets extends Object {
        public static final int CONSTRUCTOR = 41028940;
        public int totalCount;
        public StickerSetInfo[] sets;
        public boolean isPremium;

        public TrendingStickerSets() {
        }

        public TrendingStickerSets(int totalCount, StickerSetInfo[] sets, boolean isPremium) {
            this.totalCount = totalCount;
            this.sets = sets;
            this.isPremium = isPremium;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnreadReaction extends Object {
        public static final int CONSTRUCTOR = 88800067;
        public String reaction;
        public MessageSender senderId;
        public boolean isBig;

        public UnreadReaction() {
        }

        public UnreadReaction(String reaction, MessageSender senderId, boolean isBig) {
            this.reaction = reaction;
            this.senderId = senderId;
            this.isBig = isBig;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class Update extends Object {
    }

    public static class UpdateAuthorizationState extends Update {
        public static final int CONSTRUCTOR = 1622347490;
        public AuthorizationState authorizationState;

        public UpdateAuthorizationState() {
        }

        public UpdateAuthorizationState(AuthorizationState authorizationState) {
            this.authorizationState = authorizationState;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewMessage extends Update {
        public static final int CONSTRUCTOR = -563105266;
        public Message message;

        public UpdateNewMessage() {
        }

        public UpdateNewMessage(Message message) {
            this.message = message;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageSendAcknowledged extends Update {
        public static final int CONSTRUCTOR = 1302843961;
        public long chatId;
        public long messageId;

        public UpdateMessageSendAcknowledged() {
        }

        public UpdateMessageSendAcknowledged(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageSendSucceeded extends Update {
        public static final int CONSTRUCTOR = 1815715197;
        public Message message;
        public long oldMessageId;

        public UpdateMessageSendSucceeded() {
        }

        public UpdateMessageSendSucceeded(Message message, long oldMessageId) {
            this.message = message;
            this.oldMessageId = oldMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageSendFailed extends Update {
        public static final int CONSTRUCTOR = -1032335779;
        public Message message;
        public long oldMessageId;
        public int errorCode;
        public String errorMessage;

        public UpdateMessageSendFailed() {
        }

        public UpdateMessageSendFailed(Message message, long oldMessageId, int errorCode, String errorMessage) {
            this.message = message;
            this.oldMessageId = oldMessageId;
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageContent extends Update {
        public static final int CONSTRUCTOR = 506903332;
        public long chatId;
        public long messageId;
        public MessageContent newContent;

        public UpdateMessageContent() {
        }

        public UpdateMessageContent(long chatId, long messageId, MessageContent newContent) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.newContent = newContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageEdited extends Update {
        public static final int CONSTRUCTOR = -559545626;
        public long chatId;
        public long messageId;
        public int editDate;
        public ReplyMarkup replyMarkup;

        public UpdateMessageEdited() {
        }

        public UpdateMessageEdited(long chatId, long messageId, int editDate, ReplyMarkup replyMarkup) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.editDate = editDate;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageIsPinned extends Update {
        public static final int CONSTRUCTOR = 1102848829;
        public long chatId;
        public long messageId;
        public boolean isPinned;

        public UpdateMessageIsPinned() {
        }

        public UpdateMessageIsPinned(long chatId, long messageId, boolean isPinned) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageInteractionInfo extends Update {
        public static final int CONSTRUCTOR = -1417659394;
        public long chatId;
        public long messageId;
        public MessageInteractionInfo interactionInfo;

        public UpdateMessageInteractionInfo() {
        }

        public UpdateMessageInteractionInfo(long chatId, long messageId, MessageInteractionInfo interactionInfo) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.interactionInfo = interactionInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageContentOpened extends Update {
        public static final int CONSTRUCTOR = -1520523131;
        public long chatId;
        public long messageId;

        public UpdateMessageContentOpened() {
        }

        public UpdateMessageContentOpened(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageMentionRead extends Update {
        public static final int CONSTRUCTOR = -252228282;
        public long chatId;
        public long messageId;
        public int unreadMentionCount;

        public UpdateMessageMentionRead() {
        }

        public UpdateMessageMentionRead(long chatId, long messageId, int unreadMentionCount) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.unreadMentionCount = unreadMentionCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageUnreadReactions extends Update {
        public static final int CONSTRUCTOR = 942840008;
        public long chatId;
        public long messageId;
        public UnreadReaction[] unreadReactions;
        public int unreadReactionCount;

        public UpdateMessageUnreadReactions() {
        }

        public UpdateMessageUnreadReactions(long chatId, long messageId, UnreadReaction[] unreadReactions, int unreadReactionCount) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.unreadReactions = unreadReactions;
            this.unreadReactionCount = unreadReactionCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateMessageLiveLocationViewed extends Update {
        public static final int CONSTRUCTOR = -1308260971;
        public long chatId;
        public long messageId;

        public UpdateMessageLiveLocationViewed() {
        }

        public UpdateMessageLiveLocationViewed(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewChat extends Update {
        public static final int CONSTRUCTOR = 2075757773;
        public Chat chat;

        public UpdateNewChat() {
        }

        public UpdateNewChat(Chat chat) {
            this.chat = chat;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatTitle extends Update {
        public static final int CONSTRUCTOR = -175405660;
        public long chatId;
        public String title;

        public UpdateChatTitle() {
        }

        public UpdateChatTitle(long chatId, String title) {
            this.chatId = chatId;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatPhoto extends Update {
        public static final int CONSTRUCTOR = -324713921;
        public long chatId;
        public ChatPhotoInfo photo;

        public UpdateChatPhoto() {
        }

        public UpdateChatPhoto(long chatId, ChatPhotoInfo photo) {
            this.chatId = chatId;
            this.photo = photo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatPermissions extends Update {
        public static final int CONSTRUCTOR = -1622010003;
        public long chatId;
        public ChatPermissions permissions;

        public UpdateChatPermissions() {
        }

        public UpdateChatPermissions(long chatId, ChatPermissions permissions) {
            this.chatId = chatId;
            this.permissions = permissions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatLastMessage extends Update {
        public static final int CONSTRUCTOR = -923244537;
        public long chatId;
        public Message lastMessage;
        public ChatPosition[] positions;

        public UpdateChatLastMessage() {
        }

        public UpdateChatLastMessage(long chatId, Message lastMessage, ChatPosition[] positions) {
            this.chatId = chatId;
            this.lastMessage = lastMessage;
            this.positions = positions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatPosition extends Update {
        public static final int CONSTRUCTOR = -8979849;
        public long chatId;
        public ChatPosition position;

        public UpdateChatPosition() {
        }

        public UpdateChatPosition(long chatId, ChatPosition position) {
            this.chatId = chatId;
            this.position = position;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatReadInbox extends Update {
        public static final int CONSTRUCTOR = -797952281;
        public long chatId;
        public long lastReadInboxMessageId;
        public int unreadCount;

        public UpdateChatReadInbox() {
        }

        public UpdateChatReadInbox(long chatId, long lastReadInboxMessageId, int unreadCount) {
            this.chatId = chatId;
            this.lastReadInboxMessageId = lastReadInboxMessageId;
            this.unreadCount = unreadCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatReadOutbox extends Update {
        public static final int CONSTRUCTOR = 708334213;
        public long chatId;
        public long lastReadOutboxMessageId;

        public UpdateChatReadOutbox() {
        }

        public UpdateChatReadOutbox(long chatId, long lastReadOutboxMessageId) {
            this.chatId = chatId;
            this.lastReadOutboxMessageId = lastReadOutboxMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatActionBar extends Update {
        public static final int CONSTRUCTOR = -643671870;
        public long chatId;
        public ChatActionBar actionBar;

        public UpdateChatActionBar() {
        }

        public UpdateChatActionBar(long chatId, ChatActionBar actionBar) {
            this.chatId = chatId;
            this.actionBar = actionBar;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatAvailableReactions extends Update {
        public static final int CONSTRUCTOR = 1461776531;
        public long chatId;
        public String[] availableReactions;

        public UpdateChatAvailableReactions() {
        }

        public UpdateChatAvailableReactions(long chatId, String[] availableReactions) {
            this.chatId = chatId;
            this.availableReactions = availableReactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatDraftMessage extends Update {
        public static final int CONSTRUCTOR = 1455190380;
        public long chatId;
        public DraftMessage draftMessage;
        public ChatPosition[] positions;

        public UpdateChatDraftMessage() {
        }

        public UpdateChatDraftMessage(long chatId, DraftMessage draftMessage, ChatPosition[] positions) {
            this.chatId = chatId;
            this.draftMessage = draftMessage;
            this.positions = positions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatMessageSender extends Update {
        public static final int CONSTRUCTOR = 2003849793;
        public long chatId;
        public MessageSender messageSenderId;

        public UpdateChatMessageSender() {
        }

        public UpdateChatMessageSender(long chatId, MessageSender messageSenderId) {
            this.chatId = chatId;
            this.messageSenderId = messageSenderId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatMessageTtl extends Update {
        public static final int CONSTRUCTOR = -572479112;
        public long chatId;
        public int messageTtl;

        public UpdateChatMessageTtl() {
        }

        public UpdateChatMessageTtl(long chatId, int messageTtl) {
            this.chatId = chatId;
            this.messageTtl = messageTtl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatNotificationSettings extends Update {
        public static final int CONSTRUCTOR = -803163050;
        public long chatId;
        public ChatNotificationSettings notificationSettings;

        public UpdateChatNotificationSettings() {
        }

        public UpdateChatNotificationSettings(long chatId, ChatNotificationSettings notificationSettings) {
            this.chatId = chatId;
            this.notificationSettings = notificationSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatPendingJoinRequests extends Update {
        public static final int CONSTRUCTOR = 348578785;
        public long chatId;
        public ChatJoinRequestsInfo pendingJoinRequests;

        public UpdateChatPendingJoinRequests() {
        }

        public UpdateChatPendingJoinRequests(long chatId, ChatJoinRequestsInfo pendingJoinRequests) {
            this.chatId = chatId;
            this.pendingJoinRequests = pendingJoinRequests;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatReplyMarkup extends Update {
        public static final int CONSTRUCTOR = 1309386144;
        public long chatId;
        public long replyMarkupMessageId;

        public UpdateChatReplyMarkup() {
        }

        public UpdateChatReplyMarkup(long chatId, long replyMarkupMessageId) {
            this.chatId = chatId;
            this.replyMarkupMessageId = replyMarkupMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatTheme extends Update {
        public static final int CONSTRUCTOR = 838063205;
        public long chatId;
        public String themeName;

        public UpdateChatTheme() {
        }

        public UpdateChatTheme(long chatId, String themeName) {
            this.chatId = chatId;
            this.themeName = themeName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatUnreadMentionCount extends Update {
        public static final int CONSTRUCTOR = -2131461348;
        public long chatId;
        public int unreadMentionCount;

        public UpdateChatUnreadMentionCount() {
        }

        public UpdateChatUnreadMentionCount(long chatId, int unreadMentionCount) {
            this.chatId = chatId;
            this.unreadMentionCount = unreadMentionCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatUnreadReactionCount extends Update {
        public static final int CONSTRUCTOR = -2124399395;
        public long chatId;
        public int unreadReactionCount;

        public UpdateChatUnreadReactionCount() {
        }

        public UpdateChatUnreadReactionCount(long chatId, int unreadReactionCount) {
            this.chatId = chatId;
            this.unreadReactionCount = unreadReactionCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatVideoChat extends Update {
        public static final int CONSTRUCTOR = 637226150;
        public long chatId;
        public VideoChat videoChat;

        public UpdateChatVideoChat() {
        }

        public UpdateChatVideoChat(long chatId, VideoChat videoChat) {
            this.chatId = chatId;
            this.videoChat = videoChat;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatDefaultDisableNotification extends Update {
        public static final int CONSTRUCTOR = 464087707;
        public long chatId;
        public boolean defaultDisableNotification;

        public UpdateChatDefaultDisableNotification() {
        }

        public UpdateChatDefaultDisableNotification(long chatId, boolean defaultDisableNotification) {
            this.chatId = chatId;
            this.defaultDisableNotification = defaultDisableNotification;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatHasProtectedContent extends Update {
        public static final int CONSTRUCTOR = 1800406811;
        public long chatId;
        public boolean hasProtectedContent;

        public UpdateChatHasProtectedContent() {
        }

        public UpdateChatHasProtectedContent(long chatId, boolean hasProtectedContent) {
            this.chatId = chatId;
            this.hasProtectedContent = hasProtectedContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatHasScheduledMessages extends Update {
        public static final int CONSTRUCTOR = 2064958167;
        public long chatId;
        public boolean hasScheduledMessages;

        public UpdateChatHasScheduledMessages() {
        }

        public UpdateChatHasScheduledMessages(long chatId, boolean hasScheduledMessages) {
            this.chatId = chatId;
            this.hasScheduledMessages = hasScheduledMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatIsBlocked extends Update {
        public static final int CONSTRUCTOR = -1998946752;
        public long chatId;
        public boolean isBlocked;

        public UpdateChatIsBlocked() {
        }

        public UpdateChatIsBlocked(long chatId, boolean isBlocked) {
            this.chatId = chatId;
            this.isBlocked = isBlocked;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatIsMarkedAsUnread extends Update {
        public static final int CONSTRUCTOR = 1468347188;
        public long chatId;
        public boolean isMarkedAsUnread;

        public UpdateChatIsMarkedAsUnread() {
        }

        public UpdateChatIsMarkedAsUnread(long chatId, boolean isMarkedAsUnread) {
            this.chatId = chatId;
            this.isMarkedAsUnread = isMarkedAsUnread;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatFilters extends Update {
        public static final int CONSTRUCTOR = 81316953;
        public ChatFilterInfo[] chatFilters;
        public int mainChatListPosition;

        public UpdateChatFilters() {
        }

        public UpdateChatFilters(ChatFilterInfo[] chatFilters, int mainChatListPosition) {
            this.chatFilters = chatFilters;
            this.mainChatListPosition = mainChatListPosition;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatOnlineMemberCount extends Update {
        public static final int CONSTRUCTOR = 487369373;
        public long chatId;
        public int onlineMemberCount;

        public UpdateChatOnlineMemberCount() {
        }

        public UpdateChatOnlineMemberCount(long chatId, int onlineMemberCount) {
            this.chatId = chatId;
            this.onlineMemberCount = onlineMemberCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateScopeNotificationSettings extends Update {
        public static final int CONSTRUCTOR = -1203975309;
        public NotificationSettingsScope scope;
        public ScopeNotificationSettings notificationSettings;

        public UpdateScopeNotificationSettings() {
        }

        public UpdateScopeNotificationSettings(NotificationSettingsScope scope, ScopeNotificationSettings notificationSettings) {
            this.scope = scope;
            this.notificationSettings = notificationSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNotification extends Update {
        public static final int CONSTRUCTOR = -1897496876;
        public int notificationGroupId;
        public Notification notification;

        public UpdateNotification() {
        }

        public UpdateNotification(int notificationGroupId, Notification notification) {
            this.notificationGroupId = notificationGroupId;
            this.notification = notification;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNotificationGroup extends Update {
        public static final int CONSTRUCTOR = 1381081378;
        public int notificationGroupId;
        public NotificationGroupType type;
        public long chatId;
        public long notificationSettingsChatId;
        public long notificationSoundId;
        public int totalCount;
        public Notification[] addedNotifications;
        public int[] removedNotificationIds;

        public UpdateNotificationGroup() {
        }

        public UpdateNotificationGroup(int notificationGroupId, NotificationGroupType type, long chatId, long notificationSettingsChatId, long notificationSoundId, int totalCount, Notification[] addedNotifications, int[] removedNotificationIds) {
            this.notificationGroupId = notificationGroupId;
            this.type = type;
            this.chatId = chatId;
            this.notificationSettingsChatId = notificationSettingsChatId;
            this.notificationSoundId = notificationSoundId;
            this.totalCount = totalCount;
            this.addedNotifications = addedNotifications;
            this.removedNotificationIds = removedNotificationIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateActiveNotifications extends Update {
        public static final int CONSTRUCTOR = -1306672221;
        public NotificationGroup[] groups;

        public UpdateActiveNotifications() {
        }

        public UpdateActiveNotifications(NotificationGroup[] groups) {
            this.groups = groups;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateHavePendingNotifications extends Update {
        public static final int CONSTRUCTOR = 179233243;
        public boolean haveDelayedNotifications;
        public boolean haveUnreceivedNotifications;

        public UpdateHavePendingNotifications() {
        }

        public UpdateHavePendingNotifications(boolean haveDelayedNotifications, boolean haveUnreceivedNotifications) {
            this.haveDelayedNotifications = haveDelayedNotifications;
            this.haveUnreceivedNotifications = haveUnreceivedNotifications;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateDeleteMessages extends Update {
        public static final int CONSTRUCTOR = 1669252686;
        public long chatId;
        public long[] messageIds;
        public boolean isPermanent;
        public boolean fromCache;

        public UpdateDeleteMessages() {
        }

        public UpdateDeleteMessages(long chatId, long[] messageIds, boolean isPermanent, boolean fromCache) {
            this.chatId = chatId;
            this.messageIds = messageIds;
            this.isPermanent = isPermanent;
            this.fromCache = fromCache;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatAction extends Update {
        public static final int CONSTRUCTOR = -1698703832;
        public long chatId;
        public long messageThreadId;
        public MessageSender senderId;
        public ChatAction action;

        public UpdateChatAction() {
        }

        public UpdateChatAction(long chatId, long messageThreadId, MessageSender senderId, ChatAction action) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.senderId = senderId;
            this.action = action;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUserStatus extends Update {
        public static final int CONSTRUCTOR = 958468625;
        public long userId;
        public UserStatus status;

        public UpdateUserStatus() {
        }

        public UpdateUserStatus(long userId, UserStatus status) {
            this.userId = userId;
            this.status = status;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUser extends Update {
        public static final int CONSTRUCTOR = 1183394041;
        public User user;

        public UpdateUser() {
        }

        public UpdateUser(User user) {
            this.user = user;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateBasicGroup extends Update {
        public static final int CONSTRUCTOR = -1003239581;
        public BasicGroup basicGroup;

        public UpdateBasicGroup() {
        }

        public UpdateBasicGroup(BasicGroup basicGroup) {
            this.basicGroup = basicGroup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSupergroup extends Update {
        public static final int CONSTRUCTOR = -76782300;
        public Supergroup supergroup;

        public UpdateSupergroup() {
        }

        public UpdateSupergroup(Supergroup supergroup) {
            this.supergroup = supergroup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSecretChat extends Update {
        public static final int CONSTRUCTOR = -1666903253;
        public SecretChat secretChat;

        public UpdateSecretChat() {
        }

        public UpdateSecretChat(SecretChat secretChat) {
            this.secretChat = secretChat;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUserFullInfo extends Update {
        public static final int CONSTRUCTOR = -51197161;
        public long userId;
        public UserFullInfo userFullInfo;

        public UpdateUserFullInfo() {
        }

        public UpdateUserFullInfo(long userId, UserFullInfo userFullInfo) {
            this.userId = userId;
            this.userFullInfo = userFullInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateBasicGroupFullInfo extends Update {
        public static final int CONSTRUCTOR = 1391881151;
        public long basicGroupId;
        public BasicGroupFullInfo basicGroupFullInfo;

        public UpdateBasicGroupFullInfo() {
        }

        public UpdateBasicGroupFullInfo(long basicGroupId, BasicGroupFullInfo basicGroupFullInfo) {
            this.basicGroupId = basicGroupId;
            this.basicGroupFullInfo = basicGroupFullInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSupergroupFullInfo extends Update {
        public static final int CONSTRUCTOR = 435539214;
        public long supergroupId;
        public SupergroupFullInfo supergroupFullInfo;

        public UpdateSupergroupFullInfo() {
        }

        public UpdateSupergroupFullInfo(long supergroupId, SupergroupFullInfo supergroupFullInfo) {
            this.supergroupId = supergroupId;
            this.supergroupFullInfo = supergroupFullInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateServiceNotification extends Update {
        public static final int CONSTRUCTOR = 1318622637;
        public String type;
        public MessageContent content;

        public UpdateServiceNotification() {
        }

        public UpdateServiceNotification(String type, MessageContent content) {
            this.type = type;
            this.content = content;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFile extends Update {
        public static final int CONSTRUCTOR = 114132831;
        public File file;

        public UpdateFile() {
        }

        public UpdateFile(File file) {
            this.file = file;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileGenerationStart extends Update {
        public static final int CONSTRUCTOR = 216817388;
        public long generationId;
        public String originalPath;
        public String destinationPath;
        public String conversion;

        public UpdateFileGenerationStart() {
        }

        public UpdateFileGenerationStart(long generationId, String originalPath, String destinationPath, String conversion) {
            this.generationId = generationId;
            this.originalPath = originalPath;
            this.destinationPath = destinationPath;
            this.conversion = conversion;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileGenerationStop extends Update {
        public static final int CONSTRUCTOR = -1894449685;
        public long generationId;

        public UpdateFileGenerationStop() {
        }

        public UpdateFileGenerationStop(long generationId) {
            this.generationId = generationId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileDownloads extends Update {
        public static final int CONSTRUCTOR = -389213497;
        public long totalSize;
        public int totalCount;
        public long downloadedSize;

        public UpdateFileDownloads() {
        }

        public UpdateFileDownloads(long totalSize, int totalCount, long downloadedSize) {
            this.totalSize = totalSize;
            this.totalCount = totalCount;
            this.downloadedSize = downloadedSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileAddedToDownloads extends Update {
        public static final int CONSTRUCTOR = 1609929242;
        public FileDownload fileDownload;
        public DownloadedFileCounts counts;

        public UpdateFileAddedToDownloads() {
        }

        public UpdateFileAddedToDownloads(FileDownload fileDownload, DownloadedFileCounts counts) {
            this.fileDownload = fileDownload;
            this.counts = counts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileDownload extends Update {
        public static final int CONSTRUCTOR = 875529162;
        public int fileId;
        public int completeDate;
        public boolean isPaused;
        public DownloadedFileCounts counts;

        public UpdateFileDownload() {
        }

        public UpdateFileDownload(int fileId, int completeDate, boolean isPaused, DownloadedFileCounts counts) {
            this.fileId = fileId;
            this.completeDate = completeDate;
            this.isPaused = isPaused;
            this.counts = counts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFileRemovedFromDownloads extends Update {
        public static final int CONSTRUCTOR = 1853625576;
        public int fileId;
        public DownloadedFileCounts counts;

        public UpdateFileRemovedFromDownloads() {
        }

        public UpdateFileRemovedFromDownloads(int fileId, DownloadedFileCounts counts) {
            this.fileId = fileId;
            this.counts = counts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateCall extends Update {
        public static final int CONSTRUCTOR = 1337184477;
        public Call call;

        public UpdateCall() {
        }

        public UpdateCall(Call call) {
            this.call = call;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateGroupCall extends Update {
        public static final int CONSTRUCTOR = 808603136;
        public GroupCall groupCall;

        public UpdateGroupCall() {
        }

        public UpdateGroupCall(GroupCall groupCall) {
            this.groupCall = groupCall;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateGroupCallParticipant extends Update {
        public static final int CONSTRUCTOR = -803128071;
        public int groupCallId;
        public GroupCallParticipant participant;

        public UpdateGroupCallParticipant() {
        }

        public UpdateGroupCallParticipant(int groupCallId, GroupCallParticipant participant) {
            this.groupCallId = groupCallId;
            this.participant = participant;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewCallSignalingData extends Update {
        public static final int CONSTRUCTOR = 583634317;
        public int callId;
        public byte[] data;

        public UpdateNewCallSignalingData() {
        }

        public UpdateNewCallSignalingData(int callId, byte[] data) {
            this.callId = callId;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUserPrivacySettingRules extends Update {
        public static final int CONSTRUCTOR = -912960778;
        public UserPrivacySetting setting;
        public UserPrivacySettingRules rules;

        public UpdateUserPrivacySettingRules() {
        }

        public UpdateUserPrivacySettingRules(UserPrivacySetting setting, UserPrivacySettingRules rules) {
            this.setting = setting;
            this.rules = rules;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUnreadMessageCount extends Update {
        public static final int CONSTRUCTOR = 78987721;
        public ChatList chatList;
        public int unreadCount;
        public int unreadUnmutedCount;

        public UpdateUnreadMessageCount() {
        }

        public UpdateUnreadMessageCount(ChatList chatList, int unreadCount, int unreadUnmutedCount) {
            this.chatList = chatList;
            this.unreadCount = unreadCount;
            this.unreadUnmutedCount = unreadUnmutedCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUnreadChatCount extends Update {
        public static final int CONSTRUCTOR = 1994494530;
        public ChatList chatList;
        public int totalCount;
        public int unreadCount;
        public int unreadUnmutedCount;
        public int markedAsUnreadCount;
        public int markedAsUnreadUnmutedCount;

        public UpdateUnreadChatCount() {
        }

        public UpdateUnreadChatCount(ChatList chatList, int totalCount, int unreadCount, int unreadUnmutedCount, int markedAsUnreadCount, int markedAsUnreadUnmutedCount) {
            this.chatList = chatList;
            this.totalCount = totalCount;
            this.unreadCount = unreadCount;
            this.unreadUnmutedCount = unreadUnmutedCount;
            this.markedAsUnreadCount = markedAsUnreadCount;
            this.markedAsUnreadUnmutedCount = markedAsUnreadUnmutedCount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateOption extends Update {
        public static final int CONSTRUCTOR = 900822020;
        public String name;
        public OptionValue value;

        public UpdateOption() {
        }

        public UpdateOption(String name, OptionValue value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateStickerSet extends Update {
        public static final int CONSTRUCTOR = 1879268812;
        public StickerSet stickerSet;

        public UpdateStickerSet() {
        }

        public UpdateStickerSet(StickerSet stickerSet) {
            this.stickerSet = stickerSet;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateInstalledStickerSets extends Update {
        public static final int CONSTRUCTOR = 1125575977;
        public boolean isMasks;
        public long[] stickerSetIds;

        public UpdateInstalledStickerSets() {
        }

        public UpdateInstalledStickerSets(boolean isMasks, long[] stickerSetIds) {
            this.isMasks = isMasks;
            this.stickerSetIds = stickerSetIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateTrendingStickerSets extends Update {
        public static final int CONSTRUCTOR = 506689868;
        public TrendingStickerSets stickerSets;

        public UpdateTrendingStickerSets() {
        }

        public UpdateTrendingStickerSets(TrendingStickerSets stickerSets) {
            this.stickerSets = stickerSets;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateRecentStickers extends Update {
        public static final int CONSTRUCTOR = 1906403540;
        public boolean isAttached;
        public int[] stickerIds;

        public UpdateRecentStickers() {
        }

        public UpdateRecentStickers(boolean isAttached, int[] stickerIds) {
            this.isAttached = isAttached;
            this.stickerIds = stickerIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateFavoriteStickers extends Update {
        public static final int CONSTRUCTOR = 1662240999;
        public int[] stickerIds;

        public UpdateFavoriteStickers() {
        }

        public UpdateFavoriteStickers(int[] stickerIds) {
            this.stickerIds = stickerIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSavedAnimations extends Update {
        public static final int CONSTRUCTOR = 65563814;
        public int[] animationIds;

        public UpdateSavedAnimations() {
        }

        public UpdateSavedAnimations(int[] animationIds) {
            this.animationIds = animationIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSavedNotificationSounds extends Update {
        public static final int CONSTRUCTOR = 1052725698;
        public long[] notificationSoundIds;

        public UpdateSavedNotificationSounds() {
        }

        public UpdateSavedNotificationSounds(long[] notificationSoundIds) {
            this.notificationSoundIds = notificationSoundIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSelectedBackground extends Update {
        public static final int CONSTRUCTOR = -1715658659;
        public boolean forDarkTheme;
        public Background background;

        public UpdateSelectedBackground() {
        }

        public UpdateSelectedBackground(boolean forDarkTheme, Background background) {
            this.forDarkTheme = forDarkTheme;
            this.background = background;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatThemes extends Update {
        public static final int CONSTRUCTOR = -1588098376;
        public ChatTheme[] chatThemes;

        public UpdateChatThemes() {
        }

        public UpdateChatThemes(ChatTheme[] chatThemes) {
            this.chatThemes = chatThemes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateLanguagePackStrings extends Update {
        public static final int CONSTRUCTOR = -1056319886;
        public String localizationTarget;
        public String languagePackId;
        public LanguagePackString[] strings;

        public UpdateLanguagePackStrings() {
        }

        public UpdateLanguagePackStrings(String localizationTarget, String languagePackId, LanguagePackString[] strings) {
            this.localizationTarget = localizationTarget;
            this.languagePackId = languagePackId;
            this.strings = strings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateConnectionState extends Update {
        public static final int CONSTRUCTOR = 1469292078;
        public ConnectionState state;

        public UpdateConnectionState() {
        }

        public UpdateConnectionState(ConnectionState state) {
            this.state = state;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateTermsOfService extends Update {
        public static final int CONSTRUCTOR = -1304640162;
        public String termsOfServiceId;
        public TermsOfService termsOfService;

        public UpdateTermsOfService() {
        }

        public UpdateTermsOfService(String termsOfServiceId, TermsOfService termsOfService) {
            this.termsOfServiceId = termsOfServiceId;
            this.termsOfService = termsOfService;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateUsersNearby extends Update {
        public static final int CONSTRUCTOR = -1517109163;
        public ChatNearby[] usersNearby;

        public UpdateUsersNearby() {
        }

        public UpdateUsersNearby(ChatNearby[] usersNearby) {
            this.usersNearby = usersNearby;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateAttachmentMenuBots extends Update {
        public static final int CONSTRUCTOR = 291369922;
        public AttachmentMenuBot[] bots;

        public UpdateAttachmentMenuBots() {
        }

        public UpdateAttachmentMenuBots(AttachmentMenuBot[] bots) {
            this.bots = bots;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateWebAppMessageSent extends Update {
        public static final int CONSTRUCTOR = 1480790569;
        public long webAppLaunchId;

        public UpdateWebAppMessageSent() {
        }

        public UpdateWebAppMessageSent(long webAppLaunchId) {
            this.webAppLaunchId = webAppLaunchId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateReactions extends Update {
        public static final int CONSTRUCTOR = -1086911093;
        public Reaction[] reactions;

        public UpdateReactions() {
        }

        public UpdateReactions(Reaction[] reactions) {
            this.reactions = reactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateDiceEmojis extends Update {
        public static final int CONSTRUCTOR = -1069066940;
        public String[] emojis;

        public UpdateDiceEmojis() {
        }

        public UpdateDiceEmojis(String[] emojis) {
            this.emojis = emojis;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateAnimatedEmojiMessageClicked extends Update {
        public static final int CONSTRUCTOR = -1558809595;
        public long chatId;
        public long messageId;
        public Sticker sticker;

        public UpdateAnimatedEmojiMessageClicked() {
        }

        public UpdateAnimatedEmojiMessageClicked(long chatId, long messageId, Sticker sticker) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateAnimationSearchParameters extends Update {
        public static final int CONSTRUCTOR = -1144983202;
        public String provider;
        public String[] emojis;

        public UpdateAnimationSearchParameters() {
        }

        public UpdateAnimationSearchParameters(String provider, String[] emojis) {
            this.provider = provider;
            this.emojis = emojis;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSuggestedActions extends Update {
        public static final int CONSTRUCTOR = 1459452346;
        public SuggestedAction[] addedActions;
        public SuggestedAction[] removedActions;

        public UpdateSuggestedActions() {
        }

        public UpdateSuggestedActions(SuggestedAction[] addedActions, SuggestedAction[] removedActions) {
            this.addedActions = addedActions;
            this.removedActions = removedActions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewInlineQuery extends Update {
        public static final int CONSTRUCTOR = 1903279924;
        public long id;
        public long senderUserId;
        public Location userLocation;
        public ChatType chatType;
        public String query;
        public String offset;

        public UpdateNewInlineQuery() {
        }

        public UpdateNewInlineQuery(long id, long senderUserId, Location userLocation, ChatType chatType, String query, String offset) {
            this.id = id;
            this.senderUserId = senderUserId;
            this.userLocation = userLocation;
            this.chatType = chatType;
            this.query = query;
            this.offset = offset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewChosenInlineResult extends Update {
        public static final int CONSTRUCTOR = -884191395;
        public long senderUserId;
        public Location userLocation;
        public String query;
        public String resultId;
        public String inlineMessageId;

        public UpdateNewChosenInlineResult() {
        }

        public UpdateNewChosenInlineResult(long senderUserId, Location userLocation, String query, String resultId, String inlineMessageId) {
            this.senderUserId = senderUserId;
            this.userLocation = userLocation;
            this.query = query;
            this.resultId = resultId;
            this.inlineMessageId = inlineMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewCallbackQuery extends Update {
        public static final int CONSTRUCTOR = -1989881762;
        public long id;
        public long senderUserId;
        public long chatId;
        public long messageId;
        public long chatInstance;
        public CallbackQueryPayload payload;

        public UpdateNewCallbackQuery() {
        }

        public UpdateNewCallbackQuery(long id, long senderUserId, long chatId, long messageId, long chatInstance, CallbackQueryPayload payload) {
            this.id = id;
            this.senderUserId = senderUserId;
            this.chatId = chatId;
            this.messageId = messageId;
            this.chatInstance = chatInstance;
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewInlineCallbackQuery extends Update {
        public static final int CONSTRUCTOR = -319212358;
        public long id;
        public long senderUserId;
        public String inlineMessageId;
        public long chatInstance;
        public CallbackQueryPayload payload;

        public UpdateNewInlineCallbackQuery() {
        }

        public UpdateNewInlineCallbackQuery(long id, long senderUserId, String inlineMessageId, long chatInstance, CallbackQueryPayload payload) {
            this.id = id;
            this.senderUserId = senderUserId;
            this.inlineMessageId = inlineMessageId;
            this.chatInstance = chatInstance;
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewShippingQuery extends Update {
        public static final int CONSTRUCTOR = 693651058;
        public long id;
        public long senderUserId;
        public String invoicePayload;
        public Address shippingAddress;

        public UpdateNewShippingQuery() {
        }

        public UpdateNewShippingQuery(long id, long senderUserId, String invoicePayload, Address shippingAddress) {
            this.id = id;
            this.senderUserId = senderUserId;
            this.invoicePayload = invoicePayload;
            this.shippingAddress = shippingAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewPreCheckoutQuery extends Update {
        public static final int CONSTRUCTOR = 708342217;
        public long id;
        public long senderUserId;
        public String currency;
        public long totalAmount;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public OrderInfo orderInfo;

        public UpdateNewPreCheckoutQuery() {
        }

        public UpdateNewPreCheckoutQuery(long id, long senderUserId, String currency, long totalAmount, byte[] invoicePayload, String shippingOptionId, OrderInfo orderInfo) {
            this.id = id;
            this.senderUserId = senderUserId;
            this.currency = currency;
            this.totalAmount = totalAmount;
            this.invoicePayload = invoicePayload;
            this.shippingOptionId = shippingOptionId;
            this.orderInfo = orderInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewCustomEvent extends Update {
        public static final int CONSTRUCTOR = 1994222092;
        public String event;

        public UpdateNewCustomEvent() {
        }

        public UpdateNewCustomEvent(String event) {
            this.event = event;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewCustomQuery extends Update {
        public static final int CONSTRUCTOR = -687670874;
        public long id;
        public String data;
        public int timeout;

        public UpdateNewCustomQuery() {
        }

        public UpdateNewCustomQuery(long id, String data, int timeout) {
            this.id = id;
            this.data = data;
            this.timeout = timeout;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdatePoll extends Update {
        public static final int CONSTRUCTOR = -1771342902;
        public Poll poll;

        public UpdatePoll() {
        }

        public UpdatePoll(Poll poll) {
            this.poll = poll;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdatePollAnswer extends Update {
        public static final int CONSTRUCTOR = -1209100651;
        public long pollId;
        public long userId;
        public int[] optionIds;

        public UpdatePollAnswer() {
        }

        public UpdatePollAnswer(long pollId, long userId, int[] optionIds) {
            this.pollId = pollId;
            this.userId = userId;
            this.optionIds = optionIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateChatMember extends Update {
        public static final int CONSTRUCTOR = -2027989165;
        public long chatId;
        public long actorUserId;
        public int date;
        public ChatInviteLink inviteLink;
        public ChatMember oldChatMember;
        public ChatMember newChatMember;

        public UpdateChatMember() {
        }

        public UpdateChatMember(long chatId, long actorUserId, int date, ChatInviteLink inviteLink, ChatMember oldChatMember, ChatMember newChatMember) {
            this.chatId = chatId;
            this.actorUserId = actorUserId;
            this.date = date;
            this.inviteLink = inviteLink;
            this.oldChatMember = oldChatMember;
            this.newChatMember = newChatMember;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateNewChatJoinRequest extends Update {
        public static final int CONSTRUCTOR = 175285905;
        public long chatId;
        public ChatJoinRequest request;
        public ChatInviteLink inviteLink;

        public UpdateNewChatJoinRequest() {
        }

        public UpdateNewChatJoinRequest(long chatId, ChatJoinRequest request, ChatInviteLink inviteLink) {
            this.chatId = chatId;
            this.request = request;
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Updates extends Object {
        public static final int CONSTRUCTOR = 475842347;
        public Update[] updates;

        public Updates() {
        }

        public Updates(Update[] updates) {
            this.updates = updates;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class User extends Object {
        public static final int CONSTRUCTOR = -1445665209;
        public long id;
        public String firstName;
        public String lastName;
        public String username;
        public String phoneNumber;
        public UserStatus status;
        public ProfilePhoto profilePhoto;
        public boolean isContact;
        public boolean isMutualContact;
        public boolean isVerified;
        public boolean isPremium;
        public boolean isSupport;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;
        public boolean haveAccess;
        public UserType type;
        public String languageCode;
        public boolean addedToAttachmentMenu;

        public User() {
        }

        public User(long id, String firstName, String lastName, String username, String phoneNumber, UserStatus status, ProfilePhoto profilePhoto, boolean isContact, boolean isMutualContact, boolean isVerified, boolean isPremium, boolean isSupport, String restrictionReason, boolean isScam, boolean isFake, boolean haveAccess, UserType type, String languageCode, boolean addedToAttachmentMenu) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.phoneNumber = phoneNumber;
            this.status = status;
            this.profilePhoto = profilePhoto;
            this.isContact = isContact;
            this.isMutualContact = isMutualContact;
            this.isVerified = isVerified;
            this.isPremium = isPremium;
            this.isSupport = isSupport;
            this.restrictionReason = restrictionReason;
            this.isScam = isScam;
            this.isFake = isFake;
            this.haveAccess = haveAccess;
            this.type = type;
            this.languageCode = languageCode;
            this.addedToAttachmentMenu = addedToAttachmentMenu;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserFullInfo extends Object {
        public static final int CONSTRUCTOR = -675219095;
        public ChatPhoto photo;
        public boolean isBlocked;
        public boolean canBeCalled;
        public boolean supportsVideoCalls;
        public boolean hasPrivateCalls;
        public boolean hasPrivateForwards;
        public boolean needPhoneNumberPrivacyException;
        public FormattedText bio;
        public int groupInCommonCount;
        public BotInfo botInfo;

        public UserFullInfo() {
        }

        public UserFullInfo(ChatPhoto photo, boolean isBlocked, boolean canBeCalled, boolean supportsVideoCalls, boolean hasPrivateCalls, boolean hasPrivateForwards, boolean needPhoneNumberPrivacyException, FormattedText bio, int groupInCommonCount, BotInfo botInfo) {
            this.photo = photo;
            this.isBlocked = isBlocked;
            this.canBeCalled = canBeCalled;
            this.supportsVideoCalls = supportsVideoCalls;
            this.hasPrivateCalls = hasPrivateCalls;
            this.hasPrivateForwards = hasPrivateForwards;
            this.needPhoneNumberPrivacyException = needPhoneNumberPrivacyException;
            this.bio = bio;
            this.groupInCommonCount = groupInCommonCount;
            this.botInfo = botInfo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class UserPrivacySetting extends Object {
    }

    public static class UserPrivacySettingShowStatus extends UserPrivacySetting {

        public static final int CONSTRUCTOR = 1862829310;

        public UserPrivacySettingShowStatus() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowProfilePhoto extends UserPrivacySetting {

        public static final int CONSTRUCTOR = 1408485877;

        public UserPrivacySettingShowProfilePhoto() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowLinkInForwardedMessages extends UserPrivacySetting {

        public static final int CONSTRUCTOR = 592688870;

        public UserPrivacySettingShowLinkInForwardedMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingShowPhoneNumber extends UserPrivacySetting {

        public static final int CONSTRUCTOR = -791567831;

        public UserPrivacySettingShowPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowChatInvites extends UserPrivacySetting {

        public static final int CONSTRUCTOR = 1271668007;

        public UserPrivacySettingAllowChatInvites() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowCalls extends UserPrivacySetting {

        public static final int CONSTRUCTOR = -906967291;

        public UserPrivacySettingAllowCalls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowPeerToPeerCalls extends UserPrivacySetting {

        public static final int CONSTRUCTOR = 352500032;

        public UserPrivacySettingAllowPeerToPeerCalls() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingAllowFindingByPhoneNumber extends UserPrivacySetting {

        public static final int CONSTRUCTOR = -1846645423;

        public UserPrivacySettingAllowFindingByPhoneNumber() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class UserPrivacySettingRule extends Object {
    }

    public static class UserPrivacySettingRuleAllowAll extends UserPrivacySettingRule {

        public static final int CONSTRUCTOR = -1967186881;

        public UserPrivacySettingRuleAllowAll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleAllowContacts extends UserPrivacySettingRule {

        public static final int CONSTRUCTOR = -1892733680;

        public UserPrivacySettingRuleAllowContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleAllowUsers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 1110988334;
        public long[] userIds;

        public UserPrivacySettingRuleAllowUsers() {
        }

        public UserPrivacySettingRuleAllowUsers(long[] userIds) {
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleAllowChatMembers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -2048749863;
        public long[] chatIds;

        public UserPrivacySettingRuleAllowChatMembers() {
        }

        public UserPrivacySettingRuleAllowChatMembers(long[] chatIds) {
            this.chatIds = chatIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictAll extends UserPrivacySettingRule {

        public static final int CONSTRUCTOR = -1406495408;

        public UserPrivacySettingRuleRestrictAll() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictContacts extends UserPrivacySettingRule {

        public static final int CONSTRUCTOR = 1008389378;

        public UserPrivacySettingRuleRestrictContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictUsers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 622796522;
        public long[] userIds;

        public UserPrivacySettingRuleRestrictUsers() {
        }

        public UserPrivacySettingRuleRestrictUsers(long[] userIds) {
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRuleRestrictChatMembers extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 392530897;
        public long[] chatIds;

        public UserPrivacySettingRuleRestrictChatMembers() {
        }

        public UserPrivacySettingRuleRestrictChatMembers(long[] chatIds) {
            this.chatIds = chatIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserPrivacySettingRules extends Object {
        public static final int CONSTRUCTOR = 322477541;
        public UserPrivacySettingRule[] rules;

        public UserPrivacySettingRules() {
        }

        public UserPrivacySettingRules(UserPrivacySettingRule[] rules) {
            this.rules = rules;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class UserStatus extends Object {
    }

    public static class UserStatusEmpty extends UserStatus {

        public static final int CONSTRUCTOR = 164646985;

        public UserStatusEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusOnline extends UserStatus {
        public static final int CONSTRUCTOR = -1529460876;
        public int expires;

        public UserStatusOnline() {
        }

        public UserStatusOnline(int expires) {
            this.expires = expires;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusOffline extends UserStatus {
        public static final int CONSTRUCTOR = -759984891;
        public int wasOnline;

        public UserStatusOffline() {
        }

        public UserStatusOffline(int wasOnline) {
            this.wasOnline = wasOnline;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusRecently extends UserStatus {

        public static final int CONSTRUCTOR = -496024847;

        public UserStatusRecently() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusLastWeek extends UserStatus {

        public static final int CONSTRUCTOR = 129960444;

        public UserStatusLastWeek() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserStatusLastMonth extends UserStatus {

        public static final int CONSTRUCTOR = 2011940674;

        public UserStatusLastMonth() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class UserType extends Object {
    }

    public static class UserTypeRegular extends UserType {

        public static final int CONSTRUCTOR = -598644325;

        public UserTypeRegular() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserTypeDeleted extends UserType {

        public static final int CONSTRUCTOR = -1807729372;

        public UserTypeDeleted() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserTypeBot extends UserType {
        public static final int CONSTRUCTOR = -970625144;
        public boolean canJoinGroups;
        public boolean canReadAllGroupMessages;
        public boolean isInline;
        public String inlineQueryPlaceholder;
        public boolean needLocation;
        public boolean canBeAddedToAttachmentMenu;

        public UserTypeBot() {
        }

        public UserTypeBot(boolean canJoinGroups, boolean canReadAllGroupMessages, boolean isInline, String inlineQueryPlaceholder, boolean needLocation, boolean canBeAddedToAttachmentMenu) {
            this.canJoinGroups = canJoinGroups;
            this.canReadAllGroupMessages = canReadAllGroupMessages;
            this.isInline = isInline;
            this.inlineQueryPlaceholder = inlineQueryPlaceholder;
            this.needLocation = needLocation;
            this.canBeAddedToAttachmentMenu = canBeAddedToAttachmentMenu;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UserTypeUnknown extends UserType {

        public static final int CONSTRUCTOR = -724541123;

        public UserTypeUnknown() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Users extends Object {
        public static final int CONSTRUCTOR = 171203420;
        public int totalCount;
        public long[] userIds;

        public Users() {
        }

        public Users(int totalCount, long[] userIds) {
            this.totalCount = totalCount;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ValidatedOrderInfo extends Object {
        public static final int CONSTRUCTOR = 1511451484;
        public String orderInfoId;
        public ShippingOption[] shippingOptions;

        public ValidatedOrderInfo() {
        }

        public ValidatedOrderInfo(String orderInfoId, ShippingOption[] shippingOptions) {
            this.orderInfoId = orderInfoId;
            this.shippingOptions = shippingOptions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class VectorPathCommand extends Object {
    }

    public static class VectorPathCommandLine extends VectorPathCommand {
        public static final int CONSTRUCTOR = -614056822;
        public Point endPoint;

        public VectorPathCommandLine() {
        }

        public VectorPathCommandLine(Point endPoint) {
            this.endPoint = endPoint;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class VectorPathCommandCubicBezierCurve extends VectorPathCommand {
        public static final int CONSTRUCTOR = 1229733434;
        public Point startControlPoint;
        public Point endControlPoint;
        public Point endPoint;

        public VectorPathCommandCubicBezierCurve() {
        }

        public VectorPathCommandCubicBezierCurve(Point startControlPoint, Point endControlPoint, Point endPoint) {
            this.startControlPoint = startControlPoint;
            this.endControlPoint = endControlPoint;
            this.endPoint = endPoint;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Venue extends Object {
        public static final int CONSTRUCTOR = 1070406393;
        public Location location;
        public String title;
        public String address;
        public String provider;
        public String id;
        public String type;

        public Venue() {
        }

        public Venue(Location location, String title, String address, String provider, String id, String type) {
            this.location = location;
            this.title = title;
            this.address = address;
            this.provider = provider;
            this.id = id;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Video extends Object {
        public static final int CONSTRUCTOR = 832856268;
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public boolean supportsStreaming;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File video;

        public Video() {
        }

        public Video(int duration, int width, int height, String fileName, String mimeType, boolean hasStickers, boolean supportsStreaming, Minithumbnail minithumbnail, Thumbnail thumbnail, File video) {
            this.duration = duration;
            this.width = width;
            this.height = height;
            this.fileName = fileName;
            this.mimeType = mimeType;
            this.hasStickers = hasStickers;
            this.supportsStreaming = supportsStreaming;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.video = video;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class VideoChat extends Object {
        public static final int CONSTRUCTOR = -1374319320;
        public int groupCallId;
        public boolean hasParticipants;
        public MessageSender defaultParticipantId;

        public VideoChat() {
        }

        public VideoChat(int groupCallId, boolean hasParticipants, MessageSender defaultParticipantId) {
            this.groupCallId = groupCallId;
            this.hasParticipants = hasParticipants;
            this.defaultParticipantId = defaultParticipantId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class VideoNote extends Object {
        public static final int CONSTRUCTOR = -71734726;
        public int duration;
        public int length;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File video;

        public VideoNote() {
        }

        public VideoNote(int duration, int length, Minithumbnail minithumbnail, Thumbnail thumbnail, File video) {
            this.duration = duration;
            this.length = length;
            this.minithumbnail = minithumbnail;
            this.thumbnail = thumbnail;
            this.video = video;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class VoiceNote extends Object {
        public static final int CONSTRUCTOR = 20629272;
        public int duration;
        public byte[] waveform;
        public String mimeType;
        public boolean isRecognized;
        public String recognizedText;
        public File voice;

        public VoiceNote() {
        }

        public VoiceNote(int duration, byte[] waveform, String mimeType, boolean isRecognized, String recognizedText, File voice) {
            this.duration = duration;
            this.waveform = waveform;
            this.mimeType = mimeType;
            this.isRecognized = isRecognized;
            this.recognizedText = recognizedText;
            this.voice = voice;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WebAppInfo extends Object {
        public static final int CONSTRUCTOR = 788378344;
        public long launchId;
        public String url;

        public WebAppInfo() {
        }

        public WebAppInfo(long launchId, String url) {
            this.launchId = launchId;
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WebPage extends Object {
        public static final int CONSTRUCTOR = -577333714;
        public String url;
        public String displayUrl;
        public String type;
        public String siteName;
        public String title;
        public FormattedText description;
        public Photo photo;
        public String embedUrl;
        public String embedType;
        public int embedWidth;
        public int embedHeight;
        public int duration;
        public String author;
        public Animation animation;
        public Audio audio;
        public Document document;
        public Sticker sticker;
        public Video video;
        public VideoNote videoNote;
        public VoiceNote voiceNote;
        public int instantViewVersion;

        public WebPage() {
        }

        public WebPage(String url, String displayUrl, String type, String siteName, String title, FormattedText description, Photo photo, String embedUrl, String embedType, int embedWidth, int embedHeight, int duration, String author, Animation animation, Audio audio, Document document, Sticker sticker, Video video, VideoNote videoNote, VoiceNote voiceNote, int instantViewVersion) {
            this.url = url;
            this.displayUrl = displayUrl;
            this.type = type;
            this.siteName = siteName;
            this.title = title;
            this.description = description;
            this.photo = photo;
            this.embedUrl = embedUrl;
            this.embedType = embedType;
            this.embedWidth = embedWidth;
            this.embedHeight = embedHeight;
            this.duration = duration;
            this.author = author;
            this.animation = animation;
            this.audio = audio;
            this.document = document;
            this.sticker = sticker;
            this.video = video;
            this.videoNote = videoNote;
            this.voiceNote = voiceNote;
            this.instantViewVersion = instantViewVersion;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WebPageInstantView extends Object {
        public static final int CONSTRUCTOR = 778202453;
        public PageBlock[] pageBlocks;
        public int viewCount;
        public int version;
        public boolean isRtl;
        public boolean isFull;
        public InternalLinkType feedbackLink;

        public WebPageInstantView() {
        }

        public WebPageInstantView(PageBlock[] pageBlocks, int viewCount, int version, boolean isRtl, boolean isFull, InternalLinkType feedbackLink) {
            this.pageBlocks = pageBlocks;
            this.viewCount = viewCount;
            this.version = version;
            this.isRtl = isRtl;
            this.isFull = isFull;
            this.feedbackLink = feedbackLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AcceptCall extends Function<Ok> {
        public static final int CONSTRUCTOR = -646618416;
        public int callId;
        public CallProtocol protocol;

        public AcceptCall() {
        }

        public AcceptCall(int callId, CallProtocol protocol) {
            this.callId = callId;
            this.protocol = protocol;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AcceptTermsOfService extends Function<Ok> {
        public static final int CONSTRUCTOR = 2130576356;
        public String termsOfServiceId;

        public AcceptTermsOfService() {
        }

        public AcceptTermsOfService(String termsOfServiceId) {
            this.termsOfServiceId = termsOfServiceId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddChatMember extends Function<Ok> {
        public static final int CONSTRUCTOR = 499426810;
        public long chatId;
        public long userId;
        public int forwardLimit;

        public AddChatMember() {
        }

        public AddChatMember(long chatId, long userId, int forwardLimit) {
            this.chatId = chatId;
            this.userId = userId;
            this.forwardLimit = forwardLimit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddChatMembers extends Function<Ok> {
        public static final int CONSTRUCTOR = -519951226;
        public long chatId;
        public long[] userIds;

        public AddChatMembers() {
        }

        public AddChatMembers(long chatId, long[] userIds) {
            this.chatId = chatId;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddChatToList extends Function<Ok> {
        public static final int CONSTRUCTOR = -80523595;
        public long chatId;
        public ChatList chatList;

        public AddChatToList() {
        }

        public AddChatToList(long chatId, ChatList chatList) {
            this.chatId = chatId;
            this.chatList = chatList;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddContact extends Function<Ok> {
        public static final int CONSTRUCTOR = 1869640000;
        public Contact contact;
        public boolean sharePhoneNumber;

        public AddContact() {
        }

        public AddContact(Contact contact, boolean sharePhoneNumber) {
            this.contact = contact;
            this.sharePhoneNumber = sharePhoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddCustomServerLanguagePack extends Function<Ok> {
        public static final int CONSTRUCTOR = 4492771;
        public String languagePackId;

        public AddCustomServerLanguagePack() {
        }

        public AddCustomServerLanguagePack(String languagePackId) {
            this.languagePackId = languagePackId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddFavoriteSticker extends Function<Ok> {
        public static final int CONSTRUCTOR = 324504799;
        public InputFile sticker;

        public AddFavoriteSticker() {
        }

        public AddFavoriteSticker(InputFile sticker) {
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddFileToDownloads extends Function<File> {
        public static final int CONSTRUCTOR = 867533751;
        public int fileId;
        public long chatId;
        public long messageId;
        public int priority;

        public AddFileToDownloads() {
        }

        public AddFileToDownloads(int fileId, long chatId, long messageId, int priority) {
            this.fileId = fileId;
            this.chatId = chatId;
            this.messageId = messageId;
            this.priority = priority;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddLocalMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -1998878725;
        public long chatId;
        public MessageSender senderId;
        public long replyToMessageId;
        public boolean disableNotification;
        public InputMessageContent inputMessageContent;

        public AddLocalMessage() {
        }

        public AddLocalMessage(long chatId, MessageSender senderId, long replyToMessageId, boolean disableNotification, InputMessageContent inputMessageContent) {
            this.chatId = chatId;
            this.senderId = senderId;
            this.replyToMessageId = replyToMessageId;
            this.disableNotification = disableNotification;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddLogMessage extends Function<Ok> {
        public static final int CONSTRUCTOR = 1597427692;
        public int verbosityLevel;
        public String text;

        public AddLogMessage() {
        }

        public AddLogMessage(int verbosityLevel, String text) {
            this.verbosityLevel = verbosityLevel;
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddNetworkStatistics extends Function<Ok> {
        public static final int CONSTRUCTOR = 1264825305;
        public NetworkStatisticsEntry entry;

        public AddNetworkStatistics() {
        }

        public AddNetworkStatistics(NetworkStatisticsEntry entry) {
            this.entry = entry;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddProxy extends Function<Proxy> {
        public static final int CONSTRUCTOR = 331529432;
        public String server;
        public int port;
        public boolean enable;
        public ProxyType type;

        public AddProxy() {
        }

        public AddProxy(String server, int port, boolean enable, ProxyType type) {
            this.server = server;
            this.port = port;
            this.enable = enable;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddRecentSticker extends Function<Stickers> {
        public static final int CONSTRUCTOR = -1478109026;
        public boolean isAttached;
        public InputFile sticker;

        public AddRecentSticker() {
        }

        public AddRecentSticker(boolean isAttached, InputFile sticker) {
            this.isAttached = isAttached;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddRecentlyFoundChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -1746396787;
        public long chatId;

        public AddRecentlyFoundChat() {
        }

        public AddRecentlyFoundChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddSavedAnimation extends Function<Ok> {
        public static final int CONSTRUCTOR = -1538525088;
        public InputFile animation;

        public AddSavedAnimation() {
        }

        public AddSavedAnimation(InputFile animation) {
            this.animation = animation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddSavedNotificationSound extends Function<NotificationSound> {
        public static final int CONSTRUCTOR = 1043956975;
        public InputFile sound;

        public AddSavedNotificationSound() {
        }

        public AddSavedNotificationSound(InputFile sound) {
            this.sound = sound;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddStickerToSet extends Function<StickerSet> {
        public static final int CONSTRUCTOR = -1340783267;
        public long userId;
        public String name;
        public InputSticker sticker;

        public AddStickerToSet() {
        }

        public AddStickerToSet(long userId, String name, InputSticker sticker) {
            this.userId = userId;
            this.name = name;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerCallbackQuery extends Function<Ok> {
        public static final int CONSTRUCTOR = -1153028490;
        public long callbackQueryId;
        public String text;
        public boolean showAlert;
        public String url;
        public int cacheTime;

        public AnswerCallbackQuery() {
        }

        public AnswerCallbackQuery(long callbackQueryId, String text, boolean showAlert, String url, int cacheTime) {
            this.callbackQueryId = callbackQueryId;
            this.text = text;
            this.showAlert = showAlert;
            this.url = url;
            this.cacheTime = cacheTime;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerCustomQuery extends Function<Ok> {
        public static final int CONSTRUCTOR = -1293603521;
        public long customQueryId;
        public String data;

        public AnswerCustomQuery() {
        }

        public AnswerCustomQuery(long customQueryId, String data) {
            this.customQueryId = customQueryId;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerInlineQuery extends Function<Ok> {
        public static final int CONSTRUCTOR = 485879477;
        public long inlineQueryId;
        public boolean isPersonal;
        public InputInlineQueryResult[] results;
        public int cacheTime;
        public String nextOffset;
        public String switchPmText;
        public String switchPmParameter;

        public AnswerInlineQuery() {
        }

        public AnswerInlineQuery(long inlineQueryId, boolean isPersonal, InputInlineQueryResult[] results, int cacheTime, String nextOffset, String switchPmText, String switchPmParameter) {
            this.inlineQueryId = inlineQueryId;
            this.isPersonal = isPersonal;
            this.results = results;
            this.cacheTime = cacheTime;
            this.nextOffset = nextOffset;
            this.switchPmText = switchPmText;
            this.switchPmParameter = switchPmParameter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerPreCheckoutQuery extends Function<Ok> {
        public static final int CONSTRUCTOR = -1486789653;
        public long preCheckoutQueryId;
        public String errorMessage;

        public AnswerPreCheckoutQuery() {
        }

        public AnswerPreCheckoutQuery(long preCheckoutQueryId, String errorMessage) {
            this.preCheckoutQueryId = preCheckoutQueryId;
            this.errorMessage = errorMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerShippingQuery extends Function<Ok> {
        public static final int CONSTRUCTOR = -434601324;
        public long shippingQueryId;
        public ShippingOption[] shippingOptions;
        public String errorMessage;

        public AnswerShippingQuery() {
        }

        public AnswerShippingQuery(long shippingQueryId, ShippingOption[] shippingOptions, String errorMessage) {
            this.shippingQueryId = shippingQueryId;
            this.shippingOptions = shippingOptions;
            this.errorMessage = errorMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AnswerWebAppQuery extends Function<SentWebAppMessage> {
        public static final int CONSTRUCTOR = -1598776079;
        public String webAppQueryId;
        public InputInlineQueryResult result;

        public AnswerWebAppQuery() {
        }

        public AnswerWebAppQuery(String webAppQueryId, InputInlineQueryResult result) {
            this.webAppQueryId = webAppQueryId;
            this.result = result;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AssignAppStoreTransaction extends Function<Ok> {
        public static final int CONSTRUCTOR = -1460996225;
        public byte[] receipt;
        public boolean isRestore;

        public AssignAppStoreTransaction() {
        }

        public AssignAppStoreTransaction(byte[] receipt, boolean isRestore) {
            this.receipt = receipt;
            this.isRestore = isRestore;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AssignGooglePlayTransaction extends Function<Ok> {
        public static final int CONSTRUCTOR = 1375483965;
        public String purchaseToken;

        public AssignGooglePlayTransaction() {
        }

        public AssignGooglePlayTransaction(String purchaseToken) {
            this.purchaseToken = purchaseToken;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BanChatMember extends Function<Ok> {
        public static final int CONSTRUCTOR = -888111748;
        public long chatId;
        public MessageSender memberId;
        public int bannedUntilDate;
        public boolean revokeMessages;

        public BanChatMember() {
        }

        public BanChatMember(long chatId, MessageSender memberId, int bannedUntilDate, boolean revokeMessages) {
            this.chatId = chatId;
            this.memberId = memberId;
            this.bannedUntilDate = bannedUntilDate;
            this.revokeMessages = revokeMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlockMessageSenderFromReplies extends Function<Ok> {
        public static final int CONSTRUCTOR = -1214384757;
        public long messageId;
        public boolean deleteMessage;
        public boolean deleteAllMessages;
        public boolean reportSpam;

        public BlockMessageSenderFromReplies() {
        }

        public BlockMessageSenderFromReplies(long messageId, boolean deleteMessage, boolean deleteAllMessages, boolean reportSpam) {
            this.messageId = messageId;
            this.deleteMessage = deleteMessage;
            this.deleteAllMessages = deleteAllMessages;
            this.reportSpam = reportSpam;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanPurchasePremium extends Function<Ok> {

        public static final int CONSTRUCTOR = 1049427073;

        public CanPurchasePremium() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CanTransferOwnership extends Function<CanTransferOwnershipResult> {

        public static final int CONSTRUCTOR = 634602508;

        public CanTransferOwnership() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CancelDownloadFile extends Function<Ok> {
        public static final int CONSTRUCTOR = -1954524450;
        public int fileId;
        public boolean onlyIfPending;

        public CancelDownloadFile() {
        }

        public CancelDownloadFile(int fileId, boolean onlyIfPending) {
            this.fileId = fileId;
            this.onlyIfPending = onlyIfPending;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CancelPasswordReset extends Function<Ok> {

        public static final int CONSTRUCTOR = 940733538;

        public CancelPasswordReset() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CancelUploadFile extends Function<Ok> {
        public static final int CONSTRUCTOR = 1623539600;
        public int fileId;

        public CancelUploadFile() {
        }

        public CancelUploadFile(int fileId) {
            this.fileId = fileId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChangeImportedContacts extends Function<ImportedContacts> {
        public static final int CONSTRUCTOR = 1968207955;
        public Contact[] contacts;

        public ChangeImportedContacts() {
        }

        public ChangeImportedContacts(Contact[] contacts) {
            this.contacts = contacts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChangePhoneNumber extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -124666973;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public ChangePhoneNumber() {
        }

        public ChangePhoneNumber(String phoneNumber, PhoneNumberAuthenticationSettings settings) {
            this.phoneNumber = phoneNumber;
            this.settings = settings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChangeStickerSet extends Function<Ok> {
        public static final int CONSTRUCTOR = 449357293;
        public long setId;
        public boolean isInstalled;
        public boolean isArchived;

        public ChangeStickerSet() {
        }

        public ChangeStickerSet(long setId, boolean isInstalled, boolean isArchived) {
            this.setId = setId;
            this.isInstalled = isInstalled;
            this.isArchived = isArchived;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckAuthenticationBotToken extends Function<Ok> {
        public static final int CONSTRUCTOR = 639321206;
        public String token;

        public CheckAuthenticationBotToken() {
        }

        public CheckAuthenticationBotToken(String token) {
            this.token = token;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckAuthenticationCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -302103382;
        public String code;

        public CheckAuthenticationCode() {
        }

        public CheckAuthenticationCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckAuthenticationPassword extends Function<Ok> {
        public static final int CONSTRUCTOR = -2025698400;
        public String password;

        public CheckAuthenticationPassword() {
        }

        public CheckAuthenticationPassword(String password) {
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckAuthenticationPasswordRecoveryCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -603309083;
        public String recoveryCode;

        public CheckAuthenticationPasswordRecoveryCode() {
        }

        public CheckAuthenticationPasswordRecoveryCode(String recoveryCode) {
            this.recoveryCode = recoveryCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChangePhoneNumberCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -1720278429;
        public String code;

        public CheckChangePhoneNumberCode() {
        }

        public CheckChangePhoneNumberCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatInviteLink extends Function<ChatInviteLinkInfo> {
        public static final int CONSTRUCTOR = -496940997;
        public String inviteLink;

        public CheckChatInviteLink() {
        }

        public CheckChatInviteLink(String inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckChatUsername extends Function<CheckChatUsernameResult> {
        public static final int CONSTRUCTOR = -119119344;
        public long chatId;
        public String username;

        public CheckChatUsername() {
        }

        public CheckChatUsername(long chatId, String username) {
            this.chatId = chatId;
            this.username = username;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckCreatedPublicChatsLimit extends Function<Ok> {
        public static final int CONSTRUCTOR = -445546591;
        public PublicChatType type;

        public CheckCreatedPublicChatsLimit() {
        }

        public CheckCreatedPublicChatsLimit(PublicChatType type) {
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckDatabaseEncryptionKey extends Function<Ok> {
        public static final int CONSTRUCTOR = 1018769307;
        public byte[] encryptionKey;

        public CheckDatabaseEncryptionKey() {
        }

        public CheckDatabaseEncryptionKey(byte[] encryptionKey) {
            this.encryptionKey = encryptionKey;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckEmailAddressVerificationCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -426386685;
        public String code;

        public CheckEmailAddressVerificationCode() {
        }

        public CheckEmailAddressVerificationCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckPasswordRecoveryCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -200794600;
        public String recoveryCode;

        public CheckPasswordRecoveryCode() {
        }

        public CheckPasswordRecoveryCode(String recoveryCode) {
            this.recoveryCode = recoveryCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckPhoneNumberConfirmationCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -1348060966;
        public String code;

        public CheckPhoneNumberConfirmationCode() {
        }

        public CheckPhoneNumberConfirmationCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckPhoneNumberVerificationCode extends Function<Ok> {
        public static final int CONSTRUCTOR = 1497462718;
        public String code;

        public CheckPhoneNumberVerificationCode() {
        }

        public CheckPhoneNumberVerificationCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckRecoveryEmailAddressCode extends Function<PasswordState> {
        public static final int CONSTRUCTOR = -1997039589;
        public String code;

        public CheckRecoveryEmailAddressCode() {
        }

        public CheckRecoveryEmailAddressCode(String code) {
            this.code = code;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CheckStickerSetName extends Function<CheckStickerSetNameResult> {
        public static final int CONSTRUCTOR = -1789392642;
        public String name;

        public CheckStickerSetName() {
        }

        public CheckStickerSetName(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CleanFileName extends Function<Text> {
        public static final int CONSTRUCTOR = 967964667;
        public String fileName;

        public CleanFileName() {
        }

        public CleanFileName(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClearAllDraftMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -46369573;
        public boolean excludeSecretChats;

        public ClearAllDraftMessages() {
        }

        public ClearAllDraftMessages(boolean excludeSecretChats) {
            this.excludeSecretChats = excludeSecretChats;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClearImportedContacts extends Function<Ok> {

        public static final int CONSTRUCTOR = 869503298;

        public ClearImportedContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClearRecentStickers extends Function<Ok> {
        public static final int CONSTRUCTOR = -321242684;
        public boolean isAttached;

        public ClearRecentStickers() {
        }

        public ClearRecentStickers(boolean isAttached) {
            this.isAttached = isAttached;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClearRecentlyFoundChats extends Function<Ok> {

        public static final int CONSTRUCTOR = -285582542;

        public ClearRecentlyFoundChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClickAnimatedEmojiMessage extends Function<Sticker> {
        public static final int CONSTRUCTOR = 196179554;
        public long chatId;
        public long messageId;

        public ClickAnimatedEmojiMessage() {
        }

        public ClickAnimatedEmojiMessage(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ClickPremiumSubscriptionButton extends Function<Ok> {

        public static final int CONSTRUCTOR = -369319162;

        public ClickPremiumSubscriptionButton() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Close extends Function<Ok> {

        public static final int CONSTRUCTOR = -1187782273;

        public Close() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CloseChat extends Function<Ok> {
        public static final int CONSTRUCTOR = 39749353;
        public long chatId;

        public CloseChat() {
        }

        public CloseChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CloseSecretChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -471006133;
        public int secretChatId;

        public CloseSecretChat() {
        }

        public CloseSecretChat(int secretChatId) {
            this.secretChatId = secretChatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CloseWebApp extends Function<Ok> {
        public static final int CONSTRUCTOR = 1755391174;
        public long webAppLaunchId;

        public CloseWebApp() {
        }

        public CloseWebApp(long webAppLaunchId) {
            this.webAppLaunchId = webAppLaunchId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConfirmQrCodeAuthentication extends Function<Session> {
        public static final int CONSTRUCTOR = -376199379;
        public String link;

        public ConfirmQrCodeAuthentication() {
        }

        public ConfirmQrCodeAuthentication(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateBasicGroupChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 1972024548;
        public long basicGroupId;
        public boolean force;

        public CreateBasicGroupChat() {
        }

        public CreateBasicGroupChat(long basicGroupId, boolean force) {
            this.basicGroupId = basicGroupId;
            this.force = force;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateCall extends Function<CallId> {
        public static final int CONSTRUCTOR = -1104663024;
        public long userId;
        public CallProtocol protocol;
        public boolean isVideo;

        public CreateCall() {
        }

        public CreateCall(long userId, CallProtocol protocol, boolean isVideo) {
            this.userId = userId;
            this.protocol = protocol;
            this.isVideo = isVideo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateChatFilter extends Function<ChatFilterInfo> {
        public static final int CONSTRUCTOR = 49065126;
        public ChatFilter filter;

        public CreateChatFilter() {
        }

        public CreateChatFilter(ChatFilter filter) {
            this.filter = filter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateChatInviteLink extends Function<ChatInviteLink> {
        public static final int CONSTRUCTOR = 287744833;
        public long chatId;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;

        public CreateChatInviteLink() {
        }

        public CreateChatInviteLink(long chatId, String name, int expirationDate, int memberLimit, boolean createsJoinRequest) {
            this.chatId = chatId;
            this.name = name;
            this.expirationDate = expirationDate;
            this.memberLimit = memberLimit;
            this.createsJoinRequest = createsJoinRequest;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateInvoiceLink extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 216787233;
        public InputMessageContent invoice;

        public CreateInvoiceLink() {
        }

        public CreateInvoiceLink(InputMessageContent invoice) {
            this.invoice = invoice;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateNewBasicGroupChat extends Function<Chat> {
        public static final int CONSTRUCTOR = -2104438789;
        public long[] userIds;
        public String title;

        public CreateNewBasicGroupChat() {
        }

        public CreateNewBasicGroupChat(long[] userIds, String title) {
            this.userIds = userIds;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateNewSecretChat extends Function<Chat> {
        public static final int CONSTRUCTOR = -620682651;
        public long userId;

        public CreateNewSecretChat() {
        }

        public CreateNewSecretChat(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateNewStickerSet extends Function<StickerSet> {
        public static final int CONSTRUCTOR = -1682292738;
        public long userId;
        public String title;
        public String name;
        public InputSticker[] stickers;
        public String source;

        public CreateNewStickerSet() {
        }

        public CreateNewStickerSet(long userId, String title, String name, InputSticker[] stickers, String source) {
            this.userId = userId;
            this.title = title;
            this.name = name;
            this.stickers = stickers;
            this.source = source;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateNewSupergroupChat extends Function<Chat> {
        public static final int CONSTRUCTOR = -830232895;
        public String title;
        public boolean isChannel;
        public String description;
        public ChatLocation location;
        public boolean forImport;

        public CreateNewSupergroupChat() {
        }

        public CreateNewSupergroupChat(String title, boolean isChannel, String description, ChatLocation location, boolean forImport) {
            this.title = title;
            this.isChannel = isChannel;
            this.description = description;
            this.location = location;
            this.forImport = forImport;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreatePrivateChat extends Function<Chat> {
        public static final int CONSTRUCTOR = -947758327;
        public long userId;
        public boolean force;

        public CreatePrivateChat() {
        }

        public CreatePrivateChat(long userId, boolean force) {
            this.userId = userId;
            this.force = force;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateSecretChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 1930285615;
        public int secretChatId;

        public CreateSecretChat() {
        }

        public CreateSecretChat(int secretChatId) {
            this.secretChatId = secretChatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateSupergroupChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 1187475691;
        public long supergroupId;
        public boolean force;

        public CreateSupergroupChat() {
        }

        public CreateSupergroupChat(long supergroupId, boolean force) {
            this.supergroupId = supergroupId;
            this.force = force;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateTemporaryPassword extends Function<TemporaryPasswordState> {
        public static final int CONSTRUCTOR = -1626509434;
        public String password;
        public int validFor;

        public CreateTemporaryPassword() {
        }

        public CreateTemporaryPassword(String password, int validFor) {
            this.password = password;
            this.validFor = validFor;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateVideoChat extends Function<GroupCallId> {
        public static final int CONSTRUCTOR = 2124715405;
        public long chatId;
        public String title;
        public int startDate;
        public boolean isRtmpStream;

        public CreateVideoChat() {
        }

        public CreateVideoChat(long chatId, String title, int startDate, boolean isRtmpStream) {
            this.chatId = chatId;
            this.title = title;
            this.startDate = startDate;
            this.isRtmpStream = isRtmpStream;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteAccount extends Function<Ok> {
        public static final int CONSTRUCTOR = -1203056508;
        public String reason;

        public DeleteAccount() {
        }

        public DeleteAccount(String reason) {
            this.reason = reason;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteAllCallMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -1466445325;
        public boolean revoke;

        public DeleteAllCallMessages() {
        }

        public DeleteAllCallMessages(boolean revoke) {
            this.revoke = revoke;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteAllRevokedChatInviteLinks extends Function<Ok> {
        public static final int CONSTRUCTOR = 1112020698;
        public long chatId;
        public long creatorUserId;

        public DeleteAllRevokedChatInviteLinks() {
        }

        public DeleteAllRevokedChatInviteLinks(long chatId, long creatorUserId) {
            this.chatId = chatId;
            this.creatorUserId = creatorUserId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -171253666;
        public long chatId;

        public DeleteChat() {
        }

        public DeleteChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChatFilter extends Function<Ok> {
        public static final int CONSTRUCTOR = -523220877;
        public int chatFilterId;

        public DeleteChatFilter() {
        }

        public DeleteChatFilter(int chatFilterId) {
            this.chatFilterId = chatFilterId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChatHistory extends Function<Ok> {
        public static final int CONSTRUCTOR = -1472081761;
        public long chatId;
        public boolean removeFromChatList;
        public boolean revoke;

        public DeleteChatHistory() {
        }

        public DeleteChatHistory(long chatId, boolean removeFromChatList, boolean revoke) {
            this.chatId = chatId;
            this.removeFromChatList = removeFromChatList;
            this.revoke = revoke;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChatMessagesByDate extends Function<Ok> {
        public static final int CONSTRUCTOR = -1639653185;
        public long chatId;
        public int minDate;
        public int maxDate;
        public boolean revoke;

        public DeleteChatMessagesByDate() {
        }

        public DeleteChatMessagesByDate(long chatId, int minDate, int maxDate, boolean revoke) {
            this.chatId = chatId;
            this.minDate = minDate;
            this.maxDate = maxDate;
            this.revoke = revoke;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChatMessagesBySender extends Function<Ok> {
        public static final int CONSTRUCTOR = -1164235161;
        public long chatId;
        public MessageSender senderId;

        public DeleteChatMessagesBySender() {
        }

        public DeleteChatMessagesBySender(long chatId, MessageSender senderId) {
            this.chatId = chatId;
            this.senderId = senderId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteChatReplyMarkup extends Function<Ok> {
        public static final int CONSTRUCTOR = 100637531;
        public long chatId;
        public long messageId;

        public DeleteChatReplyMarkup() {
        }

        public DeleteChatReplyMarkup(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteCommands extends Function<Ok> {
        public static final int CONSTRUCTOR = 1002732586;
        public BotCommandScope scope;
        public String languageCode;

        public DeleteCommands() {
        }

        public DeleteCommands(BotCommandScope scope, String languageCode) {
            this.scope = scope;
            this.languageCode = languageCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteFile extends Function<Ok> {
        public static final int CONSTRUCTOR = 1807653676;
        public int fileId;

        public DeleteFile() {
        }

        public DeleteFile(int fileId) {
            this.fileId = fileId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteLanguagePack extends Function<Ok> {
        public static final int CONSTRUCTOR = -2108761026;
        public String languagePackId;

        public DeleteLanguagePack() {
        }

        public DeleteLanguagePack(String languagePackId) {
            this.languagePackId = languagePackId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = 1130090173;
        public long chatId;
        public long[] messageIds;
        public boolean revoke;

        public DeleteMessages() {
        }

        public DeleteMessages(long chatId, long[] messageIds, boolean revoke) {
            this.chatId = chatId;
            this.messageIds = messageIds;
            this.revoke = revoke;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeletePassportElement extends Function<Ok> {
        public static final int CONSTRUCTOR = -1719555468;
        public PassportElementType type;

        public DeletePassportElement() {
        }

        public DeletePassportElement(PassportElementType type) {
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteProfilePhoto extends Function<Ok> {
        public static final int CONSTRUCTOR = 1319794625;
        public long profilePhotoId;

        public DeleteProfilePhoto() {
        }

        public DeleteProfilePhoto(long profilePhotoId) {
            this.profilePhotoId = profilePhotoId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteRevokedChatInviteLink extends Function<Ok> {
        public static final int CONSTRUCTOR = -1859711873;
        public long chatId;
        public String inviteLink;

        public DeleteRevokedChatInviteLink() {
        }

        public DeleteRevokedChatInviteLink(long chatId, String inviteLink) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteSavedCredentials extends Function<Ok> {

        public static final int CONSTRUCTOR = 826300114;

        public DeleteSavedCredentials() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteSavedOrderInfo extends Function<Ok> {

        public static final int CONSTRUCTOR = 1629058164;

        public DeleteSavedOrderInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Destroy extends Function<Ok> {

        public static final int CONSTRUCTOR = 685331274;

        public Destroy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DisableProxy extends Function<Ok> {

        public static final int CONSTRUCTOR = -2100095102;

        public DisableProxy() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DiscardCall extends Function<Ok> {
        public static final int CONSTRUCTOR = -1784044162;
        public int callId;
        public boolean isDisconnected;
        public int duration;
        public boolean isVideo;
        public long connectionId;

        public DiscardCall() {
        }

        public DiscardCall(int callId, boolean isDisconnected, int duration, boolean isVideo, long connectionId) {
            this.callId = callId;
            this.isDisconnected = isDisconnected;
            this.duration = duration;
            this.isVideo = isVideo;
            this.connectionId = connectionId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DisconnectAllWebsites extends Function<Ok> {

        public static final int CONSTRUCTOR = -1082985981;

        public DisconnectAllWebsites() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DisconnectWebsite extends Function<Ok> {
        public static final int CONSTRUCTOR = -778767395;
        public long websiteId;

        public DisconnectWebsite() {
        }

        public DisconnectWebsite(long websiteId) {
            this.websiteId = websiteId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DownloadFile extends Function<File> {
        public static final int CONSTRUCTOR = 1059402292;
        public int fileId;
        public int priority;
        public long offset;
        public long limit;
        public boolean synchronous;

        public DownloadFile() {
        }

        public DownloadFile(int fileId, int priority, long offset, long limit, boolean synchronous) {
            this.fileId = fileId;
            this.priority = priority;
            this.offset = offset;
            this.limit = limit;
            this.synchronous = synchronous;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditChatFilter extends Function<ChatFilterInfo> {
        public static final int CONSTRUCTOR = -1674793086;
        public int chatFilterId;
        public ChatFilter filter;

        public EditChatFilter() {
        }

        public EditChatFilter(int chatFilterId, ChatFilter filter) {
            this.chatFilterId = chatFilterId;
            this.filter = filter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditChatInviteLink extends Function<ChatInviteLink> {
        public static final int CONSTRUCTOR = 1320303996;
        public long chatId;
        public String inviteLink;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;

        public EditChatInviteLink() {
        }

        public EditChatInviteLink(long chatId, String inviteLink, String name, int expirationDate, int memberLimit, boolean createsJoinRequest) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
            this.name = name;
            this.expirationDate = expirationDate;
            this.memberLimit = memberLimit;
            this.createsJoinRequest = createsJoinRequest;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditCustomLanguagePackInfo extends Function<Ok> {
        public static final int CONSTRUCTOR = 1320751257;
        public LanguagePackInfo info;

        public EditCustomLanguagePackInfo() {
        }

        public EditCustomLanguagePackInfo(LanguagePackInfo info) {
            this.info = info;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditInlineMessageCaption extends Function<Ok> {
        public static final int CONSTRUCTOR = -760985929;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public FormattedText caption;

        public EditInlineMessageCaption() {
        }

        public EditInlineMessageCaption(String inlineMessageId, ReplyMarkup replyMarkup, FormattedText caption) {
            this.inlineMessageId = inlineMessageId;
            this.replyMarkup = replyMarkup;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditInlineMessageLiveLocation extends Function<Ok> {
        public static final int CONSTRUCTOR = -156902912;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public Location location;
        public int heading;
        public int proximityAlertRadius;

        public EditInlineMessageLiveLocation() {
        }

        public EditInlineMessageLiveLocation(String inlineMessageId, ReplyMarkup replyMarkup, Location location, int heading, int proximityAlertRadius) {
            this.inlineMessageId = inlineMessageId;
            this.replyMarkup = replyMarkup;
            this.location = location;
            this.heading = heading;
            this.proximityAlertRadius = proximityAlertRadius;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditInlineMessageMedia extends Function<Ok> {
        public static final int CONSTRUCTOR = 23553921;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public EditInlineMessageMedia() {
        }

        public EditInlineMessageMedia(String inlineMessageId, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.inlineMessageId = inlineMessageId;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditInlineMessageReplyMarkup extends Function<Ok> {
        public static final int CONSTRUCTOR = -67565858;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;

        public EditInlineMessageReplyMarkup() {
        }

        public EditInlineMessageReplyMarkup(String inlineMessageId, ReplyMarkup replyMarkup) {
            this.inlineMessageId = inlineMessageId;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditInlineMessageText extends Function<Ok> {
        public static final int CONSTRUCTOR = -855457307;
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public EditInlineMessageText() {
        }

        public EditInlineMessageText(String inlineMessageId, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.inlineMessageId = inlineMessageId;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageCaption extends Function<Message> {
        public static final int CONSTRUCTOR = 1154677038;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public FormattedText caption;

        public EditMessageCaption() {
        }

        public EditMessageCaption(long chatId, long messageId, ReplyMarkup replyMarkup, FormattedText caption) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
            this.caption = caption;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageLiveLocation extends Function<Message> {
        public static final int CONSTRUCTOR = -14047982;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public Location location;
        public int heading;
        public int proximityAlertRadius;

        public EditMessageLiveLocation() {
        }

        public EditMessageLiveLocation(long chatId, long messageId, ReplyMarkup replyMarkup, Location location, int heading, int proximityAlertRadius) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
            this.location = location;
            this.heading = heading;
            this.proximityAlertRadius = proximityAlertRadius;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageMedia extends Function<Message> {
        public static final int CONSTRUCTOR = -1152678125;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public EditMessageMedia() {
        }

        public EditMessageMedia(long chatId, long messageId, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageReplyMarkup extends Function<Message> {
        public static final int CONSTRUCTOR = 332127881;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public EditMessageReplyMarkup() {
        }

        public EditMessageReplyMarkup(long chatId, long messageId, ReplyMarkup replyMarkup) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageSchedulingState extends Function<Ok> {
        public static final int CONSTRUCTOR = -1372976192;
        public long chatId;
        public long messageId;
        public MessageSchedulingState schedulingState;

        public EditMessageSchedulingState() {
        }

        public EditMessageSchedulingState(long chatId, long messageId, MessageSchedulingState schedulingState) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.schedulingState = schedulingState;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditMessageText extends Function<Message> {
        public static final int CONSTRUCTOR = 196272567;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public EditMessageText() {
        }

        public EditMessageText(long chatId, long messageId, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EditProxy extends Function<Proxy> {
        public static final int CONSTRUCTOR = -1605883821;
        public int proxyId;
        public String server;
        public int port;
        public boolean enable;
        public ProxyType type;

        public EditProxy() {
        }

        public EditProxy(int proxyId, String server, int port, boolean enable, ProxyType type) {
            this.proxyId = proxyId;
            this.server = server;
            this.port = port;
            this.enable = enable;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EnableProxy extends Function<Ok> {
        public static final int CONSTRUCTOR = 1494450838;
        public int proxyId;

        public EnableProxy() {
        }

        public EnableProxy(int proxyId) {
            this.proxyId = proxyId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EndGroupCall extends Function<Ok> {
        public static final int CONSTRUCTOR = 573131959;
        public int groupCallId;

        public EndGroupCall() {
        }

        public EndGroupCall(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EndGroupCallRecording extends Function<Ok> {
        public static final int CONSTRUCTOR = -75799927;
        public int groupCallId;

        public EndGroupCallRecording() {
        }

        public EndGroupCallRecording(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class EndGroupCallScreenSharing extends Function<Ok> {
        public static final int CONSTRUCTOR = -2047599540;
        public int groupCallId;

        public EndGroupCallScreenSharing() {
        }

        public EndGroupCallScreenSharing(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FinishFileGeneration extends Function<Ok> {
        public static final int CONSTRUCTOR = -1055060835;
        public long generationId;
        public Error error;

        public FinishFileGeneration() {
        }

        public FinishFileGeneration(long generationId, Error error) {
            this.generationId = generationId;
            this.error = error;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ForwardMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -798726491;
        public long chatId;
        public long fromChatId;
        public long[] messageIds;
        public MessageSendOptions options;
        public boolean sendCopy;
        public boolean removeCaption;
        public boolean onlyPreview;

        public ForwardMessages() {
        }

        public ForwardMessages(long chatId, long fromChatId, long[] messageIds, MessageSendOptions options, boolean sendCopy, boolean removeCaption, boolean onlyPreview) {
            this.chatId = chatId;
            this.fromChatId = fromChatId;
            this.messageIds = messageIds;
            this.options = options;
            this.sendCopy = sendCopy;
            this.removeCaption = removeCaption;
            this.onlyPreview = onlyPreview;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAccountTtl extends Function<AccountTtl> {

        public static final int CONSTRUCTOR = -443905161;

        public GetAccountTtl() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetActiveLiveLocationMessages extends Function<Messages> {

        public static final int CONSTRUCTOR = -1425459567;

        public GetActiveLiveLocationMessages() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetActiveSessions extends Function<Sessions> {

        public static final int CONSTRUCTOR = 1119710526;

        public GetActiveSessions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAllAnimatedEmojis extends Function<Emojis> {

        public static final int CONSTRUCTOR = -771098704;

        public GetAllAnimatedEmojis() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAllPassportElements extends Function<PassportElements> {
        public static final int CONSTRUCTOR = -2038945045;
        public String password;

        public GetAllPassportElements() {
        }

        public GetAllPassportElements(String password) {
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAnimatedEmoji extends Function<AnimatedEmoji> {
        public static final int CONSTRUCTOR = 1065635702;
        public String emoji;

        public GetAnimatedEmoji() {
        }

        public GetAnimatedEmoji(String emoji) {
            this.emoji = emoji;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetApplicationConfig extends Function<JsonValue> {

        public static final int CONSTRUCTOR = -1823144318;

        public GetApplicationConfig() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetApplicationDownloadLink extends Function<HttpUrl> {

        public static final int CONSTRUCTOR = 112013252;

        public GetApplicationDownloadLink() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetArchivedStickerSets extends Function<StickerSets> {
        public static final int CONSTRUCTOR = 1996943238;
        public boolean isMasks;
        public long offsetStickerSetId;
        public int limit;

        public GetArchivedStickerSets() {
        }

        public GetArchivedStickerSets(boolean isMasks, long offsetStickerSetId, int limit) {
            this.isMasks = isMasks;
            this.offsetStickerSetId = offsetStickerSetId;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAttachedStickerSets extends Function<StickerSets> {
        public static final int CONSTRUCTOR = 1302172429;
        public int fileId;

        public GetAttachedStickerSets() {
        }

        public GetAttachedStickerSets(int fileId) {
            this.fileId = fileId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAttachmentMenuBot extends Function<AttachmentMenuBot> {
        public static final int CONSTRUCTOR = 1034248699;
        public long botUserId;

        public GetAttachmentMenuBot() {
        }

        public GetAttachmentMenuBot(long botUserId) {
            this.botUserId = botUserId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAuthorizationState extends Function<AuthorizationState> {

        public static final int CONSTRUCTOR = 1949154877;

        public GetAuthorizationState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAutoDownloadSettingsPresets extends Function<AutoDownloadSettingsPresets> {

        public static final int CONSTRUCTOR = -1721088201;

        public GetAutoDownloadSettingsPresets() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBackgroundUrl extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 733769682;
        public String name;
        public BackgroundType type;

        public GetBackgroundUrl() {
        }

        public GetBackgroundUrl(String name, BackgroundType type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBackgrounds extends Function<Backgrounds> {
        public static final int CONSTRUCTOR = 249072633;
        public boolean forDarkTheme;

        public GetBackgrounds() {
        }

        public GetBackgrounds(boolean forDarkTheme) {
            this.forDarkTheme = forDarkTheme;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBankCardInfo extends Function<BankCardInfo> {
        public static final int CONSTRUCTOR = -1310515792;
        public String bankCardNumber;

        public GetBankCardInfo() {
        }

        public GetBankCardInfo(String bankCardNumber) {
            this.bankCardNumber = bankCardNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBasicGroup extends Function<BasicGroup> {
        public static final int CONSTRUCTOR = -1635174828;
        public long basicGroupId;

        public GetBasicGroup() {
        }

        public GetBasicGroup(long basicGroupId) {
            this.basicGroupId = basicGroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBasicGroupFullInfo extends Function<BasicGroupFullInfo> {
        public static final int CONSTRUCTOR = -1822039253;
        public long basicGroupId;

        public GetBasicGroupFullInfo() {
        }

        public GetBasicGroupFullInfo(long basicGroupId) {
            this.basicGroupId = basicGroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBlockedMessageSenders extends Function<MessageSenders> {
        public static final int CONSTRUCTOR = 1947079776;
        public int offset;
        public int limit;

        public GetBlockedMessageSenders() {
        }

        public GetBlockedMessageSenders(int offset, int limit) {
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCallbackQueryAnswer extends Function<CallbackQueryAnswer> {
        public static final int CONSTRUCTOR = 116357727;
        public long chatId;
        public long messageId;
        public CallbackQueryPayload payload;

        public GetCallbackQueryAnswer() {
        }

        public GetCallbackQueryAnswer(long chatId, long messageId, CallbackQueryPayload payload) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCallbackQueryMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -1121939086;
        public long chatId;
        public long messageId;
        public long callbackQueryId;

        public GetCallbackQueryMessage() {
        }

        public GetCallbackQueryMessage(long chatId, long messageId, long callbackQueryId) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.callbackQueryId = callbackQueryId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 1866601536;
        public long chatId;

        public GetChat() {
        }

        public GetChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatAdministrators extends Function<ChatAdministrators> {
        public static final int CONSTRUCTOR = 1544468155;
        public long chatId;

        public GetChatAdministrators() {
        }

        public GetChatAdministrators(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatAvailableMessageSenders extends Function<MessageSenders> {
        public static final int CONSTRUCTOR = -1541571496;
        public long chatId;

        public GetChatAvailableMessageSenders() {
        }

        public GetChatAvailableMessageSenders(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatEventLog extends Function<ChatEvents> {
        public static final int CONSTRUCTOR = -1281344669;
        public long chatId;
        public String query;
        public long fromEventId;
        public int limit;
        public ChatEventLogFilters filters;
        public long[] userIds;

        public GetChatEventLog() {
        }

        public GetChatEventLog(long chatId, String query, long fromEventId, int limit, ChatEventLogFilters filters, long[] userIds) {
            this.chatId = chatId;
            this.query = query;
            this.fromEventId = fromEventId;
            this.limit = limit;
            this.filters = filters;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatFilter extends Function<ChatFilter> {
        public static final int CONSTRUCTOR = 1826317803;
        public int chatFilterId;

        public GetChatFilter() {
        }

        public GetChatFilter(int chatFilterId) {
            this.chatFilterId = chatFilterId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatFilterDefaultIconName extends Function<Text> {
        public static final int CONSTRUCTOR = -1339828680;
        public ChatFilter filter;

        public GetChatFilterDefaultIconName() {
        }

        public GetChatFilterDefaultIconName(ChatFilter filter) {
            this.filter = filter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatHistory extends Function<Messages> {
        public static final int CONSTRUCTOR = -799960451;
        public long chatId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public boolean onlyLocal;

        public GetChatHistory() {
        }

        public GetChatHistory(long chatId, long fromMessageId, int offset, int limit, boolean onlyLocal) {
            this.chatId = chatId;
            this.fromMessageId = fromMessageId;
            this.offset = offset;
            this.limit = limit;
            this.onlyLocal = onlyLocal;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatInviteLink extends Function<ChatInviteLink> {
        public static final int CONSTRUCTOR = -479575555;
        public long chatId;
        public String inviteLink;

        public GetChatInviteLink() {
        }

        public GetChatInviteLink(long chatId, String inviteLink) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatInviteLinkCounts extends Function<ChatInviteLinkCounts> {
        public static final int CONSTRUCTOR = 890299025;
        public long chatId;

        public GetChatInviteLinkCounts() {
        }

        public GetChatInviteLinkCounts(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatInviteLinkMembers extends Function<ChatInviteLinkMembers> {
        public static final int CONSTRUCTOR = -977921638;
        public long chatId;
        public String inviteLink;
        public ChatInviteLinkMember offsetMember;
        public int limit;

        public GetChatInviteLinkMembers() {
        }

        public GetChatInviteLinkMembers(long chatId, String inviteLink, ChatInviteLinkMember offsetMember, int limit) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
            this.offsetMember = offsetMember;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatInviteLinks extends Function<ChatInviteLinks> {
        public static final int CONSTRUCTOR = 883252396;
        public long chatId;
        public long creatorUserId;
        public boolean isRevoked;
        public int offsetDate;
        public String offsetInviteLink;
        public int limit;

        public GetChatInviteLinks() {
        }

        public GetChatInviteLinks(long chatId, long creatorUserId, boolean isRevoked, int offsetDate, String offsetInviteLink, int limit) {
            this.chatId = chatId;
            this.creatorUserId = creatorUserId;
            this.isRevoked = isRevoked;
            this.offsetDate = offsetDate;
            this.offsetInviteLink = offsetInviteLink;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatJoinRequests extends Function<ChatJoinRequests> {
        public static final int CONSTRUCTOR = -388428126;
        public long chatId;
        public String inviteLink;
        public String query;
        public ChatJoinRequest offsetRequest;
        public int limit;

        public GetChatJoinRequests() {
        }

        public GetChatJoinRequests(long chatId, String inviteLink, String query, ChatJoinRequest offsetRequest, int limit) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
            this.query = query;
            this.offsetRequest = offsetRequest;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatListsToAddChat extends Function<ChatLists> {
        public static final int CONSTRUCTOR = 654956193;
        public long chatId;

        public GetChatListsToAddChat() {
        }

        public GetChatListsToAddChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatMember extends Function<ChatMember> {
        public static final int CONSTRUCTOR = -792636814;
        public long chatId;
        public MessageSender memberId;

        public GetChatMember() {
        }

        public GetChatMember(long chatId, MessageSender memberId) {
            this.chatId = chatId;
            this.memberId = memberId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatMessageByDate extends Function<Message> {
        public static final int CONSTRUCTOR = 1062564150;
        public long chatId;
        public int date;

        public GetChatMessageByDate() {
        }

        public GetChatMessageByDate(long chatId, int date) {
            this.chatId = chatId;
            this.date = date;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatMessageCalendar extends Function<MessageCalendar> {
        public static final int CONSTRUCTOR = -326164204;
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;

        public GetChatMessageCalendar() {
        }

        public GetChatMessageCalendar(long chatId, SearchMessagesFilter filter, long fromMessageId) {
            this.chatId = chatId;
            this.filter = filter;
            this.fromMessageId = fromMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatMessageCount extends Function<Count> {
        public static final int CONSTRUCTOR = 205435308;
        public long chatId;
        public SearchMessagesFilter filter;
        public boolean returnLocal;

        public GetChatMessageCount() {
        }

        public GetChatMessageCount(long chatId, SearchMessagesFilter filter, boolean returnLocal) {
            this.chatId = chatId;
            this.filter = filter;
            this.returnLocal = returnLocal;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatNotificationSettingsExceptions extends Function<Chats> {
        public static final int CONSTRUCTOR = 201199121;
        public NotificationSettingsScope scope;
        public boolean compareSound;

        public GetChatNotificationSettingsExceptions() {
        }

        public GetChatNotificationSettingsExceptions(NotificationSettingsScope scope, boolean compareSound) {
            this.scope = scope;
            this.compareSound = compareSound;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatPinnedMessage extends Function<Message> {
        public static final int CONSTRUCTOR = 359865008;
        public long chatId;

        public GetChatPinnedMessage() {
        }

        public GetChatPinnedMessage(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatScheduledMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -549638149;
        public long chatId;

        public GetChatScheduledMessages() {
        }

        public GetChatScheduledMessages(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatSparseMessagePositions extends Function<MessagePositions> {
        public static final int CONSTRUCTOR = -462227580;
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;
        public int limit;

        public GetChatSparseMessagePositions() {
        }

        public GetChatSparseMessagePositions(long chatId, SearchMessagesFilter filter, long fromMessageId, int limit) {
            this.chatId = chatId;
            this.filter = filter;
            this.fromMessageId = fromMessageId;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatSponsoredMessage extends Function<SponsoredMessage> {
        public static final int CONSTRUCTOR = 7520523;
        public long chatId;

        public GetChatSponsoredMessage() {
        }

        public GetChatSponsoredMessage(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChatStatistics extends Function<ChatStatistics> {
        public static final int CONSTRUCTOR = 327057816;
        public long chatId;
        public boolean isDark;

        public GetChatStatistics() {
        }

        public GetChatStatistics(long chatId, boolean isDark) {
            this.chatId = chatId;
            this.isDark = isDark;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetChats extends Function<Chats> {
        public static final int CONSTRUCTOR = -972768574;
        public ChatList chatList;
        public int limit;

        public GetChats() {
        }

        public GetChats(ChatList chatList, int limit) {
            this.chatList = chatList;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCommands extends Function<BotCommands> {
        public static final int CONSTRUCTOR = 1488621559;
        public BotCommandScope scope;
        public String languageCode;

        public GetCommands() {
        }

        public GetCommands(BotCommandScope scope, String languageCode) {
            this.scope = scope;
            this.languageCode = languageCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetConnectedWebsites extends Function<ConnectedWebsites> {

        public static final int CONSTRUCTOR = -170536110;

        public GetConnectedWebsites() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetContacts extends Function<Users> {

        public static final int CONSTRUCTOR = -1417722768;

        public GetContacts() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCountries extends Function<Countries> {

        public static final int CONSTRUCTOR = -51902050;

        public GetCountries() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCountryCode extends Function<Text> {

        public static final int CONSTRUCTOR = 1540593906;

        public GetCountryCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCreatedPublicChats extends Function<Chats> {
        public static final int CONSTRUCTOR = 710354415;
        public PublicChatType type;

        public GetCreatedPublicChats() {
        }

        public GetCreatedPublicChats(PublicChatType type) {
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetCurrentState extends Function<Updates> {

        public static final int CONSTRUCTOR = -1191417719;

        public GetCurrentState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetDatabaseStatistics extends Function<DatabaseStatistics> {

        public static final int CONSTRUCTOR = -1942760263;

        public GetDatabaseStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetDeepLinkInfo extends Function<DeepLinkInfo> {
        public static final int CONSTRUCTOR = 680673150;
        public String link;

        public GetDeepLinkInfo() {
        }

        public GetDeepLinkInfo(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetEmojiSuggestionsUrl extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = -1404101841;
        public String languageCode;

        public GetEmojiSuggestionsUrl() {
        }

        public GetEmojiSuggestionsUrl(String languageCode) {
            this.languageCode = languageCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetExternalLink extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 1586688235;
        public String link;
        public boolean allowWriteAccess;

        public GetExternalLink() {
        }

        public GetExternalLink(String link, boolean allowWriteAccess) {
            this.link = link;
            this.allowWriteAccess = allowWriteAccess;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetExternalLinkInfo extends Function<LoginUrlInfo> {
        public static final int CONSTRUCTOR = 1175288383;
        public String link;

        public GetExternalLinkInfo() {
        }

        public GetExternalLinkInfo(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFavoriteStickers extends Function<Stickers> {

        public static final int CONSTRUCTOR = -338964672;

        public GetFavoriteStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFile extends Function<File> {
        public static final int CONSTRUCTOR = 1553923406;
        public int fileId;

        public GetFile() {
        }

        public GetFile(int fileId) {
            this.fileId = fileId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFileDownloadedPrefixSize extends Function<FileDownloadedPrefixSize> {
        public static final int CONSTRUCTOR = 855948589;
        public int fileId;
        public long offset;

        public GetFileDownloadedPrefixSize() {
        }

        public GetFileDownloadedPrefixSize(int fileId, long offset) {
            this.fileId = fileId;
            this.offset = offset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFileExtension extends Function<Text> {
        public static final int CONSTRUCTOR = -106055372;
        public String mimeType;

        public GetFileExtension() {
        }

        public GetFileExtension(String mimeType) {
            this.mimeType = mimeType;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetFileMimeType extends Function<Text> {
        public static final int CONSTRUCTOR = -2073879671;
        public String fileName;

        public GetFileMimeType() {
        }

        public GetFileMimeType(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGameHighScores extends Function<GameHighScores> {
        public static final int CONSTRUCTOR = 15746459;
        public long chatId;
        public long messageId;
        public long userId;

        public GetGameHighScores() {
        }

        public GetGameHighScores(long chatId, long messageId, long userId) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGroupCall extends Function<GroupCall> {
        public static final int CONSTRUCTOR = 1468491406;
        public int groupCallId;

        public GetGroupCall() {
        }

        public GetGroupCall(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGroupCallInviteLink extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 719407396;
        public int groupCallId;
        public boolean canSelfUnmute;

        public GetGroupCallInviteLink() {
        }

        public GetGroupCallInviteLink(int groupCallId, boolean canSelfUnmute) {
            this.groupCallId = groupCallId;
            this.canSelfUnmute = canSelfUnmute;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGroupCallStreamSegment extends Function<FilePart> {
        public static final int CONSTRUCTOR = -2077959515;
        public int groupCallId;
        public long timeOffset;
        public int scale;
        public int channelId;
        public GroupCallVideoQuality videoQuality;

        public GetGroupCallStreamSegment() {
        }

        public GetGroupCallStreamSegment(int groupCallId, long timeOffset, int scale, int channelId, GroupCallVideoQuality videoQuality) {
            this.groupCallId = groupCallId;
            this.timeOffset = timeOffset;
            this.scale = scale;
            this.channelId = channelId;
            this.videoQuality = videoQuality;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGroupCallStreams extends Function<GroupCallStreams> {
        public static final int CONSTRUCTOR = -1619226268;
        public int groupCallId;

        public GetGroupCallStreams() {
        }

        public GetGroupCallStreams(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetGroupsInCommon extends Function<Chats> {
        public static final int CONSTRUCTOR = 381539178;
        public long userId;
        public long offsetChatId;
        public int limit;

        public GetGroupsInCommon() {
        }

        public GetGroupsInCommon(long userId, long offsetChatId, int limit) {
            this.userId = userId;
            this.offsetChatId = offsetChatId;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetImportedContactCount extends Function<Count> {

        public static final int CONSTRUCTOR = -656336346;

        public GetImportedContactCount() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInactiveSupergroupChats extends Function<Chats> {

        public static final int CONSTRUCTOR = -657720907;

        public GetInactiveSupergroupChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInlineGameHighScores extends Function<GameHighScores> {
        public static final int CONSTRUCTOR = -533107798;
        public String inlineMessageId;
        public long userId;

        public GetInlineGameHighScores() {
        }

        public GetInlineGameHighScores(String inlineMessageId, long userId) {
            this.inlineMessageId = inlineMessageId;
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInlineQueryResults extends Function<InlineQueryResults> {
        public static final int CONSTRUCTOR = 2044524652;
        public long botUserId;
        public long chatId;
        public Location userLocation;
        public String query;
        public String offset;

        public GetInlineQueryResults() {
        }

        public GetInlineQueryResults(long botUserId, long chatId, Location userLocation, String query, String offset) {
            this.botUserId = botUserId;
            this.chatId = chatId;
            this.userLocation = userLocation;
            this.query = query;
            this.offset = offset;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInstalledStickerSets extends Function<StickerSets> {
        public static final int CONSTRUCTOR = 1214523749;
        public boolean isMasks;

        public GetInstalledStickerSets() {
        }

        public GetInstalledStickerSets(boolean isMasks) {
            this.isMasks = isMasks;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetInternalLinkType extends Function<InternalLinkType> {
        public static final int CONSTRUCTOR = -1948428535;
        public String link;

        public GetInternalLinkType() {
        }

        public GetInternalLinkType(String link) {
            this.link = link;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetJsonString extends Function<Text> {
        public static final int CONSTRUCTOR = 663458849;
        public JsonValue jsonValue;

        public GetJsonString() {
        }

        public GetJsonString(JsonValue jsonValue) {
            this.jsonValue = jsonValue;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetJsonValue extends Function<JsonValue> {
        public static final int CONSTRUCTOR = -1829086715;
        public String json;

        public GetJsonValue() {
        }

        public GetJsonValue(String json) {
            this.json = json;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLanguagePackInfo extends Function<LanguagePackInfo> {
        public static final int CONSTRUCTOR = 2077809320;
        public String languagePackId;

        public GetLanguagePackInfo() {
        }

        public GetLanguagePackInfo(String languagePackId) {
            this.languagePackId = languagePackId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLanguagePackString extends Function<LanguagePackStringValue> {
        public static final int CONSTRUCTOR = 150789747;
        public String languagePackDatabasePath;
        public String localizationTarget;
        public String languagePackId;
        public String key;

        public GetLanguagePackString() {
        }

        public GetLanguagePackString(String languagePackDatabasePath, String localizationTarget, String languagePackId, String key) {
            this.languagePackDatabasePath = languagePackDatabasePath;
            this.localizationTarget = localizationTarget;
            this.languagePackId = languagePackId;
            this.key = key;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLanguagePackStrings extends Function<LanguagePackStrings> {
        public static final int CONSTRUCTOR = 1246259088;
        public String languagePackId;
        public String[] keys;

        public GetLanguagePackStrings() {
        }

        public GetLanguagePackStrings(String languagePackId, String[] keys) {
            this.languagePackId = languagePackId;
            this.keys = keys;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLocalizationTargetInfo extends Function<LocalizationTargetInfo> {
        public static final int CONSTRUCTOR = 1849499526;
        public boolean onlyLocal;

        public GetLocalizationTargetInfo() {
        }

        public GetLocalizationTargetInfo(boolean onlyLocal) {
            this.onlyLocal = onlyLocal;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogStream extends Function<LogStream> {

        public static final int CONSTRUCTOR = 1167608667;

        public GetLogStream() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogTagVerbosityLevel extends Function<LogVerbosityLevel> {
        public static final int CONSTRUCTOR = 951004547;
        public String tag;

        public GetLogTagVerbosityLevel() {
        }

        public GetLogTagVerbosityLevel(String tag) {
            this.tag = tag;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogTags extends Function<LogTags> {

        public static final int CONSTRUCTOR = -254449190;

        public GetLogTags() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogVerbosityLevel extends Function<LogVerbosityLevel> {

        public static final int CONSTRUCTOR = 594057956;

        public GetLogVerbosityLevel() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLoginUrl extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 791844305;
        public long chatId;
        public long messageId;
        public long buttonId;
        public boolean allowWriteAccess;

        public GetLoginUrl() {
        }

        public GetLoginUrl(long chatId, long messageId, long buttonId, boolean allowWriteAccess) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.buttonId = buttonId;
            this.allowWriteAccess = allowWriteAccess;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLoginUrlInfo extends Function<LoginUrlInfo> {
        public static final int CONSTRUCTOR = -859202125;
        public long chatId;
        public long messageId;
        public long buttonId;

        public GetLoginUrlInfo() {
        }

        public GetLoginUrlInfo(long chatId, long messageId, long buttonId) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.buttonId = buttonId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMapThumbnailFile extends Function<File> {
        public static final int CONSTRUCTOR = -152660070;
        public Location location;
        public int zoom;
        public int width;
        public int height;
        public int scale;
        public long chatId;

        public GetMapThumbnailFile() {
        }

        public GetMapThumbnailFile(Location location, int zoom, int width, int height, int scale, long chatId) {
            this.location = location;
            this.zoom = zoom;
            this.width = width;
            this.height = height;
            this.scale = scale;
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMarkdownText extends Function<FormattedText> {
        public static final int CONSTRUCTOR = 164524584;
        public FormattedText text;

        public GetMarkdownText() {
        }

        public GetMarkdownText(FormattedText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMe extends Function<User> {

        public static final int CONSTRUCTOR = -191516033;

        public GetMe() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMenuButton extends Function<BotMenuButton> {
        public static final int CONSTRUCTOR = -437324736;
        public long userId;

        public GetMenuButton() {
        }

        public GetMenuButton(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -1821196160;
        public long chatId;
        public long messageId;

        public GetMessage() {
        }

        public GetMessage(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageAddedReactions extends Function<AddedReactions> {
        public static final int CONSTRUCTOR = -1430014415;
        public long chatId;
        public long messageId;
        public String reaction;
        public String offset;
        public int limit;

        public GetMessageAddedReactions() {
        }

        public GetMessageAddedReactions(long chatId, long messageId, String reaction, String offset, int limit) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.reaction = reaction;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageAvailableReactions extends Function<AvailableReactions> {
        public static final int CONSTRUCTOR = 205497679;
        public long chatId;
        public long messageId;

        public GetMessageAvailableReactions() {
        }

        public GetMessageAvailableReactions(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageEmbeddingCode extends Function<Text> {
        public static final int CONSTRUCTOR = 1654967561;
        public long chatId;
        public long messageId;
        public boolean forAlbum;

        public GetMessageEmbeddingCode() {
        }

        public GetMessageEmbeddingCode(long chatId, long messageId, boolean forAlbum) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.forAlbum = forAlbum;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageFileType extends Function<MessageFileType> {
        public static final int CONSTRUCTOR = -490270764;
        public String messageFileHead;

        public GetMessageFileType() {
        }

        public GetMessageFileType(String messageFileHead) {
            this.messageFileHead = messageFileHead;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageImportConfirmationText extends Function<Text> {
        public static final int CONSTRUCTOR = 390627752;
        public long chatId;

        public GetMessageImportConfirmationText() {
        }

        public GetMessageImportConfirmationText(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageLink extends Function<MessageLink> {
        public static final int CONSTRUCTOR = -1607389329;
        public long chatId;
        public long messageId;
        public int mediaTimestamp;
        public boolean forAlbum;
        public boolean forComment;

        public GetMessageLink() {
        }

        public GetMessageLink(long chatId, long messageId, int mediaTimestamp, boolean forAlbum, boolean forComment) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.mediaTimestamp = mediaTimestamp;
            this.forAlbum = forAlbum;
            this.forComment = forComment;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageLinkInfo extends Function<MessageLinkInfo> {
        public static final int CONSTRUCTOR = -700533672;
        public String url;

        public GetMessageLinkInfo() {
        }

        public GetMessageLinkInfo(String url) {
            this.url = url;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageLocally extends Function<Message> {
        public static final int CONSTRUCTOR = -603575444;
        public long chatId;
        public long messageId;

        public GetMessageLocally() {
        }

        public GetMessageLocally(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessagePublicForwards extends Function<FoundMessages> {
        public static final int CONSTRUCTOR = 1611049289;
        public long chatId;
        public long messageId;
        public String offset;
        public int limit;

        public GetMessagePublicForwards() {
        }

        public GetMessagePublicForwards(long chatId, long messageId, String offset, int limit) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageStatistics extends Function<MessageStatistics> {
        public static final int CONSTRUCTOR = 1270194648;
        public long chatId;
        public long messageId;
        public boolean isDark;

        public GetMessageStatistics() {
        }

        public GetMessageStatistics(long chatId, long messageId, boolean isDark) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.isDark = isDark;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageThread extends Function<MessageThreadInfo> {
        public static final int CONSTRUCTOR = 2062695998;
        public long chatId;
        public long messageId;

        public GetMessageThread() {
        }

        public GetMessageThread(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageThreadHistory extends Function<Messages> {
        public static final int CONSTRUCTOR = -1808411608;
        public long chatId;
        public long messageId;
        public long fromMessageId;
        public int offset;
        public int limit;

        public GetMessageThreadHistory() {
        }

        public GetMessageThreadHistory(long chatId, long messageId, long fromMessageId, int offset, int limit) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.fromMessageId = fromMessageId;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessageViewers extends Function<Users> {
        public static final int CONSTRUCTOR = -1879496099;
        public long chatId;
        public long messageId;

        public GetMessageViewers() {
        }

        public GetMessageViewers(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = 425299338;
        public long chatId;
        public long[] messageIds;

        public GetMessages() {
        }

        public GetMessages(long chatId, long[] messageIds) {
            this.chatId = chatId;
            this.messageIds = messageIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetNetworkStatistics extends Function<NetworkStatistics> {
        public static final int CONSTRUCTOR = -986228706;
        public boolean onlyCurrent;

        public GetNetworkStatistics() {
        }

        public GetNetworkStatistics(boolean onlyCurrent) {
            this.onlyCurrent = onlyCurrent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetOption extends Function<OptionValue> {
        public static final int CONSTRUCTOR = -1572495746;
        public String name;

        public GetOption() {
        }

        public GetOption(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPassportAuthorizationForm extends Function<PassportAuthorizationForm> {
        public static final int CONSTRUCTOR = 1636107398;
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;

        public GetPassportAuthorizationForm() {
        }

        public GetPassportAuthorizationForm(long botUserId, String scope, String publicKey, String nonce) {
            this.botUserId = botUserId;
            this.scope = scope;
            this.publicKey = publicKey;
            this.nonce = nonce;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPassportAuthorizationFormAvailableElements extends Function<PassportElementsWithErrors> {
        public static final int CONSTRUCTOR = 1738134754;
        public int autorizationFormId;
        public String password;

        public GetPassportAuthorizationFormAvailableElements() {
        }

        public GetPassportAuthorizationFormAvailableElements(int autorizationFormId, String password) {
            this.autorizationFormId = autorizationFormId;
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPassportElement extends Function<PassportElement> {
        public static final int CONSTRUCTOR = -1882398342;
        public PassportElementType type;
        public String password;

        public GetPassportElement() {
        }

        public GetPassportElement(PassportElementType type, String password) {
            this.type = type;
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPasswordState extends Function<PasswordState> {

        public static final int CONSTRUCTOR = -174752904;

        public GetPasswordState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPaymentForm extends Function<PaymentForm> {
        public static final int CONSTRUCTOR = -1924172076;
        public InputInvoice inputInvoice;
        public ThemeParameters theme;

        public GetPaymentForm() {
        }

        public GetPaymentForm(InputInvoice inputInvoice, ThemeParameters theme) {
            this.inputInvoice = inputInvoice;
            this.theme = theme;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPaymentReceipt extends Function<PaymentReceipt> {
        public static final int CONSTRUCTOR = 1013758294;
        public long chatId;
        public long messageId;

        public GetPaymentReceipt() {
        }

        public GetPaymentReceipt(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPhoneNumberInfo extends Function<PhoneNumberInfo> {
        public static final int CONSTRUCTOR = -1608344583;
        public String phoneNumberPrefix;

        public GetPhoneNumberInfo() {
        }

        public GetPhoneNumberInfo(String phoneNumberPrefix) {
            this.phoneNumberPrefix = phoneNumberPrefix;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPhoneNumberInfoSync extends Function<PhoneNumberInfo> {
        public static final int CONSTRUCTOR = 547061048;
        public String languageCode;
        public String phoneNumberPrefix;

        public GetPhoneNumberInfoSync() {
        }

        public GetPhoneNumberInfoSync(String languageCode, String phoneNumberPrefix) {
            this.languageCode = languageCode;
            this.phoneNumberPrefix = phoneNumberPrefix;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPollVoters extends Function<Users> {
        public static final int CONSTRUCTOR = 2075288734;
        public long chatId;
        public long messageId;
        public int optionId;
        public int offset;
        public int limit;

        public GetPollVoters() {
        }

        public GetPollVoters(long chatId, long messageId, int optionId, int offset, int limit) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.optionId = optionId;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPreferredCountryLanguage extends Function<Text> {
        public static final int CONSTRUCTOR = -933049386;
        public String countryCode;

        public GetPreferredCountryLanguage() {
        }

        public GetPreferredCountryLanguage(String countryCode) {
            this.countryCode = countryCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPremiumFeatures extends Function<PremiumFeatures> {
        public static final int CONSTRUCTOR = -1260640695;
        public PremiumSource source;

        public GetPremiumFeatures() {
        }

        public GetPremiumFeatures(PremiumSource source) {
            this.source = source;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPremiumLimit extends Function<PremiumLimit> {
        public static final int CONSTRUCTOR = 1075313898;
        public PremiumLimitType limitType;

        public GetPremiumLimit() {
        }

        public GetPremiumLimit(PremiumLimitType limitType) {
            this.limitType = limitType;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPremiumState extends Function<PremiumState> {

        public static final int CONSTRUCTOR = 663632610;

        public GetPremiumState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPremiumStickers extends Function<Stickers> {

        public static final int CONSTRUCTOR = 144882082;

        public GetPremiumStickers() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetProxies extends Function<Proxies> {

        public static final int CONSTRUCTOR = -95026381;

        public GetProxies() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetProxyLink extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = -1054495112;
        public int proxyId;

        public GetProxyLink() {
        }

        public GetProxyLink(int proxyId) {
            this.proxyId = proxyId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetPushReceiverId extends Function<PushReceiverId> {
        public static final int CONSTRUCTOR = -286505294;
        public String payload;

        public GetPushReceiverId() {
        }

        public GetPushReceiverId(String payload) {
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecentInlineBots extends Function<Users> {

        public static final int CONSTRUCTOR = 1437823548;

        public GetRecentInlineBots() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecentStickers extends Function<Stickers> {
        public static final int CONSTRUCTOR = -579622241;
        public boolean isAttached;

        public GetRecentStickers() {
        }

        public GetRecentStickers(boolean isAttached) {
            this.isAttached = isAttached;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecentlyOpenedChats extends Function<Chats> {
        public static final int CONSTRUCTOR = -1924156893;
        public int limit;

        public GetRecentlyOpenedChats() {
        }

        public GetRecentlyOpenedChats(int limit) {
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecentlyVisitedTMeUrls extends Function<TMeUrls> {
        public static final int CONSTRUCTOR = 806754961;
        public String referrer;

        public GetRecentlyVisitedTMeUrls() {
        }

        public GetRecentlyVisitedTMeUrls(String referrer) {
            this.referrer = referrer;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecommendedChatFilters extends Function<RecommendedChatFilters> {

        public static final int CONSTRUCTOR = -779390746;

        public GetRecommendedChatFilters() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRecoveryEmailAddress extends Function<RecoveryEmailAddress> {
        public static final int CONSTRUCTOR = -1594770947;
        public String password;

        public GetRecoveryEmailAddress() {
        }

        public GetRecoveryEmailAddress(String password) {
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRemoteFile extends Function<File> {
        public static final int CONSTRUCTOR = 2137204530;
        public String remoteFileId;
        public FileType fileType;

        public GetRemoteFile() {
        }

        public GetRemoteFile(String remoteFileId, FileType fileType) {
            this.remoteFileId = remoteFileId;
            this.fileType = fileType;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetRepliedMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -641918531;
        public long chatId;
        public long messageId;

        public GetRepliedMessage() {
        }

        public GetRepliedMessage(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSavedAnimations extends Function<Animations> {

        public static final int CONSTRUCTOR = 7051032;

        public GetSavedAnimations() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSavedNotificationSound extends Function<NotificationSounds> {
        public static final int CONSTRUCTOR = 459569431;
        public long notificationSoundId;

        public GetSavedNotificationSound() {
        }

        public GetSavedNotificationSound(long notificationSoundId) {
            this.notificationSoundId = notificationSoundId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSavedNotificationSounds extends Function<NotificationSounds> {

        public static final int CONSTRUCTOR = -1070305368;

        public GetSavedNotificationSounds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSavedOrderInfo extends Function<OrderInfo> {

        public static final int CONSTRUCTOR = -1152016675;

        public GetSavedOrderInfo() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetScopeNotificationSettings extends Function<ScopeNotificationSettings> {
        public static final int CONSTRUCTOR = -995613361;
        public NotificationSettingsScope scope;

        public GetScopeNotificationSettings() {
        }

        public GetScopeNotificationSettings(NotificationSettingsScope scope) {
            this.scope = scope;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSecretChat extends Function<SecretChat> {
        public static final int CONSTRUCTOR = 40599169;
        public int secretChatId;

        public GetSecretChat() {
        }

        public GetSecretChat(int secretChatId) {
            this.secretChatId = secretChatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStatisticalGraph extends Function<StatisticalGraph> {
        public static final int CONSTRUCTOR = 1100975515;
        public long chatId;
        public String token;
        public long x;

        public GetStatisticalGraph() {
        }

        public GetStatisticalGraph(long chatId, String token, long x) {
            this.chatId = chatId;
            this.token = token;
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStickerEmojis extends Function<Emojis> {
        public static final int CONSTRUCTOR = -1895508665;
        public InputFile sticker;

        public GetStickerEmojis() {
        }

        public GetStickerEmojis(InputFile sticker) {
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStickerSet extends Function<StickerSet> {
        public static final int CONSTRUCTOR = 1052318659;
        public long setId;

        public GetStickerSet() {
        }

        public GetStickerSet(long setId) {
            this.setId = setId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStickers extends Function<Stickers> {
        public static final int CONSTRUCTOR = -1594919556;
        public String emoji;
        public int limit;

        public GetStickers() {
        }

        public GetStickers(String emoji, int limit) {
            this.emoji = emoji;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStorageStatistics extends Function<StorageStatistics> {
        public static final int CONSTRUCTOR = -853193929;
        public int chatLimit;

        public GetStorageStatistics() {
        }

        public GetStorageStatistics(int chatLimit) {
            this.chatLimit = chatLimit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetStorageStatisticsFast extends Function<StorageStatisticsFast> {

        public static final int CONSTRUCTOR = 61368066;

        public GetStorageStatisticsFast() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSuggestedFileName extends Function<Text> {
        public static final int CONSTRUCTOR = -2049399674;
        public int fileId;
        public String directory;

        public GetSuggestedFileName() {
        }

        public GetSuggestedFileName(int fileId, String directory) {
            this.fileId = fileId;
            this.directory = directory;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSuggestedStickerSetName extends Function<Text> {
        public static final int CONSTRUCTOR = -1340995520;
        public String title;

        public GetSuggestedStickerSetName() {
        }

        public GetSuggestedStickerSetName(String title) {
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSuitableDiscussionChats extends Function<Chats> {

        public static final int CONSTRUCTOR = 49044982;

        public GetSuitableDiscussionChats() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSupergroup extends Function<Supergroup> {
        public static final int CONSTRUCTOR = 989663458;
        public long supergroupId;

        public GetSupergroup() {
        }

        public GetSupergroup(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSupergroupFullInfo extends Function<SupergroupFullInfo> {
        public static final int CONSTRUCTOR = 1099776056;
        public long supergroupId;

        public GetSupergroupFullInfo() {
        }

        public GetSupergroupFullInfo(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSupergroupMembers extends Function<ChatMembers> {
        public static final int CONSTRUCTOR = -570940984;
        public long supergroupId;
        public SupergroupMembersFilter filter;
        public int offset;
        public int limit;

        public GetSupergroupMembers() {
        }

        public GetSupergroupMembers(long supergroupId, SupergroupMembersFilter filter, int offset, int limit) {
            this.supergroupId = supergroupId;
            this.filter = filter;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetSupportUser extends Function<User> {

        public static final int CONSTRUCTOR = -1733497700;

        public GetSupportUser() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTemporaryPasswordState extends Function<TemporaryPasswordState> {

        public static final int CONSTRUCTOR = -12670830;

        public GetTemporaryPasswordState() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTextEntities extends Function<TextEntities> {
        public static final int CONSTRUCTOR = -341490693;
        public String text;

        public GetTextEntities() {
        }

        public GetTextEntities(String text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetThemeParametersJsonString extends Function<Text> {
        public static final int CONSTRUCTOR = -1850145288;
        public ThemeParameters theme;

        public GetThemeParametersJsonString() {
        }

        public GetThemeParametersJsonString(ThemeParameters theme) {
            this.theme = theme;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTopChats extends Function<Chats> {
        public static final int CONSTRUCTOR = -388410847;
        public TopChatCategory category;
        public int limit;

        public GetTopChats() {
        }

        public GetTopChats(TopChatCategory category, int limit) {
            this.category = category;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetTrendingStickerSets extends Function<TrendingStickerSets> {
        public static final int CONSTRUCTOR = 1916355369;
        public int offset;
        public int limit;

        public GetTrendingStickerSets() {
        }

        public GetTrendingStickerSets(int offset, int limit) {
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetUser extends Function<User> {
        public static final int CONSTRUCTOR = 1117363211;
        public long userId;

        public GetUser() {
        }

        public GetUser(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetUserFullInfo extends Function<UserFullInfo> {
        public static final int CONSTRUCTOR = -776823720;
        public long userId;

        public GetUserFullInfo() {
        }

        public GetUserFullInfo(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetUserPrivacySettingRules extends Function<UserPrivacySettingRules> {
        public static final int CONSTRUCTOR = -2077223311;
        public UserPrivacySetting setting;

        public GetUserPrivacySettingRules() {
        }

        public GetUserPrivacySettingRules(UserPrivacySetting setting) {
            this.setting = setting;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetUserProfilePhotos extends Function<ChatPhotos> {
        public static final int CONSTRUCTOR = -908132798;
        public long userId;
        public int offset;
        public int limit;

        public GetUserProfilePhotos() {
        }

        public GetUserProfilePhotos(long userId, int offset, int limit) {
            this.userId = userId;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetVideoChatAvailableParticipants extends Function<MessageSenders> {
        public static final int CONSTRUCTOR = -1000496379;
        public long chatId;

        public GetVideoChatAvailableParticipants() {
        }

        public GetVideoChatAvailableParticipants(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetVideoChatRtmpUrl extends Function<RtmpUrl> {
        public static final int CONSTRUCTOR = 1210784543;
        public long chatId;

        public GetVideoChatRtmpUrl() {
        }

        public GetVideoChatRtmpUrl(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetWebAppUrl extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 1600690867;
        public long botUserId;
        public String url;
        public ThemeParameters theme;

        public GetWebAppUrl() {
        }

        public GetWebAppUrl(long botUserId, String url, ThemeParameters theme) {
            this.botUserId = botUserId;
            this.url = url;
            this.theme = theme;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetWebPageInstantView extends Function<WebPageInstantView> {
        public static final int CONSTRUCTOR = -1962649975;
        public String url;
        public boolean forceFull;

        public GetWebPageInstantView() {
        }

        public GetWebPageInstantView(String url, boolean forceFull) {
            this.url = url;
            this.forceFull = forceFull;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetWebPagePreview extends Function<WebPage> {
        public static final int CONSTRUCTOR = 573441580;
        public FormattedText text;

        public GetWebPagePreview() {
        }

        public GetWebPagePreview(FormattedText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class HideSuggestedAction extends Function<Ok> {
        public static final int CONSTRUCTOR = -1561384065;
        public SuggestedAction action;

        public HideSuggestedAction() {
        }

        public HideSuggestedAction(SuggestedAction action) {
            this.action = action;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportContacts extends Function<ImportedContacts> {
        public static final int CONSTRUCTOR = -215132767;
        public Contact[] contacts;

        public ImportContacts() {
        }

        public ImportContacts(Contact[] contacts) {
            this.contacts = contacts;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -1864116784;
        public long chatId;
        public InputFile messageFile;
        public InputFile[] attachedFiles;

        public ImportMessages() {
        }

        public ImportMessages(long chatId, InputFile messageFile, InputFile[] attachedFiles) {
            this.chatId = chatId;
            this.messageFile = messageFile;
            this.attachedFiles = attachedFiles;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InviteGroupCallParticipants extends Function<Ok> {
        public static final int CONSTRUCTOR = 1867097679;
        public int groupCallId;
        public long[] userIds;

        public InviteGroupCallParticipants() {
        }

        public InviteGroupCallParticipants(int groupCallId, long[] userIds) {
            this.groupCallId = groupCallId;
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JoinChat extends Function<Ok> {
        public static final int CONSTRUCTOR = 326769313;
        public long chatId;

        public JoinChat() {
        }

        public JoinChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JoinChatByInviteLink extends Function<Chat> {
        public static final int CONSTRUCTOR = -1049973882;
        public String inviteLink;

        public JoinChatByInviteLink() {
        }

        public JoinChatByInviteLink(String inviteLink) {
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class JoinGroupCall extends Function<Text> {
        public static final int CONSTRUCTOR = -1043773467;
        public int groupCallId;
        public MessageSender participantId;
        public int audioSourceId;
        public String payload;
        public boolean isMuted;
        public boolean isMyVideoEnabled;
        public String inviteHash;

        public JoinGroupCall() {
        }

        public JoinGroupCall(int groupCallId, MessageSender participantId, int audioSourceId, String payload, boolean isMuted, boolean isMyVideoEnabled, String inviteHash) {
            this.groupCallId = groupCallId;
            this.participantId = participantId;
            this.audioSourceId = audioSourceId;
            this.payload = payload;
            this.isMuted = isMuted;
            this.isMyVideoEnabled = isMyVideoEnabled;
            this.inviteHash = inviteHash;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LeaveChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -1825080735;
        public long chatId;

        public LeaveChat() {
        }

        public LeaveChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LeaveGroupCall extends Function<Ok> {
        public static final int CONSTRUCTOR = 980152233;
        public int groupCallId;

        public LeaveGroupCall() {
        }

        public LeaveGroupCall(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LoadChats extends Function<Ok> {
        public static final int CONSTRUCTOR = -1885635205;
        public ChatList chatList;
        public int limit;

        public LoadChats() {
        }

        public LoadChats(ChatList chatList, int limit) {
            this.chatList = chatList;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LoadGroupCallParticipants extends Function<Ok> {
        public static final int CONSTRUCTOR = 938720974;
        public int groupCallId;
        public int limit;

        public LoadGroupCallParticipants() {
        }

        public LoadGroupCallParticipants(int groupCallId, int limit) {
            this.groupCallId = groupCallId;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogOut extends Function<Ok> {

        public static final int CONSTRUCTOR = -1581923301;

        public LogOut() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OpenChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -323371509;
        public long chatId;

        public OpenChat() {
        }

        public OpenChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OpenMessageContent extends Function<Ok> {
        public static final int CONSTRUCTOR = -739088005;
        public long chatId;
        public long messageId;

        public OpenMessageContent() {
        }

        public OpenMessageContent(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OpenWebApp extends Function<WebAppInfo> {
        public static final int CONSTRUCTOR = -1857371112;
        public long chatId;
        public long botUserId;
        public String url;
        public ThemeParameters theme;
        public long replyToMessageId;

        public OpenWebApp() {
        }

        public OpenWebApp(long chatId, long botUserId, String url, ThemeParameters theme, long replyToMessageId) {
            this.chatId = chatId;
            this.botUserId = botUserId;
            this.url = url;
            this.theme = theme;
            this.replyToMessageId = replyToMessageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptimizeStorage extends Function<StorageStatistics> {
        public static final int CONSTRUCTOR = 853186759;
        public long size;
        public int ttl;
        public int count;
        public int immunityDelay;
        public FileType[] fileTypes;
        public long[] chatIds;
        public long[] excludeChatIds;
        public boolean returnDeletedFileStatistics;
        public int chatLimit;

        public OptimizeStorage() {
        }

        public OptimizeStorage(long size, int ttl, int count, int immunityDelay, FileType[] fileTypes, long[] chatIds, long[] excludeChatIds, boolean returnDeletedFileStatistics, int chatLimit) {
            this.size = size;
            this.ttl = ttl;
            this.count = count;
            this.immunityDelay = immunityDelay;
            this.fileTypes = fileTypes;
            this.chatIds = chatIds;
            this.excludeChatIds = excludeChatIds;
            this.returnDeletedFileStatistics = returnDeletedFileStatistics;
            this.chatLimit = chatLimit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ParseMarkdown extends Function<FormattedText> {
        public static final int CONSTRUCTOR = 756366063;
        public FormattedText text;

        public ParseMarkdown() {
        }

        public ParseMarkdown(FormattedText text) {
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ParseTextEntities extends Function<FormattedText> {
        public static final int CONSTRUCTOR = -1709194593;
        public String text;
        public TextParseMode parseMode;

        public ParseTextEntities() {
        }

        public ParseTextEntities(String text, TextParseMode parseMode) {
            this.text = text;
            this.parseMode = parseMode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PinChatMessage extends Function<Ok> {
        public static final int CONSTRUCTOR = 2034719663;
        public long chatId;
        public long messageId;
        public boolean disableNotification;
        public boolean onlyForSelf;

        public PinChatMessage() {
        }

        public PinChatMessage(long chatId, long messageId, boolean disableNotification, boolean onlyForSelf) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.disableNotification = disableNotification;
            this.onlyForSelf = onlyForSelf;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PingProxy extends Function<Seconds> {
        public static final int CONSTRUCTOR = -979681103;
        public int proxyId;

        public PingProxy() {
        }

        public PingProxy(int proxyId) {
            this.proxyId = proxyId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProcessChatJoinRequest extends Function<Ok> {
        public static final int CONSTRUCTOR = 1004876963;
        public long chatId;
        public long userId;
        public boolean approve;

        public ProcessChatJoinRequest() {
        }

        public ProcessChatJoinRequest(long chatId, long userId, boolean approve) {
            this.chatId = chatId;
            this.userId = userId;
            this.approve = approve;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProcessChatJoinRequests extends Function<Ok> {
        public static final int CONSTRUCTOR = 1048722894;
        public long chatId;
        public String inviteLink;
        public boolean approve;

        public ProcessChatJoinRequests() {
        }

        public ProcessChatJoinRequests(long chatId, String inviteLink, boolean approve) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
            this.approve = approve;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ProcessPushNotification extends Function<Ok> {
        public static final int CONSTRUCTOR = 786679952;
        public String payload;

        public ProcessPushNotification() {
        }

        public ProcessPushNotification(String payload) {
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RateSpeechRecognition extends Function<Ok> {
        public static final int CONSTRUCTOR = -287521867;
        public long chatId;
        public long messageId;
        public boolean isGood;

        public RateSpeechRecognition() {
        }

        public RateSpeechRecognition(long chatId, long messageId, boolean isGood) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.isGood = isGood;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReadAllChatMentions extends Function<Ok> {
        public static final int CONSTRUCTOR = 1357558453;
        public long chatId;

        public ReadAllChatMentions() {
        }

        public ReadAllChatMentions(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReadAllChatReactions extends Function<Ok> {
        public static final int CONSTRUCTOR = 1421973357;
        public long chatId;

        public ReadAllChatReactions() {
        }

        public ReadAllChatReactions(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReadFilePart extends Function<FilePart> {
        public static final int CONSTRUCTOR = 906798861;
        public int fileId;
        public long offset;
        public long count;

        public ReadFilePart() {
        }

        public ReadFilePart(int fileId, long offset, long count) {
            this.fileId = fileId;
            this.offset = offset;
            this.count = count;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecognizeSpeech extends Function<Ok> {
        public static final int CONSTRUCTOR = 1741947577;
        public long chatId;
        public long messageId;

        public RecognizeSpeech() {
        }

        public RecognizeSpeech(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecoverAuthenticationPassword extends Function<Ok> {
        public static final int CONSTRUCTOR = -131001053;
        public String recoveryCode;
        public String newPassword;
        public String newHint;

        public RecoverAuthenticationPassword() {
        }

        public RecoverAuthenticationPassword(String recoveryCode, String newPassword, String newHint) {
            this.recoveryCode = recoveryCode;
            this.newPassword = newPassword;
            this.newHint = newHint;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RecoverPassword extends Function<PasswordState> {
        public static final int CONSTRUCTOR = -1524262541;
        public String recoveryCode;
        public String newPassword;
        public String newHint;

        public RecoverPassword() {
        }

        public RecoverPassword(String recoveryCode, String newPassword, String newHint) {
            this.recoveryCode = recoveryCode;
            this.newPassword = newPassword;
            this.newHint = newHint;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RegisterDevice extends Function<PushReceiverId> {
        public static final int CONSTRUCTOR = 366088823;
        public DeviceToken deviceToken;
        public long[] otherUserIds;

        public RegisterDevice() {
        }

        public RegisterDevice(DeviceToken deviceToken, long[] otherUserIds) {
            this.deviceToken = deviceToken;
            this.otherUserIds = otherUserIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RegisterUser extends Function<Ok> {
        public static final int CONSTRUCTOR = -109994467;
        public String firstName;
        public String lastName;

        public RegisterUser() {
        }

        public RegisterUser(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveAllFilesFromDownloads extends Function<Ok> {
        public static final int CONSTRUCTOR = -1186433402;
        public boolean onlyActive;
        public boolean onlyCompleted;
        public boolean deleteFromCache;

        public RemoveAllFilesFromDownloads() {
        }

        public RemoveAllFilesFromDownloads(boolean onlyActive, boolean onlyCompleted, boolean deleteFromCache) {
            this.onlyActive = onlyActive;
            this.onlyCompleted = onlyCompleted;
            this.deleteFromCache = deleteFromCache;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveBackground extends Function<Ok> {
        public static final int CONSTRUCTOR = -1484545642;
        public long backgroundId;

        public RemoveBackground() {
        }

        public RemoveBackground(long backgroundId) {
            this.backgroundId = backgroundId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveChatActionBar extends Function<Ok> {
        public static final int CONSTRUCTOR = -1650968070;
        public long chatId;

        public RemoveChatActionBar() {
        }

        public RemoveChatActionBar(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveContacts extends Function<Ok> {
        public static final int CONSTRUCTOR = 1943858054;
        public long[] userIds;

        public RemoveContacts() {
        }

        public RemoveContacts(long[] userIds) {
            this.userIds = userIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveFavoriteSticker extends Function<Ok> {
        public static final int CONSTRUCTOR = 1152945264;
        public InputFile sticker;

        public RemoveFavoriteSticker() {
        }

        public RemoveFavoriteSticker(InputFile sticker) {
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveFileFromDownloads extends Function<Ok> {
        public static final int CONSTRUCTOR = 1460060142;
        public int fileId;
        public boolean deleteFromCache;

        public RemoveFileFromDownloads() {
        }

        public RemoveFileFromDownloads(int fileId, boolean deleteFromCache) {
            this.fileId = fileId;
            this.deleteFromCache = deleteFromCache;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveNotification extends Function<Ok> {
        public static final int CONSTRUCTOR = 862630734;
        public int notificationGroupId;
        public int notificationId;

        public RemoveNotification() {
        }

        public RemoveNotification(int notificationGroupId, int notificationId) {
            this.notificationGroupId = notificationGroupId;
            this.notificationId = notificationId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveNotificationGroup extends Function<Ok> {
        public static final int CONSTRUCTOR = 1713005454;
        public int notificationGroupId;
        public int maxNotificationId;

        public RemoveNotificationGroup() {
        }

        public RemoveNotificationGroup(int notificationGroupId, int maxNotificationId) {
            this.notificationGroupId = notificationGroupId;
            this.maxNotificationId = maxNotificationId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveProxy extends Function<Ok> {
        public static final int CONSTRUCTOR = 1369219847;
        public int proxyId;

        public RemoveProxy() {
        }

        public RemoveProxy(int proxyId) {
            this.proxyId = proxyId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveRecentHashtag extends Function<Ok> {
        public static final int CONSTRUCTOR = -1013735260;
        public String hashtag;

        public RemoveRecentHashtag() {
        }

        public RemoveRecentHashtag(String hashtag) {
            this.hashtag = hashtag;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveRecentSticker extends Function<Ok> {
        public static final int CONSTRUCTOR = 1246577677;
        public boolean isAttached;
        public InputFile sticker;

        public RemoveRecentSticker() {
        }

        public RemoveRecentSticker(boolean isAttached, InputFile sticker) {
            this.isAttached = isAttached;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveRecentlyFoundChat extends Function<Ok> {
        public static final int CONSTRUCTOR = 717340444;
        public long chatId;

        public RemoveRecentlyFoundChat() {
        }

        public RemoveRecentlyFoundChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveSavedAnimation extends Function<Ok> {
        public static final int CONSTRUCTOR = -495605479;
        public InputFile animation;

        public RemoveSavedAnimation() {
        }

        public RemoveSavedAnimation(InputFile animation) {
            this.animation = animation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveSavedNotificationSound extends Function<Ok> {
        public static final int CONSTRUCTOR = -480032946;
        public long notificationSoundId;

        public RemoveSavedNotificationSound() {
        }

        public RemoveSavedNotificationSound(long notificationSoundId) {
            this.notificationSoundId = notificationSoundId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveStickerFromSet extends Function<Ok> {
        public static final int CONSTRUCTOR = 1642196644;
        public InputFile sticker;

        public RemoveStickerFromSet() {
        }

        public RemoveStickerFromSet(InputFile sticker) {
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RemoveTopChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -1907876267;
        public TopChatCategory category;
        public long chatId;

        public RemoveTopChat() {
        }

        public RemoveTopChat(TopChatCategory category, long chatId) {
            this.category = category;
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReorderChatFilters extends Function<Ok> {
        public static final int CONSTRUCTOR = -1805801313;
        public int[] chatFilterIds;
        public int mainChatListPosition;

        public ReorderChatFilters() {
        }

        public ReorderChatFilters(int[] chatFilterIds, int mainChatListPosition) {
            this.chatFilterIds = chatFilterIds;
            this.mainChatListPosition = mainChatListPosition;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReorderInstalledStickerSets extends Function<Ok> {
        public static final int CONSTRUCTOR = 1114537563;
        public boolean isMasks;
        public long[] stickerSetIds;

        public ReorderInstalledStickerSets() {
        }

        public ReorderInstalledStickerSets(boolean isMasks, long[] stickerSetIds) {
            this.isMasks = isMasks;
            this.stickerSetIds = stickerSetIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReplacePrimaryChatInviteLink extends Function<ChatInviteLink> {
        public static final int CONSTRUCTOR = 1067350941;
        public long chatId;

        public ReplacePrimaryChatInviteLink() {
        }

        public ReplacePrimaryChatInviteLink(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReplaceVideoChatRtmpUrl extends Function<RtmpUrl> {
        public static final int CONSTRUCTOR = 558862304;
        public long chatId;

        public ReplaceVideoChatRtmpUrl() {
        }

        public ReplaceVideoChatRtmpUrl(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReportChat extends Function<Ok> {
        public static final int CONSTRUCTOR = -964543587;
        public long chatId;
        public long[] messageIds;
        public ChatReportReason reason;
        public String text;

        public ReportChat() {
        }

        public ReportChat(long chatId, long[] messageIds, ChatReportReason reason, String text) {
            this.chatId = chatId;
            this.messageIds = messageIds;
            this.reason = reason;
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReportChatPhoto extends Function<Ok> {
        public static final int CONSTRUCTOR = 734652708;
        public long chatId;
        public int fileId;
        public ChatReportReason reason;
        public String text;

        public ReportChatPhoto() {
        }

        public ReportChatPhoto(long chatId, int fileId, ChatReportReason reason, String text) {
            this.chatId = chatId;
            this.fileId = fileId;
            this.reason = reason;
            this.text = text;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ReportSupergroupSpam extends Function<Ok> {
        public static final int CONSTRUCTOR = -94825000;
        public long supergroupId;
        public long[] messageIds;

        public ReportSupergroupSpam() {
        }

        public ReportSupergroupSpam(long supergroupId, long[] messageIds) {
            this.supergroupId = supergroupId;
            this.messageIds = messageIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RequestAuthenticationPasswordRecovery extends Function<Ok> {

        public static final int CONSTRUCTOR = 1393896118;

        public RequestAuthenticationPasswordRecovery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RequestPasswordRecovery extends Function<EmailAddressAuthenticationCodeInfo> {

        public static final int CONSTRUCTOR = -13777582;

        public RequestPasswordRecovery() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RequestQrCodeAuthentication extends Function<Ok> {
        public static final int CONSTRUCTOR = 1363496527;
        public long[] otherUserIds;

        public RequestQrCodeAuthentication() {
        }

        public RequestQrCodeAuthentication(long[] otherUserIds) {
            this.otherUserIds = otherUserIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendAuthenticationCode extends Function<Ok> {

        public static final int CONSTRUCTOR = -814377191;

        public ResendAuthenticationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendChangePhoneNumberCode extends Function<AuthenticationCodeInfo> {

        public static final int CONSTRUCTOR = -786772060;

        public ResendChangePhoneNumberCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendEmailAddressVerificationCode extends Function<EmailAddressAuthenticationCodeInfo> {

        public static final int CONSTRUCTOR = -1872416732;

        public ResendEmailAddressVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -940655817;
        public long chatId;
        public long[] messageIds;

        public ResendMessages() {
        }

        public ResendMessages(long chatId, long[] messageIds) {
            this.chatId = chatId;
            this.messageIds = messageIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendPhoneNumberConfirmationCode extends Function<AuthenticationCodeInfo> {

        public static final int CONSTRUCTOR = 2069068522;

        public ResendPhoneNumberConfirmationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendPhoneNumberVerificationCode extends Function<AuthenticationCodeInfo> {

        public static final int CONSTRUCTOR = 1367629820;

        public ResendPhoneNumberVerificationCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResendRecoveryEmailAddressCode extends Function<PasswordState> {

        public static final int CONSTRUCTOR = 433483548;

        public ResendRecoveryEmailAddressCode() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetAllNotificationSettings extends Function<Ok> {

        public static final int CONSTRUCTOR = -174020359;

        public ResetAllNotificationSettings() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetBackgrounds extends Function<Ok> {

        public static final int CONSTRUCTOR = 204852088;

        public ResetBackgrounds() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetNetworkStatistics extends Function<Ok> {

        public static final int CONSTRUCTOR = 1646452102;

        public ResetNetworkStatistics() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ResetPassword extends Function<ResetPasswordResult> {

        public static final int CONSTRUCTOR = -593589091;

        public ResetPassword() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RevokeChatInviteLink extends Function<ChatInviteLinks> {
        public static final int CONSTRUCTOR = -776514135;
        public long chatId;
        public String inviteLink;

        public RevokeChatInviteLink() {
        }

        public RevokeChatInviteLink(long chatId, String inviteLink) {
            this.chatId = chatId;
            this.inviteLink = inviteLink;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RevokeGroupCallInviteLink extends Function<Ok> {
        public static final int CONSTRUCTOR = 501589140;
        public int groupCallId;

        public RevokeGroupCallInviteLink() {
        }

        public RevokeGroupCallInviteLink(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SaveApplicationLogEvent extends Function<Ok> {
        public static final int CONSTRUCTOR = -811154930;
        public String type;
        public long chatId;
        public JsonValue data;

        public SaveApplicationLogEvent() {
        }

        public SaveApplicationLogEvent(String type, long chatId, JsonValue data) {
            this.type = type;
            this.chatId = chatId;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchBackground extends Function<Background> {
        public static final int CONSTRUCTOR = -2130996959;
        public String name;

        public SearchBackground() {
        }

        public SearchBackground(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchCallMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -1077230820;
        public long fromMessageId;
        public int limit;
        public boolean onlyMissed;

        public SearchCallMessages() {
        }

        public SearchCallMessages(long fromMessageId, int limit, boolean onlyMissed) {
            this.fromMessageId = fromMessageId;
            this.limit = limit;
            this.onlyMissed = onlyMissed;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChatMembers extends Function<ChatMembers> {
        public static final int CONSTRUCTOR = -445823291;
        public long chatId;
        public String query;
        public int limit;
        public ChatMembersFilter filter;

        public SearchChatMembers() {
        }

        public SearchChatMembers(long chatId, String query, int limit, ChatMembersFilter filter) {
            this.chatId = chatId;
            this.query = query;
            this.limit = limit;
            this.filter = filter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChatMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -162154976;
        public long chatId;
        public String query;
        public MessageSender senderId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public SearchMessagesFilter filter;
        public long messageThreadId;

        public SearchChatMessages() {
        }

        public SearchChatMessages(long chatId, String query, MessageSender senderId, long fromMessageId, int offset, int limit, SearchMessagesFilter filter, long messageThreadId) {
            this.chatId = chatId;
            this.query = query;
            this.senderId = senderId;
            this.fromMessageId = fromMessageId;
            this.offset = offset;
            this.limit = limit;
            this.filter = filter;
            this.messageThreadId = messageThreadId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChatRecentLocationMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = 950238950;
        public long chatId;
        public int limit;

        public SearchChatRecentLocationMessages() {
        }

        public SearchChatRecentLocationMessages(long chatId, int limit) {
            this.chatId = chatId;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChats extends Function<Chats> {
        public static final int CONSTRUCTOR = -1879787060;
        public String query;
        public int limit;

        public SearchChats() {
        }

        public SearchChats(String query, int limit) {
            this.query = query;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChatsNearby extends Function<ChatsNearby> {
        public static final int CONSTRUCTOR = -196753377;
        public Location location;

        public SearchChatsNearby() {
        }

        public SearchChatsNearby(Location location) {
            this.location = location;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchChatsOnServer extends Function<Chats> {
        public static final int CONSTRUCTOR = -1158402188;
        public String query;
        public int limit;

        public SearchChatsOnServer() {
        }

        public SearchChatsOnServer(String query, int limit) {
            this.query = query;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchContacts extends Function<Users> {
        public static final int CONSTRUCTOR = -1794690715;
        public String query;
        public int limit;

        public SearchContacts() {
        }

        public SearchContacts(String query, int limit) {
            this.query = query;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchEmojis extends Function<Emojis> {
        public static final int CONSTRUCTOR = 398837927;
        public String text;
        public boolean exactMatch;
        public String[] inputLanguageCodes;

        public SearchEmojis() {
        }

        public SearchEmojis(String text, boolean exactMatch, String[] inputLanguageCodes) {
            this.text = text;
            this.exactMatch = exactMatch;
            this.inputLanguageCodes = inputLanguageCodes;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchFileDownloads extends Function<FoundFileDownloads> {
        public static final int CONSTRUCTOR = 706611286;
        public String query;
        public boolean onlyActive;
        public boolean onlyCompleted;
        public String offset;
        public int limit;

        public SearchFileDownloads() {
        }

        public SearchFileDownloads(String query, boolean onlyActive, boolean onlyCompleted, String offset, int limit) {
            this.query = query;
            this.onlyActive = onlyActive;
            this.onlyCompleted = onlyCompleted;
            this.offset = offset;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchHashtags extends Function<Hashtags> {
        public static final int CONSTRUCTOR = 1043637617;
        public String prefix;
        public int limit;

        public SearchHashtags() {
        }

        public SearchHashtags(String prefix, int limit) {
            this.prefix = prefix;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchInstalledStickerSets extends Function<StickerSets> {
        public static final int CONSTRUCTOR = 681171344;
        public boolean isMasks;
        public String query;
        public int limit;

        public SearchInstalledStickerSets() {
        }

        public SearchInstalledStickerSets(boolean isMasks, String query, int limit) {
            this.isMasks = isMasks;
            this.query = query;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -225214062;
        public ChatList chatList;
        public String query;
        public int offsetDate;
        public long offsetChatId;
        public long offsetMessageId;
        public int limit;
        public SearchMessagesFilter filter;
        public int minDate;
        public int maxDate;

        public SearchMessages() {
        }

        public SearchMessages(ChatList chatList, String query, int offsetDate, long offsetChatId, long offsetMessageId, int limit, SearchMessagesFilter filter, int minDate, int maxDate) {
            this.chatList = chatList;
            this.query = query;
            this.offsetDate = offsetDate;
            this.offsetChatId = offsetChatId;
            this.offsetMessageId = offsetMessageId;
            this.limit = limit;
            this.filter = filter;
            this.minDate = minDate;
            this.maxDate = maxDate;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchOutgoingDocumentMessages extends Function<FoundMessages> {
        public static final int CONSTRUCTOR = -1071397762;
        public String query;
        public int limit;

        public SearchOutgoingDocumentMessages() {
        }

        public SearchOutgoingDocumentMessages(String query, int limit) {
            this.query = query;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchPublicChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 857135533;
        public String username;

        public SearchPublicChat() {
        }

        public SearchPublicChat(String username) {
            this.username = username;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchPublicChats extends Function<Chats> {
        public static final int CONSTRUCTOR = 970385337;
        public String query;

        public SearchPublicChats() {
        }

        public SearchPublicChats(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchSecretMessages extends Function<FoundMessages> {
        public static final int CONSTRUCTOR = -852865892;
        public long chatId;
        public String query;
        public String offset;
        public int limit;
        public SearchMessagesFilter filter;

        public SearchSecretMessages() {
        }

        public SearchSecretMessages(long chatId, String query, String offset, int limit, SearchMessagesFilter filter) {
            this.chatId = chatId;
            this.query = query;
            this.offset = offset;
            this.limit = limit;
            this.filter = filter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchStickerSet extends Function<StickerSet> {
        public static final int CONSTRUCTOR = 1157930222;
        public String name;

        public SearchStickerSet() {
        }

        public SearchStickerSet(String name) {
            this.name = name;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchStickerSets extends Function<StickerSets> {
        public static final int CONSTRUCTOR = -1082314629;
        public String query;

        public SearchStickerSets() {
        }

        public SearchStickerSets(String query) {
            this.query = query;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchStickers extends Function<Stickers> {
        public static final int CONSTRUCTOR = 1555771203;
        public String emoji;
        public int limit;

        public SearchStickers() {
        }

        public SearchStickers(String emoji, int limit) {
            this.emoji = emoji;
            this.limit = limit;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SearchUserByPhoneNumber extends Function<User> {
        public static final int CONSTRUCTOR = -1562236142;
        public String phoneNumber;

        public SearchUserByPhoneNumber() {
        }

        public SearchUserByPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendBotStartMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -1435877650;
        public long botUserId;
        public long chatId;
        public String parameter;

        public SendBotStartMessage() {
        }

        public SendBotStartMessage(long botUserId, long chatId, String parameter) {
            this.botUserId = botUserId;
            this.chatId = chatId;
            this.parameter = parameter;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendCallDebugInformation extends Function<Ok> {
        public static final int CONSTRUCTOR = 2019243839;
        public int callId;
        public String debugInformation;

        public SendCallDebugInformation() {
        }

        public SendCallDebugInformation(int callId, String debugInformation) {
            this.callId = callId;
            this.debugInformation = debugInformation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendCallLog extends Function<Ok> {
        public static final int CONSTRUCTOR = 1057638353;
        public int callId;
        public InputFile logFile;

        public SendCallLog() {
        }

        public SendCallLog(int callId, InputFile logFile) {
            this.callId = callId;
            this.logFile = logFile;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendCallRating extends Function<Ok> {
        public static final int CONSTRUCTOR = -1402719502;
        public int callId;
        public int rating;
        public String comment;
        public CallProblem[] problems;

        public SendCallRating() {
        }

        public SendCallRating(int callId, int rating, String comment, CallProblem[] problems) {
            this.callId = callId;
            this.rating = rating;
            this.comment = comment;
            this.problems = problems;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendCallSignalingData extends Function<Ok> {
        public static final int CONSTRUCTOR = 1412280732;
        public int callId;
        public byte[] data;

        public SendCallSignalingData() {
        }

        public SendCallSignalingData(int callId, byte[] data) {
            this.callId = callId;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendChatAction extends Function<Ok> {
        public static final int CONSTRUCTOR = 2096947540;
        public long chatId;
        public long messageThreadId;
        public ChatAction action;

        public SendChatAction() {
        }

        public SendChatAction(long chatId, long messageThreadId, ChatAction action) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.action = action;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendChatScreenshotTakenNotification extends Function<Ok> {
        public static final int CONSTRUCTOR = 448399457;
        public long chatId;

        public SendChatScreenshotTakenNotification() {
        }

        public SendChatScreenshotTakenNotification(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendCustomRequest extends Function<CustomRequestResult> {
        public static final int CONSTRUCTOR = 285045153;
        public String method;
        public String parameters;

        public SendCustomRequest() {
        }

        public SendCustomRequest(String method, String parameters) {
            this.method = method;
            this.parameters = parameters;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendEmailAddressVerificationCode extends Function<EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -221621379;
        public String emailAddress;

        public SendEmailAddressVerificationCode() {
        }

        public SendEmailAddressVerificationCode(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendInlineQueryResultMessage extends Function<Message> {
        public static final int CONSTRUCTOR = -948639588;
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public long queryId;
        public String resultId;
        public boolean hideViaBot;

        public SendInlineQueryResultMessage() {
        }

        public SendInlineQueryResultMessage(long chatId, long messageThreadId, long replyToMessageId, MessageSendOptions options, long queryId, String resultId, boolean hideViaBot) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.replyToMessageId = replyToMessageId;
            this.options = options;
            this.queryId = queryId;
            this.resultId = resultId;
            this.hideViaBot = hideViaBot;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendMessage extends Function<Message> {
        public static final int CONSTRUCTOR = 960453021;
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;

        public SendMessage() {
        }

        public SendMessage(long chatId, long messageThreadId, long replyToMessageId, MessageSendOptions options, ReplyMarkup replyMarkup, InputMessageContent inputMessageContent) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.replyToMessageId = replyToMessageId;
            this.options = options;
            this.replyMarkup = replyMarkup;
            this.inputMessageContent = inputMessageContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendMessageAlbum extends Function<Messages> {
        public static final int CONSTRUCTOR = -1639797862;
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public InputMessageContent[] inputMessageContents;
        public boolean onlyPreview;

        public SendMessageAlbum() {
        }

        public SendMessageAlbum(long chatId, long messageThreadId, long replyToMessageId, MessageSendOptions options, InputMessageContent[] inputMessageContents, boolean onlyPreview) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.replyToMessageId = replyToMessageId;
            this.options = options;
            this.inputMessageContents = inputMessageContents;
            this.onlyPreview = onlyPreview;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendPassportAuthorizationForm extends Function<Ok> {
        public static final int CONSTRUCTOR = -602402218;
        public int autorizationFormId;
        public PassportElementType[] types;

        public SendPassportAuthorizationForm() {
        }

        public SendPassportAuthorizationForm(int autorizationFormId, PassportElementType[] types) {
            this.autorizationFormId = autorizationFormId;
            this.types = types;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendPaymentForm extends Function<PaymentResult> {
        public static final int CONSTRUCTOR = -965855094;
        public InputInvoice inputInvoice;
        public long paymentFormId;
        public String orderInfoId;
        public String shippingOptionId;
        public InputCredentials credentials;
        public long tipAmount;

        public SendPaymentForm() {
        }

        public SendPaymentForm(InputInvoice inputInvoice, long paymentFormId, String orderInfoId, String shippingOptionId, InputCredentials credentials, long tipAmount) {
            this.inputInvoice = inputInvoice;
            this.paymentFormId = paymentFormId;
            this.orderInfoId = orderInfoId;
            this.shippingOptionId = shippingOptionId;
            this.credentials = credentials;
            this.tipAmount = tipAmount;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendPhoneNumberConfirmationCode extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -1901171495;
        public String hash;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SendPhoneNumberConfirmationCode() {
        }

        public SendPhoneNumberConfirmationCode(String hash, String phoneNumber, PhoneNumberAuthenticationSettings settings) {
            this.hash = hash;
            this.phoneNumber = phoneNumber;
            this.settings = settings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendPhoneNumberVerificationCode extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 2081689035;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SendPhoneNumberVerificationCode() {
        }

        public SendPhoneNumberVerificationCode(String phoneNumber, PhoneNumberAuthenticationSettings settings) {
            this.phoneNumber = phoneNumber;
            this.settings = settings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SendWebAppData extends Function<Ok> {
        public static final int CONSTRUCTOR = -1423978996;
        public long botUserId;
        public String buttonText;
        public String data;

        public SendWebAppData() {
        }

        public SendWebAppData(long botUserId, String buttonText, String data) {
            this.botUserId = botUserId;
            this.buttonText = buttonText;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetAccountTtl extends Function<Ok> {
        public static final int CONSTRUCTOR = 701389032;
        public AccountTtl ttl;

        public SetAccountTtl() {
        }

        public SetAccountTtl(AccountTtl ttl) {
            this.ttl = ttl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetAlarm extends Function<Ok> {
        public static final int CONSTRUCTOR = -873497067;
        public double seconds;

        public SetAlarm() {
        }

        public SetAlarm(double seconds) {
            this.seconds = seconds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetAuthenticationPhoneNumber extends Function<Ok> {
        public static final int CONSTRUCTOR = 868276259;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;

        public SetAuthenticationPhoneNumber() {
        }

        public SetAuthenticationPhoneNumber(String phoneNumber, PhoneNumberAuthenticationSettings settings) {
            this.phoneNumber = phoneNumber;
            this.settings = settings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetAutoDownloadSettings extends Function<Ok> {
        public static final int CONSTRUCTOR = -353671948;
        public AutoDownloadSettings settings;
        public NetworkType type;

        public SetAutoDownloadSettings() {
        }

        public SetAutoDownloadSettings(AutoDownloadSettings settings, NetworkType type) {
            this.settings = settings;
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetBackground extends Function<Background> {
        public static final int CONSTRUCTOR = -1035439225;
        public InputBackground background;
        public BackgroundType type;
        public boolean forDarkTheme;

        public SetBackground() {
        }

        public SetBackground(InputBackground background, BackgroundType type, boolean forDarkTheme) {
            this.background = background;
            this.type = type;
            this.forDarkTheme = forDarkTheme;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetBio extends Function<Ok> {
        public static final int CONSTRUCTOR = -1619582124;
        public String bio;

        public SetBio() {
        }

        public SetBio(String bio) {
            this.bio = bio;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetBotUpdatesStatus extends Function<Ok> {
        public static final int CONSTRUCTOR = -1154926191;
        public int pendingUpdateCount;
        public String errorMessage;

        public SetBotUpdatesStatus() {
        }

        public SetBotUpdatesStatus(int pendingUpdateCount, String errorMessage) {
            this.pendingUpdateCount = pendingUpdateCount;
            this.errorMessage = errorMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatAvailableReactions extends Function<Ok> {
        public static final int CONSTRUCTOR = 1497463414;
        public long chatId;
        public String[] availableReactions;

        public SetChatAvailableReactions() {
        }

        public SetChatAvailableReactions(long chatId, String[] availableReactions) {
            this.chatId = chatId;
            this.availableReactions = availableReactions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatClientData extends Function<Ok> {
        public static final int CONSTRUCTOR = -827119811;
        public long chatId;
        public String clientData;

        public SetChatClientData() {
        }

        public SetChatClientData(long chatId, String clientData) {
            this.chatId = chatId;
            this.clientData = clientData;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatDescription extends Function<Ok> {
        public static final int CONSTRUCTOR = 1957213277;
        public long chatId;
        public String description;

        public SetChatDescription() {
        }

        public SetChatDescription(long chatId, String description) {
            this.chatId = chatId;
            this.description = description;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatDiscussionGroup extends Function<Ok> {
        public static final int CONSTRUCTOR = -918801736;
        public long chatId;
        public long discussionChatId;

        public SetChatDiscussionGroup() {
        }

        public SetChatDiscussionGroup(long chatId, long discussionChatId) {
            this.chatId = chatId;
            this.discussionChatId = discussionChatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatDraftMessage extends Function<Ok> {
        public static final int CONSTRUCTOR = 1683889946;
        public long chatId;
        public long messageThreadId;
        public DraftMessage draftMessage;

        public SetChatDraftMessage() {
        }

        public SetChatDraftMessage(long chatId, long messageThreadId, DraftMessage draftMessage) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.draftMessage = draftMessage;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatLocation extends Function<Ok> {
        public static final int CONSTRUCTOR = -767091286;
        public long chatId;
        public ChatLocation location;

        public SetChatLocation() {
        }

        public SetChatLocation(long chatId, ChatLocation location) {
            this.chatId = chatId;
            this.location = location;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatMemberStatus extends Function<Ok> {
        public static final int CONSTRUCTOR = 81794847;
        public long chatId;
        public MessageSender memberId;
        public ChatMemberStatus status;

        public SetChatMemberStatus() {
        }

        public SetChatMemberStatus(long chatId, MessageSender memberId, ChatMemberStatus status) {
            this.chatId = chatId;
            this.memberId = memberId;
            this.status = status;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatMessageSender extends Function<Ok> {
        public static final int CONSTRUCTOR = -1421513858;
        public long chatId;
        public MessageSender messageSenderId;

        public SetChatMessageSender() {
        }

        public SetChatMessageSender(long chatId, MessageSender messageSenderId) {
            this.chatId = chatId;
            this.messageSenderId = messageSenderId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatMessageTtl extends Function<Ok> {
        public static final int CONSTRUCTOR = -1578406279;
        public long chatId;
        public int ttl;

        public SetChatMessageTtl() {
        }

        public SetChatMessageTtl(long chatId, int ttl) {
            this.chatId = chatId;
            this.ttl = ttl;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatNotificationSettings extends Function<Ok> {
        public static final int CONSTRUCTOR = 777199614;
        public long chatId;
        public ChatNotificationSettings notificationSettings;

        public SetChatNotificationSettings() {
        }

        public SetChatNotificationSettings(long chatId, ChatNotificationSettings notificationSettings) {
            this.chatId = chatId;
            this.notificationSettings = notificationSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatPermissions extends Function<Ok> {
        public static final int CONSTRUCTOR = 2138507006;
        public long chatId;
        public ChatPermissions permissions;

        public SetChatPermissions() {
        }

        public SetChatPermissions(long chatId, ChatPermissions permissions) {
            this.chatId = chatId;
            this.permissions = permissions;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatPhoto extends Function<Ok> {
        public static final int CONSTRUCTOR = -377778941;
        public long chatId;
        public InputChatPhoto photo;

        public SetChatPhoto() {
        }

        public SetChatPhoto(long chatId, InputChatPhoto photo) {
            this.chatId = chatId;
            this.photo = photo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatSlowModeDelay extends Function<Ok> {
        public static final int CONSTRUCTOR = -540350914;
        public long chatId;
        public int slowModeDelay;

        public SetChatSlowModeDelay() {
        }

        public SetChatSlowModeDelay(long chatId, int slowModeDelay) {
            this.chatId = chatId;
            this.slowModeDelay = slowModeDelay;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatTheme extends Function<Ok> {
        public static final int CONSTRUCTOR = -1895234925;
        public long chatId;
        public String themeName;

        public SetChatTheme() {
        }

        public SetChatTheme(long chatId, String themeName) {
            this.chatId = chatId;
            this.themeName = themeName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetChatTitle extends Function<Ok> {
        public static final int CONSTRUCTOR = 164282047;
        public long chatId;
        public String title;

        public SetChatTitle() {
        }

        public SetChatTitle(long chatId, String title) {
            this.chatId = chatId;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetCommands extends Function<Ok> {
        public static final int CONSTRUCTOR = -907165606;
        public BotCommandScope scope;
        public String languageCode;
        public BotCommand[] commands;

        public SetCommands() {
        }

        public SetCommands(BotCommandScope scope, String languageCode, BotCommand[] commands) {
            this.scope = scope;
            this.languageCode = languageCode;
            this.commands = commands;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetCustomLanguagePack extends Function<Ok> {
        public static final int CONSTRUCTOR = -296742819;
        public LanguagePackInfo info;
        public LanguagePackString[] strings;

        public SetCustomLanguagePack() {
        }

        public SetCustomLanguagePack(LanguagePackInfo info, LanguagePackString[] strings) {
            this.info = info;
            this.strings = strings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetCustomLanguagePackString extends Function<Ok> {
        public static final int CONSTRUCTOR = 1316365592;
        public String languagePackId;
        public LanguagePackString newString;

        public SetCustomLanguagePackString() {
        }

        public SetCustomLanguagePackString(String languagePackId, LanguagePackString newString) {
            this.languagePackId = languagePackId;
            this.newString = newString;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetDatabaseEncryptionKey extends Function<Ok> {
        public static final int CONSTRUCTOR = -1204599371;
        public byte[] newEncryptionKey;

        public SetDatabaseEncryptionKey() {
        }

        public SetDatabaseEncryptionKey(byte[] newEncryptionKey) {
            this.newEncryptionKey = newEncryptionKey;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetDefaultChannelAdministratorRights extends Function<Ok> {
        public static final int CONSTRUCTOR = -234004967;
        public ChatAdministratorRights defaultChannelAdministratorRights;

        public SetDefaultChannelAdministratorRights() {
        }

        public SetDefaultChannelAdministratorRights(ChatAdministratorRights defaultChannelAdministratorRights) {
            this.defaultChannelAdministratorRights = defaultChannelAdministratorRights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetDefaultGroupAdministratorRights extends Function<Ok> {
        public static final int CONSTRUCTOR = 1700231016;
        public ChatAdministratorRights defaultGroupAdministratorRights;

        public SetDefaultGroupAdministratorRights() {
        }

        public SetDefaultGroupAdministratorRights(ChatAdministratorRights defaultGroupAdministratorRights) {
            this.defaultGroupAdministratorRights = defaultGroupAdministratorRights;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetFileGenerationProgress extends Function<Ok> {
        public static final int CONSTRUCTOR = 1836403518;
        public long generationId;
        public long expectedSize;
        public long localPrefixSize;

        public SetFileGenerationProgress() {
        }

        public SetFileGenerationProgress(long generationId, long expectedSize, long localPrefixSize) {
            this.generationId = generationId;
            this.expectedSize = expectedSize;
            this.localPrefixSize = localPrefixSize;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetGameScore extends Function<Message> {
        public static final int CONSTRUCTOR = 2127359430;
        public long chatId;
        public long messageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;

        public SetGameScore() {
        }

        public SetGameScore(long chatId, long messageId, boolean editMessage, long userId, int score, boolean force) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.editMessage = editMessage;
            this.userId = userId;
            this.score = score;
            this.force = force;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetGroupCallParticipantIsSpeaking extends Function<Ok> {
        public static final int CONSTRUCTOR = 927506917;
        public int groupCallId;
        public int audioSource;
        public boolean isSpeaking;

        public SetGroupCallParticipantIsSpeaking() {
        }

        public SetGroupCallParticipantIsSpeaking(int groupCallId, int audioSource, boolean isSpeaking) {
            this.groupCallId = groupCallId;
            this.audioSource = audioSource;
            this.isSpeaking = isSpeaking;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetGroupCallParticipantVolumeLevel extends Function<Ok> {
        public static final int CONSTRUCTOR = -1753769944;
        public int groupCallId;
        public MessageSender participantId;
        public int volumeLevel;

        public SetGroupCallParticipantVolumeLevel() {
        }

        public SetGroupCallParticipantVolumeLevel(int groupCallId, MessageSender participantId, int volumeLevel) {
            this.groupCallId = groupCallId;
            this.participantId = participantId;
            this.volumeLevel = volumeLevel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetGroupCallTitle extends Function<Ok> {
        public static final int CONSTRUCTOR = -1228825139;
        public int groupCallId;
        public String title;

        public SetGroupCallTitle() {
        }

        public SetGroupCallTitle(int groupCallId, String title) {
            this.groupCallId = groupCallId;
            this.title = title;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetInactiveSessionTtl extends Function<Ok> {
        public static final int CONSTRUCTOR = 1570548048;
        public int inactiveSessionTtlDays;

        public SetInactiveSessionTtl() {
        }

        public SetInactiveSessionTtl(int inactiveSessionTtlDays) {
            this.inactiveSessionTtlDays = inactiveSessionTtlDays;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetInlineGameScore extends Function<Ok> {
        public static final int CONSTRUCTOR = -948871797;
        public String inlineMessageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;

        public SetInlineGameScore() {
        }

        public SetInlineGameScore(String inlineMessageId, boolean editMessage, long userId, int score, boolean force) {
            this.inlineMessageId = inlineMessageId;
            this.editMessage = editMessage;
            this.userId = userId;
            this.score = score;
            this.force = force;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLocation extends Function<Ok> {
        public static final int CONSTRUCTOR = 93926257;
        public Location location;

        public SetLocation() {
        }

        public SetLocation(Location location) {
            this.location = location;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogStream extends Function<Ok> {
        public static final int CONSTRUCTOR = -1364199535;
        public LogStream logStream;

        public SetLogStream() {
        }

        public SetLogStream(LogStream logStream) {
            this.logStream = logStream;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogTagVerbosityLevel extends Function<Ok> {
        public static final int CONSTRUCTOR = -2095589738;
        public String tag;
        public int newVerbosityLevel;

        public SetLogTagVerbosityLevel() {
        }

        public SetLogTagVerbosityLevel(String tag, int newVerbosityLevel) {
            this.tag = tag;
            this.newVerbosityLevel = newVerbosityLevel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogVerbosityLevel extends Function<Ok> {
        public static final int CONSTRUCTOR = -303429678;
        public int newVerbosityLevel;

        public SetLogVerbosityLevel() {
        }

        public SetLogVerbosityLevel(int newVerbosityLevel) {
            this.newVerbosityLevel = newVerbosityLevel;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetMenuButton extends Function<Ok> {
        public static final int CONSTRUCTOR = -1269841599;
        public long userId;
        public BotMenuButton menuButton;

        public SetMenuButton() {
        }

        public SetMenuButton(long userId, BotMenuButton menuButton) {
            this.userId = userId;
            this.menuButton = menuButton;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetMessageReaction extends Function<Ok> {
        public static final int CONSTRUCTOR = -2024821960;
        public long chatId;
        public long messageId;
        public String reaction;
        public boolean isBig;

        public SetMessageReaction() {
        }

        public SetMessageReaction(long chatId, long messageId, String reaction, boolean isBig) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.reaction = reaction;
            this.isBig = isBig;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetName extends Function<Ok> {
        public static final int CONSTRUCTOR = 1711693584;
        public String firstName;
        public String lastName;

        public SetName() {
        }

        public SetName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetNetworkType extends Function<Ok> {
        public static final int CONSTRUCTOR = -701635234;
        public NetworkType type;

        public SetNetworkType() {
        }

        public SetNetworkType(NetworkType type) {
            this.type = type;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetOption extends Function<Ok> {
        public static final int CONSTRUCTOR = 2114670322;
        public String name;
        public OptionValue value;

        public SetOption() {
        }

        public SetOption(String name, OptionValue value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetPassportElement extends Function<PassportElement> {
        public static final int CONSTRUCTOR = 2068173212;
        public InputPassportElement element;
        public String password;

        public SetPassportElement() {
        }

        public SetPassportElement(InputPassportElement element, String password) {
            this.element = element;
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetPassportElementErrors extends Function<Ok> {
        public static final int CONSTRUCTOR = -2056754881;
        public long userId;
        public InputPassportElementError[] errors;

        public SetPassportElementErrors() {
        }

        public SetPassportElementErrors(long userId, InputPassportElementError[] errors) {
            this.userId = userId;
            this.errors = errors;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetPassword extends Function<PasswordState> {
        public static final int CONSTRUCTOR = -1193589027;
        public String oldPassword;
        public String newPassword;
        public String newHint;
        public boolean setRecoveryEmailAddress;
        public String newRecoveryEmailAddress;

        public SetPassword() {
        }

        public SetPassword(String oldPassword, String newPassword, String newHint, boolean setRecoveryEmailAddress, String newRecoveryEmailAddress) {
            this.oldPassword = oldPassword;
            this.newPassword = newPassword;
            this.newHint = newHint;
            this.setRecoveryEmailAddress = setRecoveryEmailAddress;
            this.newRecoveryEmailAddress = newRecoveryEmailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetPinnedChats extends Function<Ok> {
        public static final int CONSTRUCTOR = -695640000;
        public ChatList chatList;
        public long[] chatIds;

        public SetPinnedChats() {
        }

        public SetPinnedChats(ChatList chatList, long[] chatIds) {
            this.chatList = chatList;
            this.chatIds = chatIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetPollAnswer extends Function<Ok> {
        public static final int CONSTRUCTOR = -1399388792;
        public long chatId;
        public long messageId;
        public int[] optionIds;

        public SetPollAnswer() {
        }

        public SetPollAnswer(long chatId, long messageId, int[] optionIds) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.optionIds = optionIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetProfilePhoto extends Function<Ok> {
        public static final int CONSTRUCTOR = -2069678882;
        public InputChatPhoto photo;

        public SetProfilePhoto() {
        }

        public SetProfilePhoto(InputChatPhoto photo) {
            this.photo = photo;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetRecoveryEmailAddress extends Function<PasswordState> {
        public static final int CONSTRUCTOR = -1981836385;
        public String password;
        public String newRecoveryEmailAddress;

        public SetRecoveryEmailAddress() {
        }

        public SetRecoveryEmailAddress(String password, String newRecoveryEmailAddress) {
            this.password = password;
            this.newRecoveryEmailAddress = newRecoveryEmailAddress;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetScopeNotificationSettings extends Function<Ok> {
        public static final int CONSTRUCTOR = -2049984966;
        public NotificationSettingsScope scope;
        public ScopeNotificationSettings notificationSettings;

        public SetScopeNotificationSettings() {
        }

        public SetScopeNotificationSettings(NotificationSettingsScope scope, ScopeNotificationSettings notificationSettings) {
            this.scope = scope;
            this.notificationSettings = notificationSettings;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetStickerPositionInSet extends Function<Ok> {
        public static final int CONSTRUCTOR = 2075281185;
        public InputFile sticker;
        public int position;

        public SetStickerPositionInSet() {
        }

        public SetStickerPositionInSet(InputFile sticker, int position) {
            this.sticker = sticker;
            this.position = position;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetStickerSetThumbnail extends Function<StickerSet> {
        public static final int CONSTRUCTOR = 1230174856;
        public long userId;
        public String name;
        public InputFile thumbnail;

        public SetStickerSetThumbnail() {
        }

        public SetStickerSetThumbnail(long userId, String name, InputFile thumbnail) {
            this.userId = userId;
            this.name = name;
            this.thumbnail = thumbnail;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetSupergroupStickerSet extends Function<Ok> {
        public static final int CONSTRUCTOR = -2056344215;
        public long supergroupId;
        public long stickerSetId;

        public SetSupergroupStickerSet() {
        }

        public SetSupergroupStickerSet(long supergroupId, long stickerSetId) {
            this.supergroupId = supergroupId;
            this.stickerSetId = stickerSetId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetSupergroupUsername extends Function<Ok> {
        public static final int CONSTRUCTOR = 1346325252;
        public long supergroupId;
        public String username;

        public SetSupergroupUsername() {
        }

        public SetSupergroupUsername(long supergroupId, String username) {
            this.supergroupId = supergroupId;
            this.username = username;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetTdlibParameters extends Function<Ok> {
        public static final int CONSTRUCTOR = -1912557997;
        public TdlibParameters parameters;

        public SetTdlibParameters() {
        }

        public SetTdlibParameters(TdlibParameters parameters) {
            this.parameters = parameters;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetUserPrivacySettingRules extends Function<Ok> {
        public static final int CONSTRUCTOR = -473812741;
        public UserPrivacySetting setting;
        public UserPrivacySettingRules rules;

        public SetUserPrivacySettingRules() {
        }

        public SetUserPrivacySettingRules(UserPrivacySetting setting, UserPrivacySettingRules rules) {
            this.setting = setting;
            this.rules = rules;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetUsername extends Function<Ok> {
        public static final int CONSTRUCTOR = 439901214;
        public String username;

        public SetUsername() {
        }

        public SetUsername(String username) {
            this.username = username;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetVideoChatDefaultParticipant extends Function<Ok> {
        public static final int CONSTRUCTOR = -240749901;
        public long chatId;
        public MessageSender defaultParticipantId;

        public SetVideoChatDefaultParticipant() {
        }

        public SetVideoChatDefaultParticipant(long chatId, MessageSender defaultParticipantId) {
            this.chatId = chatId;
            this.defaultParticipantId = defaultParticipantId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SharePhoneNumber extends Function<Ok> {
        public static final int CONSTRUCTOR = 1097130069;
        public long userId;

        public SharePhoneNumber() {
        }

        public SharePhoneNumber(long userId) {
            this.userId = userId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StartGroupCallRecording extends Function<Ok> {
        public static final int CONSTRUCTOR = 1757774971;
        public int groupCallId;
        public String title;
        public boolean recordVideo;
        public boolean usePortraitOrientation;

        public StartGroupCallRecording() {
        }

        public StartGroupCallRecording(int groupCallId, String title, boolean recordVideo, boolean usePortraitOrientation) {
            this.groupCallId = groupCallId;
            this.title = title;
            this.recordVideo = recordVideo;
            this.usePortraitOrientation = usePortraitOrientation;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StartGroupCallScreenSharing extends Function<Text> {
        public static final int CONSTRUCTOR = -884068051;
        public int groupCallId;
        public int audioSourceId;
        public String payload;

        public StartGroupCallScreenSharing() {
        }

        public StartGroupCallScreenSharing(int groupCallId, int audioSourceId, String payload) {
            this.groupCallId = groupCallId;
            this.audioSourceId = audioSourceId;
            this.payload = payload;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StartScheduledGroupCall extends Function<Ok> {
        public static final int CONSTRUCTOR = 1519938838;
        public int groupCallId;

        public StartScheduledGroupCall() {
        }

        public StartScheduledGroupCall(int groupCallId) {
            this.groupCallId = groupCallId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class StopPoll extends Function<Ok> {
        public static final int CONSTRUCTOR = 1659374253;
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;

        public StopPoll() {
        }

        public StopPoll(long chatId, long messageId, ReplyMarkup replyMarkup) {
            this.chatId = chatId;
            this.messageId = messageId;
            this.replyMarkup = replyMarkup;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SynchronizeLanguagePack extends Function<Ok> {
        public static final int CONSTRUCTOR = -2065307858;
        public String languagePackId;

        public SynchronizeLanguagePack() {
        }

        public SynchronizeLanguagePack(String languagePackId) {
            this.languagePackId = languagePackId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TerminateAllOtherSessions extends Function<Ok> {

        public static final int CONSTRUCTOR = 1874485523;

        public TerminateAllOtherSessions() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TerminateSession extends Function<Ok> {
        public static final int CONSTRUCTOR = -407385812;
        public long sessionId;

        public TerminateSession() {
        }

        public TerminateSession(long sessionId) {
            this.sessionId = sessionId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallBytes extends Function<TestBytes> {
        public static final int CONSTRUCTOR = -736011607;
        public byte[] x;

        public TestCallBytes() {
        }

        public TestCallBytes(byte[] x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallEmpty extends Function<Ok> {

        public static final int CONSTRUCTOR = -627291626;

        public TestCallEmpty() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallString extends Function<TestString> {
        public static final int CONSTRUCTOR = -1732818385;
        public String x;

        public TestCallString() {
        }

        public TestCallString(String x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorInt extends Function<TestVectorInt> {
        public static final int CONSTRUCTOR = -2137277793;
        public int[] x;

        public TestCallVectorInt() {
        }

        public TestCallVectorInt(int[] x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorIntObject extends Function<TestVectorIntObject> {
        public static final int CONSTRUCTOR = 1825428218;
        public TestInt[] x;

        public TestCallVectorIntObject() {
        }

        public TestCallVectorIntObject(TestInt[] x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorString extends Function<TestVectorString> {
        public static final int CONSTRUCTOR = -408600900;
        public String[] x;

        public TestCallVectorString() {
        }

        public TestCallVectorString(String[] x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestCallVectorStringObject extends Function<TestVectorStringObject> {
        public static final int CONSTRUCTOR = 1527666429;
        public TestString[] x;

        public TestCallVectorStringObject() {
        }

        public TestCallVectorStringObject(TestString[] x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestGetDifference extends Function<Ok> {

        public static final int CONSTRUCTOR = 1747084069;

        public TestGetDifference() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestNetwork extends Function<Ok> {

        public static final int CONSTRUCTOR = -1343998901;

        public TestNetwork() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestProxy extends Function<Ok> {
        public static final int CONSTRUCTOR = -1197366626;
        public String server;
        public int port;
        public ProxyType type;
        public int dcId;
        public double timeout;

        public TestProxy() {
        }

        public TestProxy(String server, int port, ProxyType type, int dcId, double timeout) {
            this.server = server;
            this.port = port;
            this.type = type;
            this.dcId = dcId;
            this.timeout = timeout;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestReturnError extends Function<Error> {
        public static final int CONSTRUCTOR = 455179506;
        public Error error;

        public TestReturnError() {
        }

        public TestReturnError(Error error) {
            this.error = error;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestSquareInt extends Function<TestInt> {
        public static final int CONSTRUCTOR = -60135024;
        public int x;

        public TestSquareInt() {
        }

        public TestSquareInt(int x) {
            this.x = x;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TestUseUpdate extends Function<Update> {

        public static final int CONSTRUCTOR = 717094686;

        public TestUseUpdate() {
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleAllDownloadsArePaused extends Function<Ok> {
        public static final int CONSTRUCTOR = 1251512322;
        public boolean arePaused;

        public ToggleAllDownloadsArePaused() {
        }

        public ToggleAllDownloadsArePaused(boolean arePaused) {
            this.arePaused = arePaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleBotIsAddedToAttachmentMenu extends Function<Ok> {
        public static final int CONSTRUCTOR = -1251515422;
        public long botUserId;
        public boolean isAdded;

        public ToggleBotIsAddedToAttachmentMenu() {
        }

        public ToggleBotIsAddedToAttachmentMenu(long botUserId, boolean isAdded) {
            this.botUserId = botUserId;
            this.isAdded = isAdded;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatDefaultDisableNotification extends Function<Ok> {
        public static final int CONSTRUCTOR = 314794002;
        public long chatId;
        public boolean defaultDisableNotification;

        public ToggleChatDefaultDisableNotification() {
        }

        public ToggleChatDefaultDisableNotification(long chatId, boolean defaultDisableNotification) {
            this.chatId = chatId;
            this.defaultDisableNotification = defaultDisableNotification;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatHasProtectedContent extends Function<Ok> {
        public static final int CONSTRUCTOR = 975231309;
        public long chatId;
        public boolean hasProtectedContent;

        public ToggleChatHasProtectedContent() {
        }

        public ToggleChatHasProtectedContent(long chatId, boolean hasProtectedContent) {
            this.chatId = chatId;
            this.hasProtectedContent = hasProtectedContent;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatIsMarkedAsUnread extends Function<Ok> {
        public static final int CONSTRUCTOR = -986129697;
        public long chatId;
        public boolean isMarkedAsUnread;

        public ToggleChatIsMarkedAsUnread() {
        }

        public ToggleChatIsMarkedAsUnread(long chatId, boolean isMarkedAsUnread) {
            this.chatId = chatId;
            this.isMarkedAsUnread = isMarkedAsUnread;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleChatIsPinned extends Function<Ok> {
        public static final int CONSTRUCTOR = -1485429186;
        public ChatList chatList;
        public long chatId;
        public boolean isPinned;

        public ToggleChatIsPinned() {
        }

        public ToggleChatIsPinned(ChatList chatList, long chatId, boolean isPinned) {
            this.chatList = chatList;
            this.chatId = chatId;
            this.isPinned = isPinned;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleDownloadIsPaused extends Function<Ok> {
        public static final int CONSTRUCTOR = -947493099;
        public int fileId;
        public boolean isPaused;

        public ToggleDownloadIsPaused() {
        }

        public ToggleDownloadIsPaused(int fileId, boolean isPaused) {
            this.fileId = fileId;
            this.isPaused = isPaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallEnabledStartNotification extends Function<Ok> {
        public static final int CONSTRUCTOR = 707839826;
        public int groupCallId;
        public boolean enabledStartNotification;

        public ToggleGroupCallEnabledStartNotification() {
        }

        public ToggleGroupCallEnabledStartNotification(int groupCallId, boolean enabledStartNotification) {
            this.groupCallId = groupCallId;
            this.enabledStartNotification = enabledStartNotification;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallIsMyVideoEnabled extends Function<Ok> {
        public static final int CONSTRUCTOR = -1624289030;
        public int groupCallId;
        public boolean isMyVideoEnabled;

        public ToggleGroupCallIsMyVideoEnabled() {
        }

        public ToggleGroupCallIsMyVideoEnabled(int groupCallId, boolean isMyVideoEnabled) {
            this.groupCallId = groupCallId;
            this.isMyVideoEnabled = isMyVideoEnabled;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallIsMyVideoPaused extends Function<Ok> {
        public static final int CONSTRUCTOR = -478875239;
        public int groupCallId;
        public boolean isMyVideoPaused;

        public ToggleGroupCallIsMyVideoPaused() {
        }

        public ToggleGroupCallIsMyVideoPaused(int groupCallId, boolean isMyVideoPaused) {
            this.groupCallId = groupCallId;
            this.isMyVideoPaused = isMyVideoPaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallMuteNewParticipants extends Function<Ok> {
        public static final int CONSTRUCTOR = 284082626;
        public int groupCallId;
        public boolean muteNewParticipants;

        public ToggleGroupCallMuteNewParticipants() {
        }

        public ToggleGroupCallMuteNewParticipants(int groupCallId, boolean muteNewParticipants) {
            this.groupCallId = groupCallId;
            this.muteNewParticipants = muteNewParticipants;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallParticipantIsHandRaised extends Function<Ok> {
        public static final int CONSTRUCTOR = -1896127519;
        public int groupCallId;
        public MessageSender participantId;
        public boolean isHandRaised;

        public ToggleGroupCallParticipantIsHandRaised() {
        }

        public ToggleGroupCallParticipantIsHandRaised(int groupCallId, MessageSender participantId, boolean isHandRaised) {
            this.groupCallId = groupCallId;
            this.participantId = participantId;
            this.isHandRaised = isHandRaised;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallParticipantIsMuted extends Function<Ok> {
        public static final int CONSTRUCTOR = -1308093433;
        public int groupCallId;
        public MessageSender participantId;
        public boolean isMuted;

        public ToggleGroupCallParticipantIsMuted() {
        }

        public ToggleGroupCallParticipantIsMuted(int groupCallId, MessageSender participantId, boolean isMuted) {
            this.groupCallId = groupCallId;
            this.participantId = participantId;
            this.isMuted = isMuted;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleGroupCallScreenSharingIsPaused extends Function<Ok> {
        public static final int CONSTRUCTOR = -1602530464;
        public int groupCallId;
        public boolean isPaused;

        public ToggleGroupCallScreenSharingIsPaused() {
        }

        public ToggleGroupCallScreenSharingIsPaused(int groupCallId, boolean isPaused) {
            this.groupCallId = groupCallId;
            this.isPaused = isPaused;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleMessageSenderIsBlocked extends Function<Ok> {
        public static final int CONSTRUCTOR = -2008084779;
        public MessageSender senderId;
        public boolean isBlocked;

        public ToggleMessageSenderIsBlocked() {
        }

        public ToggleMessageSenderIsBlocked(MessageSender senderId, boolean isBlocked) {
            this.senderId = senderId;
            this.isBlocked = isBlocked;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSessionCanAcceptCalls extends Function<Ok> {
        public static final int CONSTRUCTOR = 1819027208;
        public long sessionId;
        public boolean canAcceptCalls;

        public ToggleSessionCanAcceptCalls() {
        }

        public ToggleSessionCanAcceptCalls(long sessionId, boolean canAcceptCalls) {
            this.sessionId = sessionId;
            this.canAcceptCalls = canAcceptCalls;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSessionCanAcceptSecretChats extends Function<Ok> {
        public static final int CONSTRUCTOR = 1000843390;
        public long sessionId;
        public boolean canAcceptSecretChats;

        public ToggleSessionCanAcceptSecretChats() {
        }

        public ToggleSessionCanAcceptSecretChats(long sessionId, boolean canAcceptSecretChats) {
            this.sessionId = sessionId;
            this.canAcceptSecretChats = canAcceptSecretChats;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupIsAllHistoryAvailable extends Function<Ok> {
        public static final int CONSTRUCTOR = 1155110478;
        public long supergroupId;
        public boolean isAllHistoryAvailable;

        public ToggleSupergroupIsAllHistoryAvailable() {
        }

        public ToggleSupergroupIsAllHistoryAvailable(long supergroupId, boolean isAllHistoryAvailable) {
            this.supergroupId = supergroupId;
            this.isAllHistoryAvailable = isAllHistoryAvailable;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupIsBroadcastGroup extends Function<Ok> {
        public static final int CONSTRUCTOR = 884089365;
        public long supergroupId;

        public ToggleSupergroupIsBroadcastGroup() {
        }

        public ToggleSupergroupIsBroadcastGroup(long supergroupId) {
            this.supergroupId = supergroupId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupJoinByRequest extends Function<Ok> {
        public static final int CONSTRUCTOR = 2111807454;
        public long supergroupId;
        public boolean joinByRequest;

        public ToggleSupergroupJoinByRequest() {
        }

        public ToggleSupergroupJoinByRequest(long supergroupId, boolean joinByRequest) {
            this.supergroupId = supergroupId;
            this.joinByRequest = joinByRequest;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupJoinToSendMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -182022642;
        public long supergroupId;
        public boolean joinToSendMessages;

        public ToggleSupergroupJoinToSendMessages() {
        }

        public ToggleSupergroupJoinToSendMessages(long supergroupId, boolean joinToSendMessages) {
            this.supergroupId = supergroupId;
            this.joinToSendMessages = joinToSendMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ToggleSupergroupSignMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = 1156568356;
        public long supergroupId;
        public boolean signMessages;

        public ToggleSupergroupSignMessages() {
        }

        public ToggleSupergroupSignMessages(long supergroupId, boolean signMessages) {
            this.supergroupId = supergroupId;
            this.signMessages = signMessages;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TransferChatOwnership extends Function<Ok> {
        public static final int CONSTRUCTOR = 2006977043;
        public long chatId;
        public long userId;
        public String password;

        public TransferChatOwnership() {
        }

        public TransferChatOwnership(long chatId, long userId, String password) {
            this.chatId = chatId;
            this.userId = userId;
            this.password = password;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TranslateText extends Function<Text> {
        public static final int CONSTRUCTOR = -1619686803;
        public String text;
        public String fromLanguageCode;
        public String toLanguageCode;

        public TranslateText() {
        }

        public TranslateText(String text, String fromLanguageCode, String toLanguageCode) {
            this.text = text;
            this.fromLanguageCode = fromLanguageCode;
            this.toLanguageCode = toLanguageCode;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpinAllChatMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -1437805385;
        public long chatId;

        public UnpinAllChatMessages() {
        }

        public UnpinAllChatMessages(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpinChatMessage extends Function<Ok> {
        public static final int CONSTRUCTOR = 2065448670;
        public long chatId;
        public long messageId;

        public UnpinChatMessage() {
        }

        public UnpinChatMessage(long chatId, long messageId) {
            this.chatId = chatId;
            this.messageId = messageId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpgradeBasicGroupChatToSupergroupChat extends Function<Chat> {
        public static final int CONSTRUCTOR = 300488122;
        public long chatId;

        public UpgradeBasicGroupChatToSupergroupChat() {
        }

        public UpgradeBasicGroupChatToSupergroupChat(long chatId) {
            this.chatId = chatId;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UploadFile extends Function<File> {
        public static final int CONSTRUCTOR = -745597786;
        public InputFile file;
        public FileType fileType;
        public int priority;

        public UploadFile() {
        }

        public UploadFile(InputFile file, FileType fileType, int priority) {
            this.file = file;
            this.fileType = fileType;
            this.priority = priority;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UploadStickerFile extends Function<File> {
        public static final int CONSTRUCTOR = 86279066;
        public long userId;
        public InputSticker sticker;

        public UploadStickerFile() {
        }

        public UploadStickerFile(long userId, InputSticker sticker) {
            this.userId = userId;
            this.sticker = sticker;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ValidateOrderInfo extends Function<ValidatedOrderInfo> {
        public static final int CONSTRUCTOR = -1248305201;
        public InputInvoice inputInvoice;
        public OrderInfo orderInfo;
        public boolean allowSave;

        public ValidateOrderInfo() {
        }

        public ValidateOrderInfo(InputInvoice inputInvoice, OrderInfo orderInfo, boolean allowSave) {
            this.inputInvoice = inputInvoice;
            this.orderInfo = orderInfo;
            this.allowSave = allowSave;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ViewMessages extends Function<Ok> {
        public static final int CONSTRUCTOR = -1155961496;
        public long chatId;
        public long messageThreadId;
        public long[] messageIds;
        public boolean forceRead;

        public ViewMessages() {
        }

        public ViewMessages(long chatId, long messageThreadId, long[] messageIds, boolean forceRead) {
            this.chatId = chatId;
            this.messageThreadId = messageThreadId;
            this.messageIds = messageIds;
            this.forceRead = forceRead;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ViewPremiumFeature extends Function<Ok> {
        public static final int CONSTRUCTOR = 192950706;
        public PremiumFeature feature;

        public ViewPremiumFeature() {
        }

        public ViewPremiumFeature(PremiumFeature feature) {
            this.feature = feature;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ViewTrendingStickerSets extends Function<Ok> {
        public static final int CONSTRUCTOR = -952416520;
        public long[] stickerSetIds;

        public ViewTrendingStickerSets() {
        }

        public ViewTrendingStickerSets(long[] stickerSetIds) {
            this.stickerSetIds = stickerSetIds;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WriteGeneratedFilePart extends Function<Ok> {
        public static final int CONSTRUCTOR = 214474389;
        public long generationId;
        public long offset;
        public byte[] data;

        public WriteGeneratedFilePart() {
        }

        public WriteGeneratedFilePart(long generationId, long offset, byte[] data) {
            this.generationId = generationId;
            this.offset = offset;
            this.data = data;
        }

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

}
