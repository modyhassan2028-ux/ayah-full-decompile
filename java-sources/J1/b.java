package J1;

import I1.S;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6.b f4194a;

    public b(C6.b bVar) {
        this.f4194a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4194a.equals(((b) obj).f4194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4194a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        C6.b bVar = this.f4194a;
        int i10 = bVar.f770r;
        Object obj = bVar.f771s;
        switch (i10) {
            case 9:
                int i11 = SearchBar.f15115D0;
                ((SearchBar) obj).setFocusableInTouchMode(z10);
                break;
            default:
                X7.j jVar = (X7.j) obj;
                AutoCompleteTextView autoCompleteTextView = jVar.f10012h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    CheckableImageButton checkableImageButton = jVar.f10049d;
                    int i12 = z10 ? 2 : 1;
                    WeakHashMap weakHashMap = S.f3689a;
                    checkableImageButton.setImportantForAccessibility(i12);
                    break;
                }
                break;
        }
    }
}
