package p014b3;

import G.V;
import K9.AbstractC0405x;
import P9.d;
import com.ayah.MainActivity;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p150o9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13207b;

    public b() {
        this.f13206a = 0;
        this.f13207b = new ArrayList(3);
    }

    @Override // p014b3.k
    public final void a(int i10) {
        switch (this.f13206a) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) this.f13207b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((k) obj).a(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                return;
        }
    }

    @Override // p014b3.k
    public final void b(int i10, float f3, int i11) {
        switch (this.f13206a) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) this.f13207b;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((k) obj).b(i10, f3, i11);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                return;
        }
    }

    @Override // p014b3.k
    public final void c(int i10) {
        switch (this.f13206a) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) this.f13207b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((k) obj).c(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                MainActivity mainActivity = (MainActivity) this.f13207b;
                d dVar = mainActivity.f13657v0;
                c cVar = null;
                if (dVar != null) {
                    AbstractC0405x.x(dVar, null, new V(i10, 2, mainActivity, cVar), 3);
                    return;
                } else {
                    j.k("scope");
                    throw null;
                }
        }
    }

    public b(MainActivity mainActivity) {
        this.f13206a = 1;
        this.f13207b = mainActivity;
    }

    private final void d(int i10) {
    }

    private final void e(int i10, float f3, int i11) {
    }
}
