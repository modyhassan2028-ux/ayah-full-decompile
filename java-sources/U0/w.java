package U0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8134a;

    public w() {
        this.f8134a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8134a == ((w) obj).f8134a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8134a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f8134a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public w(boolean z10) {
        this.f8134a = z10;
    }
}
