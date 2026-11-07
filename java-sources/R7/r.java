package R7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f7370d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.f7369c = arrayList;
        this.f7370d = matrix;
    }

    @Override // R7.x
    public final void a(Matrix matrix, Q7.a aVar, int i10, Canvas canvas) {
        ArrayList arrayList = this.f7369c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((x) obj).a(this.f7370d, aVar, i10, canvas);
        }
    }
}
