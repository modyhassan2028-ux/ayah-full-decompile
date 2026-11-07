package androidx.lifecycle;

import N9.AbstractC0419l;
import N9.k0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r.a f12671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0767p f12672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f12673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12675f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f12676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f12677i;

    public w(InterfaceC0771u interfaceC0771u) {
        new AtomicReference(null);
        this.f12670a = true;
        this.f12671b = new r.a();
        EnumC0767p enumC0767p = EnumC0767p.f12662s;
        this.f12672c = enumC0767p;
        this.f12676h = new ArrayList();
        this.f12673d = new WeakReference(interfaceC0771u);
        this.f12677i = AbstractC0419l.c(enumC0767p);
    }

    public final void a(InterfaceC0770t interfaceC0770t) {
        InterfaceC0769s c0759h;
        Object obj;
        InterfaceC0771u interfaceC0771u;
        EnumC0766o enumC0766o;
        p251z9.j.e(interfaceC0770t, "observer");
        c("addObserver");
        EnumC0767p enumC0767p = this.f12672c;
        EnumC0767p enumC0767p2 = EnumC0767p.f12661r;
        if (enumC0767p != enumC0767p2) {
            enumC0767p2 = EnumC0767p.f12662s;
        }
        C0772v c0772v = new C0772v();
        HashMap map = x.f12678a;
        boolean z10 = interfaceC0770t instanceof InterfaceC0769s;
        boolean z11 = interfaceC0770t instanceof InterfaceC0757f;
        int i10 = 0;
        if (z10 && z11) {
            c0759h = new C0759h((InterfaceC0757f) interfaceC0770t, (InterfaceC0769s) interfaceC0770t);
        } else if (z11) {
            c0759h = new C0759h((InterfaceC0757f) interfaceC0770t, (InterfaceC0769s) null);
        } else if (z10) {
            c0759h = (InterfaceC0769s) interfaceC0770t;
        } else {
            Class<?> cls = interfaceC0770t.getClass();
            if (x.b(cls) == 2) {
                Object obj2 = x.f12679b.get(cls);
                p251z9.j.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), interfaceC0770t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0761j[] interfaceC0761jArr = new InterfaceC0761j[size];
                if (size > 0) {
                    x.a((Constructor) list.get(0), interfaceC0770t);
                    throw null;
                }
                c0759h = new C0756e(i10, interfaceC0761jArr);
            } else {
                c0759h = new C0759h(interfaceC0770t);
            }
        }
        c0772v.f12669b = c0759h;
        c0772v.f12668a = enumC0767p2;
        r.a aVar = this.f12671b;
        r.c cVarB = aVar.b(interfaceC0770t);
        if (cVarB != null) {
            obj = cVarB.f21373s;
        } else {
            HashMap map2 = aVar.f21368v;
            r.c cVar = new r.c(interfaceC0770t, c0772v);
            aVar.f21382u++;
            r.c cVar2 = aVar.f21380s;
            if (cVar2 == null) {
                aVar.f21379r = cVar;
                aVar.f21380s = cVar;
            } else {
                cVar2.f21374t = cVar;
                cVar.f21375u = cVar2;
                aVar.f21380s = cVar;
            }
            map2.put(interfaceC0770t, cVar);
            obj = null;
        }
        if (((C0772v) obj) == null && (interfaceC0771u = (InterfaceC0771u) this.f12673d.get()) != null) {
            i10 = (this.f12674e != 0 || this.f12675f) ? 1 : 0;
            EnumC0767p enumC0767pB = b(interfaceC0770t);
            this.f12674e++;
            while (c0772v.f12668a.compareTo(enumC0767pB) < 0 && this.f12671b.f21368v.containsKey(interfaceC0770t)) {
                EnumC0767p enumC0767p3 = c0772v.f12668a;
                ArrayList arrayList = this.f12676h;
                arrayList.add(enumC0767p3);
                C0764m c0764m = EnumC0766o.Companion;
                EnumC0767p enumC0767p4 = c0772v.f12668a;
                c0764m.getClass();
                p251z9.j.e(enumC0767p4, "state");
                int iOrdinal = enumC0767p4.ordinal();
                if (iOrdinal == 1) {
                    enumC0766o = EnumC0766o.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC0766o = iOrdinal != 3 ? null : EnumC0766o.ON_RESUME;
                } else {
                    enumC0766o = EnumC0766o.ON_START;
                }
                if (enumC0766o == null) {
                    throw new IllegalStateException("no event up from " + c0772v.f12668a);
                }
                c0772v.a(interfaceC0771u, enumC0766o);
                arrayList.remove(arrayList.size() - 1);
                enumC0767pB = b(interfaceC0770t);
            }
            if (i10 == 0) {
                h();
            }
            this.f12674e--;
        }
    }

    public final EnumC0767p b(InterfaceC0770t interfaceC0770t) {
        HashMap map = this.f12671b.f21368v;
        r.c cVar = map.containsKey(interfaceC0770t) ? ((r.c) map.get(interfaceC0770t)).f21375u : null;
        EnumC0767p enumC0767p = cVar != null ? ((C0772v) cVar.f21373s).f12668a : null;
        ArrayList arrayList = this.f12676h;
        EnumC0767p enumC0767p2 = arrayList.isEmpty() ? null : (EnumC0767p) p123m2.c.q(1, arrayList);
        EnumC0767p enumC0767p3 = this.f12672c;
        p251z9.j.e(enumC0767p3, "state1");
        if (enumC0767p == null || enumC0767p.compareTo(enumC0767p3) >= 0) {
            enumC0767p = enumC0767p3;
        }
        return (enumC0767p2 == null || enumC0767p2.compareTo(enumC0767p) >= 0) ? enumC0767p : enumC0767p2;
    }

    public final void c(String str) {
        if (this.f12670a) {
            q.a.S().f21181i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(p245z2.a.D("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0766o enumC0766o) {
        p251z9.j.e(enumC0766o, "event");
        c("handleLifecycleEvent");
        e(enumC0766o.a());
    }

    public final void e(EnumC0767p enumC0767p) {
        if (this.f12672c == enumC0767p) {
            return;
        }
        InterfaceC0771u interfaceC0771u = (InterfaceC0771u) this.f12673d.get();
        EnumC0767p enumC0767p2 = this.f12672c;
        p251z9.j.e(enumC0767p2, "current");
        p251z9.j.e(enumC0767p, "next");
        EnumC0767p enumC0767p3 = EnumC0767p.f12662s;
        EnumC0767p enumC0767p4 = EnumC0767p.f12661r;
        if (enumC0767p2 == enumC0767p3 && enumC0767p == enumC0767p4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0767p.f12663t + "' to be moved to '" + enumC0767p + "' in component " + interfaceC0771u).toString());
        }
        if (enumC0767p2 == enumC0767p4 && enumC0767p2 != enumC0767p) {
            throw new IllegalStateException(("State is '" + enumC0767p4 + "' and cannot be moved to `" + enumC0767p + "` in component " + interfaceC0771u).toString());
        }
        this.f12672c = enumC0767p;
        if (this.f12675f || this.f12674e != 0) {
            this.g = true;
            return;
        }
        this.f12675f = true;
        h();
        this.f12675f = false;
        if (this.f12672c == enumC0767p4) {
            this.f12671b = new r.a();
        }
    }

    public final void f(InterfaceC0770t interfaceC0770t) {
        p251z9.j.e(interfaceC0770t, "observer");
        c("removeObserver");
        this.f12671b.c(interfaceC0770t);
    }

    public final void g(EnumC0767p enumC0767p) {
        p251z9.j.e(enumC0767p, "state");
        c("setCurrentState");
        e(enumC0767p);
    }

    public final void h() {
        EnumC0766o enumC0766o;
        EnumC0766o enumC0766o2;
        InterfaceC0771u interfaceC0771u = (InterfaceC0771u) this.f12673d.get();
        if (interfaceC0771u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            r.a aVar = this.f12671b;
            if (aVar.f21382u != 0) {
                r.c cVar = aVar.f21379r;
                p251z9.j.b(cVar);
                EnumC0767p enumC0767p = ((C0772v) cVar.f21373s).f12668a;
                r.c cVar2 = this.f12671b.f21380s;
                p251z9.j.b(cVar2);
                EnumC0767p enumC0767p2 = ((C0772v) cVar2.f21373s).f12668a;
                if (enumC0767p == enumC0767p2 && this.f12672c == enumC0767p2) {
                    break;
                }
                this.g = false;
                EnumC0767p enumC0767p3 = this.f12672c;
                r.c cVar3 = this.f12671b.f21379r;
                p251z9.j.b(cVar3);
                int iCompareTo = enumC0767p3.compareTo(((C0772v) cVar3.f21373s).f12668a);
                ArrayList arrayList = this.f12676h;
                if (iCompareTo < 0) {
                    r.a aVar2 = this.f12671b;
                    r.b bVar = new r.b(aVar2.f21380s, aVar2.f21379r, 1);
                    aVar2.f21381t.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        p251z9.j.b(entry);
                        InterfaceC0770t interfaceC0770t = (InterfaceC0770t) entry.getKey();
                        C0772v c0772v = (C0772v) entry.getValue();
                        while (c0772v.f12668a.compareTo(this.f12672c) > 0 && !this.g && this.f12671b.f21368v.containsKey(interfaceC0770t)) {
                            C0764m c0764m = EnumC0766o.Companion;
                            EnumC0767p enumC0767p4 = c0772v.f12668a;
                            c0764m.getClass();
                            p251z9.j.e(enumC0767p4, "state");
                            int iOrdinal = enumC0767p4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0766o2 = EnumC0766o.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0766o2 = iOrdinal != 4 ? null : EnumC0766o.ON_PAUSE;
                            } else {
                                enumC0766o2 = EnumC0766o.ON_STOP;
                            }
                            if (enumC0766o2 == null) {
                                throw new IllegalStateException("no event down from " + c0772v.f12668a);
                            }
                            arrayList.add(enumC0766o2.a());
                            c0772v.a(interfaceC0771u, enumC0766o2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                r.c cVar4 = this.f12671b.f21380s;
                if (!this.g && cVar4 != null && this.f12672c.compareTo(((C0772v) cVar4.f21373s).f12668a) > 0) {
                    r.a aVar3 = this.f12671b;
                    aVar3.getClass();
                    r.d dVar = new r.d(aVar3);
                    aVar3.f21381t.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0770t interfaceC0770t2 = (InterfaceC0770t) entry2.getKey();
                        C0772v c0772v2 = (C0772v) entry2.getValue();
                        while (c0772v2.f12668a.compareTo(this.f12672c) < 0 && !this.g && this.f12671b.f21368v.containsKey(interfaceC0770t2)) {
                            arrayList.add(c0772v2.f12668a);
                            C0764m c0764m2 = EnumC0766o.Companion;
                            EnumC0767p enumC0767p5 = c0772v2.f12668a;
                            c0764m2.getClass();
                            p251z9.j.e(enumC0767p5, "state");
                            int iOrdinal2 = enumC0767p5.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC0766o = EnumC0766o.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC0766o = iOrdinal2 != 3 ? null : EnumC0766o.ON_RESUME;
                            } else {
                                enumC0766o = EnumC0766o.ON_START;
                            }
                            if (enumC0766o == null) {
                                throw new IllegalStateException("no event up from " + c0772v2.f12668a);
                            }
                            c0772v2.a(interfaceC0771u, enumC0766o);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.f12677i.m(this.f12672c);
    }
}
