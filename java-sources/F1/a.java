package F1;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.navigation.NavigationBarItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2151t;

    public /* synthetic */ a(int i10, int i11, Object obj) {
        this.f2149r = i11;
        this.f2151t = obj;
        this.f2150s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2149r;
        Object obj = this.f2151t;
        switch (i10) {
            case 0:
                int i11 = this.f2150s;
                p244z1.a aVar = (p244z1.a) ((O8.c) obj).f6511r;
                if (aVar != null) {
                    aVar.j(i11);
                }
                break;
            case 1:
                int i12 = this.f2150s;
                int[] iArr = NavigationBarItemView.f15011a0;
                ((NavigationBarItemView) obj).i(i12);
                break;
            case 2:
                ((T6.i) obj).i(this.f2150s);
                break;
            case 3:
                ((T7.c) obj).f7925y.x(this.f2150s, 4);
                break;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i13 = 0;
                if (this.f2150s == 1) {
                    while (i13 < size) {
                        ((p013b2.h) arrayList.get(i13)).b();
                        i13++;
                    }
                } else {
                    while (i13 < size) {
                        ((p013b2.h) arrayList.get(i13)).a();
                        i13++;
                    }
                }
                break;
            case 5:
                ((RecyclerView) obj).o0(this.f2150s);
                break;
            default:
                ((MaterialCalendar) obj).f14828v0.o0(this.f2150s);
                break;
        }
    }

    public a(int i10, p014b3.n nVar) {
        this.f2149r = 5;
        this.f2150s = i10;
        this.f2151t = nVar;
    }

    public a(List list, int i10, Throwable th) {
        this.f2149r = 4;
        B0.c.i(list, "initCallbacks cannot be null");
        this.f2151t = new ArrayList(list);
        this.f2150s = i10;
    }

    public a(T7.c cVar) {
        this.f2149r = 3;
        this.f2151t = cVar;
        this.f2150s = -1;
    }
}
