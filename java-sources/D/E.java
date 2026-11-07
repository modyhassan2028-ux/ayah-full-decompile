package D;

import U0.C0509a;
import android.graphics.Matrix;
import android.graphics.Path;
import p180s0.C1300i;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f880u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(int i10, int i11, H0.U u8) {
        super(1);
        this.f877r = 2;
        this.f879t = i10;
        this.f878s = u8;
        this.f880u = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f877r) {
            case 0:
                ((H0.T) obj).d((H0.U) this.f878s, this.f879t, this.f880u, 0.0f);
                break;
            case 1:
                ((H0.T) obj).d((H0.U) this.f878s, this.f879t, this.f880u, 0.0f);
                break;
            case 2:
                H0.U u8 = (H0.U) this.f878s;
                ((H0.T) obj).d(u8, B9.a.V((this.f879t - u8.f3168r) / 2.0f), B9.a.V((this.f880u - u8.f3169s) / 2.0f), 0.0f);
                break;
            case 3:
                H0.T.h((H0.T) obj, (H0.U) this.f878s, this.f879t, this.f880u);
                break;
            default:
                U0.r rVar = (U0.r) obj;
                C1300i c1300i = (C1300i) this.f878s;
                C0509a c0509a = rVar.f8115a;
                int iD = rVar.d(this.f879t);
                int iD2 = rVar.d(this.f880u);
                CharSequence charSequence = c0509a.f8046e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbX = p123m2.c.x("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbX.append(charSequence.length());
                    sbX.append("], or start > end!");
                    p002a1.a.a(sbX.toString());
                }
                Path path = new Path();
                V0.r rVar2 = c0509a.f8045d;
                rVar2.f8389f.getSelectionPath(iD, iD2, path);
                int i10 = rVar2.f8390h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i10);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(rVar.f8120f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                Path path2 = c1300i.f21829a;
                int i11 = (int) 0;
                path2.addPath(path, Float.intBitsToFloat(i11), Float.intBitsToFloat(i11));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, int i10, int i11, int i12) {
        super(1);
        this.f877r = i12;
        this.f878s = obj;
        this.f879t = i10;
        this.f880u = i11;
    }
}
