package p151p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* JADX INFO: renamed from: p.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1270u0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f20789s;

    public /* synthetic */ C1270u0(int i10, Object obj) {
        this.f20788r = i10;
        this.f20789s = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
        C1261p0 c1261p0;
        switch (this.f20788r) {
            case 0:
                if (i10 != -1 && (c1261p0 = ((A0) this.f20789s).f20526t) != null) {
                    c1261p0.setListSelectionHidden(false);
                    break;
                }
                break;
            case 1:
                ((SearchView) this.f20789s).o(i10);
                break;
            default:
                DropDownPreference dropDownPreference = (DropDownPreference) this.f20789s;
                if (i10 >= 0) {
                    String string = dropDownPreference.f12723k0[i10].toString();
                    if (!string.equals(dropDownPreference.f12724l0)) {
                        dropDownPreference.getClass();
                        dropDownPreference.C(string);
                    }
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f20788r;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
