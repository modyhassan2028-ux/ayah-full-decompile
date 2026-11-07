package E1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f1430a;

    public h(Object obj) {
        this.f1430a = (LocaleList) obj;
    }

    @Override // E1.g
    public final String a() {
        return this.f1430a.toLanguageTags();
    }

    @Override // E1.g
    public final Object b() {
        return this.f1430a;
    }

    public final boolean equals(Object obj) {
        return this.f1430a.equals(((g) obj).b());
    }

    @Override // E1.g
    public final Locale get(int i10) {
        return this.f1430a.get(i10);
    }

    public final int hashCode() {
        return this.f1430a.hashCode();
    }

    @Override // E1.g
    public final boolean isEmpty() {
        return this.f1430a.isEmpty();
    }

    @Override // E1.g
    public final int size() {
        return this.f1430a.size();
    }

    public final String toString() {
        return this.f1430a.toString();
    }
}
