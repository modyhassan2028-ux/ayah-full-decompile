package p240y7;

import H7.C0227a;
import I1.S;
import O8.c;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f24714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f24715b;

    public h(ChipGroup chipGroup) {
        this.f24715b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f24715b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = S.f3689a;
                view2.setId(View.generateViewId());
            }
            C0227a c0227a = chipGroup.f14814y;
            Chip chip = (Chip) view2;
            ((HashMap) c0227a.f3465d).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c0227a.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new c(c0227a));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24714a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f24715b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C0227a c0227a = chipGroup.f14814y;
            Chip chip = (Chip) view2;
            c0227a.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) c0227a.f3465d).remove(Integer.valueOf(chip.getId()));
            ((HashSet) c0227a.f3466e).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24714a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
