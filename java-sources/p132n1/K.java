package p132n1;

import Y2.a;
import android.util.Log;
import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f19843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f19845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19848f;

    public K() {
        this.f19845c = new float[3];
        this.f19846d = false;
        this.f19848f = Float.NaN;
    }

    public final float a(float f3, long j, View view, s sVar) {
        float[] fArr = this.f19845c;
        this.f19843a.K(f3, fArr);
        boolean z10 = true;
        float f7 = fArr[1];
        if (f7 == 0.0f) {
            this.f19846d = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f19848f)) {
            String str = this.f19844b;
            HashMap map = (HashMap) sVar.f19936a;
            float f10 = Float.NaN;
            if (map.containsKey(view)) {
                HashMap map2 = (HashMap) map.get(view);
                if (map2.containsKey(str)) {
                    float[] fArr2 = (float[]) map2.get(str);
                    if (fArr2.length > 0) {
                        f10 = fArr2[0];
                    }
                }
            }
            this.f19848f = f10;
            if (Float.isNaN(f10)) {
                this.f19848f = 0.0f;
            }
        }
        float f11 = (float) (((((j - this.f19847e) * 1.0E-9d) * ((double) f7)) + ((double) this.f19848f)) % 1.0d);
        this.f19848f = f11;
        String str2 = this.f19844b;
        HashMap map3 = (HashMap) sVar.f19936a;
        if (map3.containsKey(view)) {
            HashMap map4 = (HashMap) map3.get(view);
            if (map4.containsKey(str2)) {
                float[] fArrCopyOf = (float[]) map4.get(str2);
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f11;
                map4.put(str2, fArrCopyOf);
            } else {
                map4.put(str2, new float[]{f11});
                map3.put(view, map4);
            }
        } else {
            HashMap map5 = new HashMap();
            map5.put(str2, new float[]{f11});
            map3.put(view, map5);
        }
        this.f19847e = j;
        float f12 = fArr[0];
        float fSin = (((float) Math.sin(this.f19848f * 6.2831855f)) * f12) + fArr[2];
        if (f12 == 0.0f && f7 == 0.0f) {
            z10 = false;
        }
        this.f19846d = z10;
        return fSin;
    }

    public abstract boolean b(float f3, long j, View view, s sVar);

    public void c(int i10) {
        Log.e("SplineSet", "Error no points added to " + this.f19844b);
    }

    public final String toString() {
        String str = this.f19844b;
        new DecimalFormat("##.##");
        return str;
    }
}
