package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22063e;

    public r(Context context, XmlResourceParser xmlResourceParser) {
        this.f22059a = Float.NaN;
        this.f22060b = Float.NaN;
        this.f22061c = Float.NaN;
        this.f22062d = Float.NaN;
        this.f22063e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22055u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22063e);
                this.f22063e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f22062d = typedArrayObtainStyledAttributes.getDimension(index, this.f22062d);
            } else if (index == 2) {
                this.f22060b = typedArrayObtainStyledAttributes.getDimension(index, this.f22060b);
            } else if (index == 3) {
                this.f22061c = typedArrayObtainStyledAttributes.getDimension(index, this.f22061c);
            } else if (index == 4) {
                this.f22059a = typedArrayObtainStyledAttributes.getDimension(index, this.f22059a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f3, float f7) {
        float f10 = this.f22059a;
        if (!Float.isNaN(f10) && f3 < f10) {
            return false;
        }
        float f11 = this.f22060b;
        if (!Float.isNaN(f11) && f7 < f11) {
            return false;
        }
        float f12 = this.f22061c;
        if (!Float.isNaN(f12) && f3 > f12) {
            return false;
        }
        float f13 = this.f22062d;
        return Float.isNaN(f13) || f7 <= f13;
    }
}
