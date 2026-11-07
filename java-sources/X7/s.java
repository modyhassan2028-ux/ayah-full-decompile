package X7;

import I1.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f10084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f10085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MaterialAutoCompleteTextView f10086t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f10086t = materialAutoCompleteTextView;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f10086t;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.f15266C;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f10085s = colorStateList;
        if (materialAutoCompleteTextView.f15265B != 0 && materialAutoCompleteTextView.f15266C != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{A1.a.c(materialAutoCompleteTextView.f15266C.getColorForState(iArr3, 0), materialAutoCompleteTextView.f15265B), A1.a.c(materialAutoCompleteTextView.f15266C.getColorForState(iArr2, 0), materialAutoCompleteTextView.f15265B), materialAutoCompleteTextView.f15265B});
        }
        this.f10084r = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f10086t;
            Drawable rippleDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f15265B != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f15265B);
                if (this.f10085s != null) {
                    colorDrawable.setTintList(this.f10084r);
                    rippleDrawable = new RippleDrawable(this.f10085s, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = S.f3689a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
