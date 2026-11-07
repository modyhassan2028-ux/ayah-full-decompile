package p137n7;

import android.util.Property;
import android.view.ViewGroup;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f20021a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f3 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f3 != null ? f3 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f3 = (Float) obj2;
        float fFloatValue = f3.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f3);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
