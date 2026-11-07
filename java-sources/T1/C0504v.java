package T1;

import E2.C0112b;
import N9.C0424q;
import W.C0561g1;
import X.C0641m;
import X.C0643o;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import p173r2.C1288h;
import p207v2.C1384w;
import p207v2.k0;

/* JADX INFO: renamed from: T1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504v extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f7747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7748u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504v(B b5, p150o9.c cVar) {
        super(1, cVar);
        this.f7745r = 0;
        this.f7748u = b5;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f7745r) {
            case 0:
                return new C0504v((B) this.f7748u, cVar);
            case 1:
                return new C0504v((X.s) this.f7747t, (p241y9.f) this.f7748u, cVar, 1);
            case 2:
                return new C0504v((W.P) this.f7747t, (p173r2.A) this.f7748u, cVar, 2);
            default:
                return new C0504v((p217w2.a) this.f7747t, (p207v2.N) this.f7748u, cVar, 3);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f7745r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C0504v) create(cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0154, please report this as an issue */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        d0 w9;
        Object objG;
        Object objPrevious;
        p173r2.v vVar;
        boolean zC;
        boolean z10;
        switch (this.f7745r) {
            case 0:
                B b5 = (B) this.f7748u;
                int i10 = this.f7746s;
                p161p9.a aVar = p161p9.a.f21156r;
                try {
                    if (i10 == 0) {
                        p110k9.a.e(obj);
                        this.f7746s = 1;
                        objG = B.g(b5, true, this);
                        if (objG == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) this.f7747t;
                            p110k9.a.e(obj);
                            objE = obj;
                            w9 = new W(th, ((Number) objE).intValue());
                            return new p110k9.j(w9, Boolean.TRUE);
                        }
                        p110k9.a.e(obj);
                        objG = obj;
                    }
                    w9 = (d0) objG;
                    break;
                } catch (Throwable th) {
                    th = th;
                    M mH = b5.h();
                    this.f7747t = th;
                    this.f7746s = 2;
                    objE = mH.e(this);
                    if (objE == aVar) {
                        return aVar;
                    }
                }
                return new p110k9.j(w9, Boolean.TRUE);
            case 1:
                int i11 = this.f7746s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    X.s sVar = (X.s) this.f7747t;
                    C0643o c0643o = new C0643o(sVar, 0);
                    C0641m c0641m = new C0641m((p241y9.f) this.f7748u, sVar, null, 1);
                    this.f7746s = 1;
                    Object objA = androidx.compose.material3.internal.a.a(c0643o, c0641m, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 2:
                int i12 = this.f7746s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C0561g1 c0561g1 = ((W.P) this.f7747t).f8750a;
                    this.f7746s = 1;
                    Object objC = c0561g1.c(this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objC == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                p173r2.A a9 = (p173r2.A) this.f7748u;
                a9.getClass();
                p197u2.h hVar = a9.f21412b;
                hVar.getClass();
                hVar.getClass();
                p251z9.j.e("khatmah/new", "route");
                p120l9.k kVar = hVar.f22854f;
                if (kVar.isEmpty()) {
                    zC = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = kVar.listIterator(kVar.b());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            p173r2.j jVar = (p173r2.j) objPrevious;
                            p173r2.v vVar2 = jVar.f21442s;
                            Bundle bundleA = jVar.f21448y.a();
                            vVar2.getClass();
                            C0112b c0112b = vVar2.f21493s;
                            c0112b.getClass();
                            if (p251z9.j.a((String) c0112b.f1645e, "khatmah/new")) {
                                z10 = true;
                            } else {
                                p173r2.u uVarM = c0112b.m("khatmah/new");
                                if (((p173r2.v) c0112b.f1643c).equals(uVarM != null ? uVarM.f21486r : null)) {
                                    Bundle bundle = uVarM.f21487s;
                                    if (bundleA != null && bundle != null) {
                                        Set<String> setKeySet = bundle.keySet();
                                        p251z9.j.d(setKeySet, "keySet(...)");
                                        Iterator<T> it = setKeySet.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str = (String) it.next();
                                                p251z9.j.b(str);
                                                if (bundleA.containsKey(str)) {
                                                    C1288h c1288h = (C1288h) uVarM.f21486r.c().get(str);
                                                    p173r2.E e10 = c1288h != null ? c1288h.f21439a : null;
                                                    Object objA2 = e10 != null ? e10.a(str, bundle) : null;
                                                    Object objA3 = e10 != null ? e10.a(str, bundleA) : null;
                                                    if (e10 == null || e10.f(objA2, objA3)) {
                                                    }
                                                }
                                            } else {
                                                z10 = true;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (!z10) {
                                arrayList.add(hVar.f22865s.b(jVar.f21442s.f21492r));
                            }
                        } else {
                            objPrevious = null;
                        }
                        p173r2.j jVar2 = (p173r2.j) objPrevious;
                        vVar = jVar2 != null ? jVar2.f21442s : null;
                        if (vVar == null) {
                            String str2 = "Ignoring popBackStack to route khatmah/new as it was not found on the current back stack";
                            p251z9.j.e(str2, "message");
                            Log.i("NavController", str2);
                            zC = false;
                        } else {
                            zC = hVar.c(arrayList, vVar, false, false);
                        }
                    } while (!z10);
                    p173r2.j jVar3 = (p173r2.j) objPrevious;
                    if (jVar3 != null) {
                    }
                    if (vVar == null) {
                        String str3 = "Ignoring popBackStack to route khatmah/new as it was not found on the current back stack";
                        p251z9.j.e(str3, "message");
                        Log.i("NavController", str3);
                        zC = false;
                    } else {
                        zC = hVar.c(arrayList, vVar, false, false);
                    }
                }
                return Boolean.valueOf(zC && hVar.b());
            default:
                p207v2.N n6 = (p207v2.N) this.f7748u;
                p217w2.a aVar4 = (p217w2.a) this.f7747t;
                int i13 = this.f7746s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    p085i0.n nVar = n6.f23162b;
                    k0 k0Var = aVar4.f23628c;
                    aVar4.f23628c = nVar;
                    C0424q c0424q = n6.f23161a;
                    C1384w c1384w = new C1384w(1, aVar4, n6);
                    this.f7746s = 1;
                    Object objD = c0424q.d(c1384w, this);
                    p161p9.a aVar5 = p161p9.a.f21156r;
                    if (objD == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0504v(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(1, cVar);
        this.f7745r = i10;
        this.f7747t = obj;
        this.f7748u = obj2;
    }
}
