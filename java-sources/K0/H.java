package K0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4934b;

    public /* synthetic */ H(int i10, Object obj) {
        this.f4933a = i10;
        this.f4934b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4933a) {
            case 0:
                int iCompare = ((Comparator) this.f4934b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return J0.I.f3896j0.compare(((R0.p) obj).f7118c, ((R0.p) obj2).f7118c);
            case 1:
                int iCompare2 = ((H) this.f4934b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : p185s8.u0.i(Integer.valueOf(((R0.p) obj).g), Integer.valueOf(((R0.p) obj2).g));
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f4934b;
                int iCompareTo = Boolean.valueOf(materialButton.f14721F).compareTo(Boolean.valueOf(materialButton2.f14721F));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }

    public H(Comparator comparator) {
        this.f4933a = 0;
        this.f4934b = comparator;
    }
}
