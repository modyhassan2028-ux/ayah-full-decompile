package N5;

import android.view.View;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f6032s;

    public /* synthetic */ b(c cVar, int i10) {
        this.f6031r = i10;
        this.f6032s = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6031r) {
            case 0:
                j.e(view, "v");
                Object tag = view.getTag();
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    c cVar = this.f6032s;
                    O5.d dVar = (O5.d) m.h0(iIntValue, cVar.f6033A);
                    if (dVar != null && (dVar instanceof O5.c)) {
                        O5.c cVar2 = (O5.c) dVar;
                        cVar.f6038w.invoke(cVar2.f6496b, Integer.valueOf(cVar2.f6495a.f19528b));
                    }
                }
                break;
            default:
                j.e(view, "v");
                Object tag2 = view.getTag();
                Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    c cVar3 = this.f6032s;
                    O5.d dVar2 = (O5.d) m.h0(iIntValue2, cVar3.f6033A);
                    if (dVar2 != null && (dVar2 instanceof O5.c)) {
                        O5.c cVar4 = (O5.c) dVar2;
                        cVar3.f6037v.invoke(cVar4.f6496b, Integer.valueOf(cVar4.f6495a.f19528b));
                    }
                }
                break;
        }
    }
}
