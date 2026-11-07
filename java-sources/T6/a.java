package T6;

import U6.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5.c f7806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U6.m f7807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7808d;

    public a(L5.c cVar, U6.m mVar, String str) {
        this.f7806b = cVar;
        this.f7807c = mVar;
        this.f7808d = str;
        this.f7805a = Arrays.hashCode(new Object[]{cVar, mVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y.i(this.f7806b, aVar.f7806b) && y.i(this.f7807c, aVar.f7807c) && y.i(this.f7808d, aVar.f7808d);
    }

    public final int hashCode() {
        return this.f7805a;
    }
}
