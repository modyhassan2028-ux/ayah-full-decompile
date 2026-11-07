package p171r0;

import B9.a;
import K9.A;
import N7.f;
import X.L;
import android.os.Build;
import android.widget.EdgeEffect;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import p063g1.c;
import p112l1.i;
import p112l1.k;
import p112l1.l;
import p232y.AbstractC1469x;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final long a(float f3, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static float b(EdgeEffect edgeEffect, float f3, float f7, c cVar) {
        float f10 = AbstractC1469x.f24595a;
        double density = cVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f3) * 0.35f;
        double d5 = ((double) AbstractC1469x.f24595a) * density;
        float fExp = (float) (Math.exp((AbstractC1469x.f24596b / AbstractC1469x.f24597c) * Math.log(dAbs / d5)) * d5);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? f.d(edgeEffect) : 0.0f) * f7) {
            return 0.0f;
        }
        int iV = a.V(f3);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iV);
            return f3;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iV);
        }
        return f3;
    }

    public static k c(A a9) {
        i iVar = new i();
        iVar.f19376c = new l();
        k kVar = new k(iVar);
        iVar.f19375b = kVar;
        iVar.f19374a = p245z2.a.class;
        try {
            a9.s(new L(26, iVar, a9));
            iVar.f19374a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e10) {
            kVar.f19380s.k(e10);
            return kVar;
        }
    }

    public static final long d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final byte[] e(FileInputStream fileInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStream.available()));
        byte[] bArr = new byte[8192];
        int i10 = fileInputStream.read(bArr);
        while (i10 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i10);
            i10 = fileInputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p251z9.j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
