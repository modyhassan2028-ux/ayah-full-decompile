package Y7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p130n.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10448a = {R.attr.theme, com.ayah.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10449b = {com.ayah.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10449b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z10 = (context instanceof c) && ((c) context).f19727a == resourceId;
        if (resourceId == 0 || z10) {
            return context;
        }
        c cVar = new c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f10448a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
