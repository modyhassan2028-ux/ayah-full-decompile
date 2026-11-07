package p022c1;

import U0.p;
import U0.r;
import android.text.TextPaint;
import java.util.ArrayList;
import p055f1.l;
import p180s0.F;
import p180s0.I;
import p180s0.o;
import p196u0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f13441a = new j(false);

    public static final void a(p pVar, o oVar, F f3, float f7, I i10, l lVar, c cVar) {
        ArrayList arrayList = pVar.f8112h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            rVar.f8115a.g(oVar, f3, f7, i10, lVar, cVar);
            oVar.m(0.0f, rVar.f8115a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
