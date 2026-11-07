package p132n1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float[][] f19849v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float[][] f19850w = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19856f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19858i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19859k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f19860l = new float[2];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f19861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MotionLayout f19863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f19864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f19865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f19866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f19867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f19869u;

    public L(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f19851a = 0;
        this.f19852b = 0;
        this.f19853c = 0;
        this.f19854d = -1;
        this.f19855e = -1;
        this.f19856f = -1;
        this.g = 0.5f;
        this.f19857h = 0.5f;
        this.f19858i = 0.0f;
        this.j = 1.0f;
        this.f19864p = 4.0f;
        this.f19865q = 1.2f;
        this.f19866r = true;
        this.f19867s = 1.0f;
        this.f19868t = 0;
        this.f19869u = 10.0f;
        this.f19863o = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22049o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 9) {
                this.f19854d = typedArrayObtainStyledAttributes.getResourceId(index, this.f19854d);
            } else if (index == 10) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f19851a);
                this.f19851a = i11;
                float[] fArr = f19849v[i11];
                this.f19857h = fArr[0];
                this.g = fArr[1];
            } else if (index == 0) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f19852b);
                this.f19852b = i12;
                float[] fArr2 = f19850w[i12];
                this.f19858i = fArr2[0];
                this.j = fArr2[1];
            } else if (index == 5) {
                this.f19864p = typedArrayObtainStyledAttributes.getFloat(index, this.f19864p);
            } else if (index == 4) {
                this.f19865q = typedArrayObtainStyledAttributes.getFloat(index, this.f19865q);
            } else if (index == 6) {
                this.f19866r = typedArrayObtainStyledAttributes.getBoolean(index, this.f19866r);
            } else if (index == 1) {
                this.f19867s = typedArrayObtainStyledAttributes.getFloat(index, this.f19867s);
            } else if (index == 2) {
                this.f19869u = typedArrayObtainStyledAttributes.getFloat(index, this.f19869u);
            } else if (index == 11) {
                this.f19855e = typedArrayObtainStyledAttributes.getResourceId(index, this.f19855e);
            } else if (index == 8) {
                this.f19853c = typedArrayObtainStyledAttributes.getInt(index, this.f19853c);
            } else if (index == 7) {
                this.f19868t = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f19856f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f19855e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void b(boolean z10) {
        float[][] fArr = f19849v;
        float[][] fArr2 = f19850w;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f19851a];
        this.f19857h = fArr3[0];
        this.g = fArr3[1];
        float[] fArr4 = fArr2[this.f19852b];
        this.f19858i = fArr4[0];
        this.j = fArr4[1];
    }

    public final String toString() {
        return this.f19858i + " , " + this.j;
    }
}
