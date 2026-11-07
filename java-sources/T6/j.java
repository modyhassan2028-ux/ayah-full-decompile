package T6;

import U6.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R6.d f7841b;

    public /* synthetic */ j(a aVar, R6.d dVar) {
        this.f7840a = aVar;
        this.f7841b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (y.i(this.f7840a, jVar.f7840a) && y.i(this.f7841b, jVar.f7841b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7840a, this.f7841b});
    }

    public final String toString() {
        L5.c cVar = new L5.c(this);
        cVar.k(this.f7840a, "key");
        cVar.k(this.f7841b, "feature");
        return cVar.toString();
    }
}
