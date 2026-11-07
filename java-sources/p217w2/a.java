package p217w2;

import H9.p;
import N9.AbstractC0419l;
import N9.U;
import N9.Y;
import W.C0557f1;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p074h0.i;
import p110k9.y;
import p120l9.m;
import p150o9.h;
import p151p.C1256n;
import p151p.V;
import p207v2.C1370h;
import p207v2.C1374l;
import p207v2.C1377o;
import p207v2.K;
import p207v2.N;
import p207v2.T;
import p207v2.j0;
import p207v2.k0;
import p207v2.m0;
import p251z9.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f23627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f23628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K f23629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f23630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f23631f;
    public final C1256n g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f23632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f23633i;
    public final N9.k0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U f23634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Y f23635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f23636m;

    public a(b bVar, h hVar, N n6) {
        K k7;
        C1377o c1377o;
        this.f23636m = bVar;
        j.e(hVar, "mainContext");
        this.f23626a = hVar;
        this.f23628c = new T();
        K k10 = K.f23153e;
        C1377o c1377o2 = n6 != null ? (C1377o) n6.f23164d.invoke() : null;
        if (c1377o2 != null) {
            k7 = new K(c1377o2);
        } else {
            k7 = K.f23153e;
            j.c(k7, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.f23629d = k7;
        int i10 = 16;
        i iVar = new i(16);
        if (n6 != null && (c1377o = (C1377o) n6.f23164d.invoke()) != null) {
            iVar.E(c1377o.f23280e, c1377o.f23281f);
        }
        this.f23630e = iVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f23631f = copyOnWriteArrayList;
        this.g = new C1256n(true);
        this.j = AbstractC0419l.c(Boolean.FALSE);
        this.f23634k = (U) iVar.f16424u;
        this.f23635l = AbstractC0419l.a(0, 64, M9.a.f5831s);
        copyOnWriteArrayList.add(new C0557f1(i10, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(a aVar, List list, int i10, int i11, boolean z10, C1374l c1374l, C1374l c1374l2, V v10, c cVar) {
        p207v2.U u8;
        K k7;
        V v11;
        List list2;
        List list3;
        aVar.getClass();
        y yVar = y.f19095a;
        if (cVar instanceof p207v2.U) {
            u8 = (p207v2.U) cVar;
            int i12 = u8.f23181C;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                u8.f23181C = i12 - Integer.MIN_VALUE;
            } else {
                u8 = new p207v2.U(aVar, cVar);
            }
        } else {
            u8 = new p207v2.U(aVar, cVar);
        }
        Object obj = u8.f23179A;
        p161p9.a aVar2 = p161p9.a.f21156r;
        int i13 = u8.f23181C;
        if (i13 == 0) {
            p110k9.a.e(obj);
            if (z10 && c1374l == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            aVar.f23632h = false;
            k7 = new K(i10, i11, list);
            j.c(aVar.f23629d, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            aVar.f23629d = k7;
            aVar.f23627b = v10;
            u8.f23182r = aVar;
            u8.f23183s = list;
            u8.f23184t = c1374l;
            u8.f23185u = c1374l2;
            u8.f23186v = v10;
            u8.f23187w = k7;
            u8.f23188x = i10;
            u8.f23189y = i11;
            u8.f23190z = z10;
            u8.f23181C = 1;
            b bVar = aVar.f23636m;
            bVar.f23639c.setValue(bVar.f23638b.b());
            if (yVar == aVar2) {
                return aVar2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = u8.f23190z;
            i11 = u8.f23189y;
            i10 = u8.f23188x;
            K k10 = u8.f23187w;
            v10 = u8.f23186v;
            c1374l2 = u8.f23185u;
            c1374l = u8.f23184t;
            list = u8.f23183s;
            a aVar3 = u8.f23182r;
            p110k9.a.e(obj);
            k7 = k10;
            aVar = aVar3;
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
            j0 j0Var = (j0) m.g0(list);
            sb.append((j0Var == null || (list3 = j0Var.f23259b) == null) ? null : m.g0(list3));
            sb.append("\n                            |   last item: ");
            j0 j0Var2 = (j0) m.n0(list);
            sb.append((j0Var2 == null || (list2 = j0Var2.f23259b) == null) ? null : m.n0(list2));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i10);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i11);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(v10);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(c1374l);
            sb.append("\n                        ");
            String string = sb.toString();
            if (c1374l2 != null) {
                string = string + "|   mediatorLoadStates: " + c1374l2 + '\n';
            }
            String strJ0 = p.J0(string + "|)");
            j.e(strJ0, "message");
            Log.d("Paging", strJ0, null);
        }
        if (z10) {
            i iVar = aVar.f23630e;
            j.b(c1374l);
            iVar.E(c1374l, c1374l2);
        }
        if (k7.e() == 0 && (v11 = aVar.f23627b) != null) {
            int i14 = k7.f23155b / 2;
            v11.g(new m0(i14, i14, k7.c(), k7.d()));
        }
        return yVar;
    }

    public final C1370h b() {
        K k7 = this.f23629d;
        int i10 = k7.f23156c;
        int i11 = k7.f23157d;
        ArrayList arrayList = k7.f23154a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            m.d0(arrayList2, ((j0) obj).f23259b);
        }
        return new C1370h(arrayList2, i10, i11);
    }
}
