package E2;

import I1.InterfaceC0258k;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* JADX INFO: renamed from: E2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113b0 implements InterfaceC0258k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1647r;

    public /* synthetic */ C0113b0(RecyclerView recyclerView) {
        this.f1647r = recyclerView;
    }

    @Override // I1.InterfaceC0258k
    public void A() {
        this.f1647r.t0();
    }

    public void a(C0110a c0110a) {
        int i10 = c0110a.f1636a;
        RecyclerView recyclerView = this.f1647r;
        if (i10 == 1) {
            recyclerView.f12863E.Z(c0110a.f1637b, c0110a.f1639d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f12863E.c0(c0110a.f1637b, c0110a.f1639d);
        } else if (i10 == 4) {
            recyclerView.f12863E.d0(c0110a.f1637b, c0110a.f1639d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f12863E.b0(c0110a.f1637b, c0110a.f1639d);
        }
    }

    public F0 b(int i10) {
        RecyclerView recyclerView = this.f1647r;
        int iZ = recyclerView.f12918w.z();
        F0 f3 = null;
        for (int i11 = 0; i11 < iZ; i11++) {
            F0 f0P = RecyclerView.P(recyclerView.f12918w.y(i11));
            if (f0P != null && !f0P.i() && f0P.f1488c == i10) {
                if (!((ArrayList) recyclerView.f12918w.f1676e).contains(f0P.f1486a)) {
                    f3 = f0P;
                    break;
                }
                f3 = f0P;
            }
        }
        if (f3 != null) {
            if (!((ArrayList) recyclerView.f12918w.f1676e).contains(f3.f1486a)) {
                return f3;
            }
            if (RecyclerView.f12847U0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f1647r;
        int iZ = recyclerView.f12918w.z();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iZ; i15++) {
            View viewY = recyclerView.f12918w.y(i15);
            F0 f0P = RecyclerView.P(viewY);
            if (f0P != null && !f0P.p() && (i13 = f0P.f1488c) >= i10 && i13 < i14) {
                f0P.a(2);
                if (obj == null) {
                    f0P.a(1024);
                } else if ((1024 & f0P.j) == 0) {
                    if (f0P.f1494k == null) {
                        ArrayList arrayList = new ArrayList();
                        f0P.f1494k = arrayList;
                        f0P.f1495l = DesugarCollections.unmodifiableList(arrayList);
                    }
                    f0P.f1494k.add(obj);
                }
                ((C0137n0) viewY.getLayoutParams()).f1735c = true;
            }
        }
        u0 u0Var = recyclerView.f12912t;
        ArrayList arrayList2 = u0Var.f1780c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            F0 f3 = (F0) arrayList2.get(size);
            if (f3 != null && (i12 = f3.f1488c) >= i10 && i12 < i14) {
                f3.a(2);
                u0Var.g(size);
            }
        }
        recyclerView.f12860C0 = true;
    }

    public void d(int i10, int i11) {
        RecyclerView recyclerView = this.f1647r;
        int iZ = recyclerView.f12918w.z();
        for (int i12 = 0; i12 < iZ; i12++) {
            F0 f0P = RecyclerView.P(recyclerView.f12918w.y(i12));
            if (f0P != null && !f0P.p() && f0P.f1488c >= i10) {
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + f0P + " now at position " + (f0P.f1488c + i11));
                }
                f0P.m(i11, false);
                recyclerView.f12923y0.f1448f = true;
            }
        }
        ArrayList arrayList = recyclerView.f12912t.f1780c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            F0 f3 = (F0) arrayList.get(i13);
            if (f3 != null && f3.f1488c >= i10) {
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + f3 + " now at position " + (f3.f1488c + i11));
                }
                f3.m(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f12858B0 = true;
    }

    public void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RecyclerView recyclerView = this.f1647r;
        int iZ = recyclerView.f12918w.z();
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        boolean z10 = false;
        for (int i20 = 0; i20 < iZ; i20++) {
            F0 f0P = RecyclerView.P(recyclerView.f12918w.y(i20));
            if (f0P != null && (i19 = f0P.f1488c) >= i13 && i19 <= i12) {
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + f0P);
                }
                if (f0P.f1488c == i10) {
                    f0P.m(i11 - i10, false);
                } else {
                    f0P.m(i14, false);
                }
                recyclerView.f12923y0.f1448f = true;
            }
        }
        ArrayList arrayList = recyclerView.f12912t.f1780c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
            i17 = -1;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = 1;
        }
        int size = arrayList.size();
        int i21 = 0;
        while (i21 < size) {
            F0 f3 = (F0) arrayList.get(i21);
            if (f3 != null && (i18 = f3.f1488c) >= i16 && i18 <= i15) {
                if (i18 == i10) {
                    f3.m(i11 - i10, z10);
                } else {
                    f3.m(i17, z10);
                }
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + f3);
                }
            }
            i21++;
            z10 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f12858B0 = true;
    }

    @Override // I1.InterfaceC0258k
    public boolean n(float f3) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f1647r;
        if (recyclerView.f12863E.f()) {
            i11 = (int) f3;
            i10 = 0;
        } else if (recyclerView.f12863E.e()) {
            i10 = (int) f3;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        recyclerView.t0();
        return recyclerView.K(i10, i11, 0, Integer.MAX_VALUE);
    }

    @Override // I1.InterfaceC0258k
    public float x() {
        float f3;
        RecyclerView recyclerView = this.f1647r;
        if (recyclerView.f12863E.f()) {
            f3 = recyclerView.f12913t0;
        } else {
            if (!recyclerView.f12863E.e()) {
                return 0.0f;
            }
            f3 = recyclerView.f12911s0;
        }
        return -f3;
    }
}
