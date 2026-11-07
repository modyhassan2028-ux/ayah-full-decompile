package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f21932f;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f21927a = Float.NaN;
        this.f21928b = Float.NaN;
        this.f21929c = Float.NaN;
        this.f21930d = Float.NaN;
        this.f21931e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22055u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f21931e);
                this.f21931e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    l lVar = new l();
                    this.f21932f = lVar;
                    lVar.d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f21930d = typedArrayObtainStyledAttributes.getDimension(index, this.f21930d);
            } else if (index == 2) {
                this.f21928b = typedArrayObtainStyledAttributes.getDimension(index, this.f21928b);
            } else if (index == 3) {
                this.f21929c = typedArrayObtainStyledAttributes.getDimension(index, this.f21929c);
            } else if (index == 4) {
                this.f21927a = typedArrayObtainStyledAttributes.getDimension(index, this.f21927a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f3, float f7) {
        float f10 = this.f21927a;
        if (!Float.isNaN(f10) && f3 < f10) {
            return false;
        }
        float f11 = this.f21928b;
        if (!Float.isNaN(f11) && f7 < f11) {
            return false;
        }
        float f12 = this.f21929c;
        if (!Float.isNaN(f12) && f3 > f12) {
            return false;
        }
        float f13 = this.f21930d;
        return Float.isNaN(f13) || f7 <= f13;
    }
}
