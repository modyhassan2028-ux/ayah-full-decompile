package U6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f8291b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8292a;

    public /* synthetic */ m(String str) {
        this.f8292a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return y.i(this.f8292a, ((m) obj).f8292a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8292a});
    }
}
