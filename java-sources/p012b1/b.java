package p012b1;

import java.util.Locale;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f13143a;

    public b(Locale locale) {
        this.f13143a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(this.f13143a.toLanguageTag(), ((b) obj).f13143a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f13143a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f13143a.toLanguageTag();
    }
}
