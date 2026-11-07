package R4;

import E2.AbstractC0135m0;
import E2.P;
import K9.InterfaceC0402u;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.feature.infolist.ui.wrapper.view.BaseListWrapper;
import com.google.android.gms.internal.measurement.J1;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ boolean f7227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7228t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(KeyEvent.Callback callback, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f7226r = i10;
        this.f7228t = callback;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7226r) {
            case 0:
                a aVar = new a((BaseListWrapper) this.f7228t, cVar, 0);
                aVar.f7227s = ((Boolean) obj).booleanValue();
                return aVar;
            case 1:
                return new a((p032d.d) this.f7228t, this.f7227s, cVar);
            default:
                a aVar2 = new a((MainActivity) this.f7228t, cVar, 2);
                aVar2.f7227s = ((Boolean) obj).booleanValue();
                return aVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7226r) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a aVar = (a) create(bool, (p150o9.c) obj2);
                y yVar = y.f19095a;
                aVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                a aVar2 = (a) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                aVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a aVar3 = (a) create(bool2, (p150o9.c) obj2);
                y yVar3 = y.f19095a;
                aVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        J1 j10;
        int i10 = this.f7226r;
        y yVar = y.f19095a;
        Object obj2 = this.f7228t;
        switch (i10) {
            case 0:
                boolean z10 = this.f7227s;
                p110k9.a.e(obj);
                BaseListWrapper baseListWrapper = (BaseListWrapper) obj2;
                List list = baseListWrapper.f13781u;
                Integer num = (Integer) m.g0(list);
                int iIntValue = num != null ? num.intValue() : -1;
                if (z10 && iIntValue > -1) {
                    O4.b bVar = baseListWrapper.f13779s;
                    if (bVar == null) {
                        j.k("recyclerViewAdapter");
                        throw null;
                    }
                    if (!list.equals(bVar.f6477B)) {
                        List list2 = bVar.f6477B;
                        bVar.f6477B = list;
                        ArrayList arrayListQ0 = m.q0(list2, list);
                        int size = arrayListQ0.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj3 = arrayListQ0.get(i11);
                            i11++;
                            bVar.f1651r.d(((Number) obj3).intValue(), 1, "selectionChanged");
                        }
                    }
                    RecyclerView recyclerView = baseListWrapper.f13780t;
                    if (recyclerView == null) {
                        j.k("recyclerView");
                        throw null;
                    }
                    AbstractC0135m0 layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        View viewS0 = linearLayoutManager.S0(0, linearLayoutManager.w(), true, false);
                        int iH = viewS0 == null ? -1 : AbstractC0135m0.H(viewS0);
                        View viewS1 = linearLayoutManager.S0(linearLayoutManager.w() - 1, -1, true, false);
                        int iH2 = viewS1 == null ? -1 : AbstractC0135m0.H(viewS1);
                        if (iH > iIntValue || iIntValue > iH2) {
                            View viewV = linearLayoutManager.v(0);
                            int bottom = viewV != null ? viewV.getBottom() : 0;
                            linearLayoutManager.f12843x = iIntValue;
                            linearLayoutManager.f12844y = bottom;
                            P p10 = linearLayoutManager.f12845z;
                            if (p10 != null) {
                                p10.f1601r = -1;
                            }
                            linearLayoutManager.q0();
                        }
                    }
                }
                return yVar;
            case 1:
                p110k9.a.e(obj);
                p032d.d dVar = (p032d.d) obj2;
                boolean z11 = this.f7227s;
                if (!z11 && !dVar.g && dVar.f13407a && (j10 = dVar.f15524f) != null) {
                    j10.b();
                }
                dVar.e(z11);
                return yVar;
            default:
                boolean z12 = this.f7227s;
                p110k9.a.e(obj);
                MainActivity mainActivity = (MainActivity) obj2;
                int i12 = MainActivity.f13622J0;
                mainActivity.getWindow().setBackgroundDrawable(new ColorDrawable(mainActivity.getColor(z12 ? R.color.quran_background_black : R.color.quran_background)));
                mainActivity.o().b();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p032d.d dVar, boolean z10, p150o9.c cVar) {
        super(2, cVar);
        this.f7226r = 1;
        this.f7228t = dVar;
        this.f7227s = z10;
    }
}
