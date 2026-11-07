package K7;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.ayah.R;
import com.google.android.material.navigation.NavigationBarItemView;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5284b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f5283a = i10;
        this.f5284b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        p159p7.a aVar;
        int i18 = this.f5283a;
        Object obj = this.f5284b;
        switch (i18) {
            case 0:
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) obj;
                ImageView imageView = navigationBarItemView.f15018E;
                if (imageView.getVisibility() == 0 && (aVar = navigationBarItemView.f15031W) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView, null);
                    break;
                }
                break;
            case 1:
                Z7.a aVar2 = (Z7.a) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar2.f11034b0 = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar2.U);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f11592G;
                View view2 = searchView.f11600O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f11594I.getPaddingLeft();
                    Rect rect2 = new Rect();
                    boolean z10 = q1.f20766a;
                    boolean z11 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.f11611h0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect2);
                    searchAutoComplete.setDropDownHorizontalOffset(z11 ? -rect2.left : paddingLeft - (rect2.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect2.left) + rect2.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
        }
    }
}
