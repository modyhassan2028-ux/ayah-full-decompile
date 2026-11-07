package X7;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import p151p.A0;
import p151p.I;

/* JADX INFO: loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10083s;

    public /* synthetic */ r(int i10, Object obj) {
        this.f10082r = i10;
        this.f10083s = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        Object item;
        switch (this.f10082r) {
            case 0:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.f10083s;
                A0 a9 = materialAutoCompleteTextView.f15267v;
                if (i10 < 0) {
                    item = !a9.Q.isShowing() ? null : a9.f20526t.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i10);
                }
                MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, item);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = !a9.Q.isShowing() ? null : a9.f20526t.getSelectedView();
                        i10 = !a9.Q.isShowing() ? -1 : a9.f20526t.getSelectedItemPosition();
                        j = !a9.Q.isShowing() ? Long.MIN_VALUE : a9.f20526t.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(a9.f20526t, view, i10, j);
                }
                a9.dismiss();
                break;
            case 1:
                I i11 = (I) this.f10083s;
                AppCompatSpinner appCompatSpinner = i11.f20560Y;
                appCompatSpinner.setSelection(i10);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i10, i11.f20557V.getItemId(i10));
                }
                i11.dismiss();
                break;
            default:
                ((SearchView) this.f10083s).n(i10);
                break;
        }
    }
}
