package androidx.window.layout;

import K0.j1;
import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import p056f2.C0948v;

/* JADX INFO: loaded from: classes.dex */
public final class v implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile v f13106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f13107d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0774b f13108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13109b = new CopyOnWriteArrayList();

    public v(s sVar) {
        this.f13108a = sVar;
        if (sVar == null) {
            return;
        }
        sVar.d(new t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.window.layout.w
    public final void a(Activity activity, B2.c cVar, C0948v c0948v) {
        Object next;
        WindowManager.LayoutParams attributes;
        ReentrantLock reentrantLock = f13107d;
        reentrantLock.lock();
        try {
            InterfaceC0774b interfaceC0774b = this.f13108a;
            if (interfaceC0774b == null) {
                c0948v.accept(new A(p120l9.r.f19440r));
                return;
            }
            boolean z10 = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13109b;
            if ((copyOnWriteArrayList != null) != true || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                } while (!((u) it.next()).f13103a.equals(activity));
            } else {
                z10 = false;
                break;
            }
            u uVar = new u(activity, cVar, c0948v);
            copyOnWriteArrayList.add(uVar);
            A a9 = null;
            iBinder = null;
            IBinder iBinder = null;
            if (z10) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(((u) next).f13103a));
                u uVar2 = (u) next;
                if (uVar2 != null) {
                    a9 = uVar2.f13105c;
                }
                if (a9 != null) {
                    uVar.f13105c = a9;
                    uVar.f13104b.accept(a9);
                }
            } else {
                s sVar = (s) interfaceC0774b;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    sVar.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j1(sVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.w
    public final void b(H1.a aVar) {
        p251z9.j.e(aVar, "callback");
        synchronized (f13107d) {
            try {
                if (this.f13108a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (u uVar : this.f13109b) {
                    if (uVar.f13104b == aVar) {
                        arrayList.add(uVar);
                    }
                }
                this.f13109b.removeAll(arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Activity activity = ((u) obj).f13103a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f13109b;
                    if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((u) it.next()).f13103a.equals(activity)) {
                                }
                            }
                        }
                    }
                    InterfaceC0774b interfaceC0774b = this.f13108a;
                    if (interfaceC0774b != null) {
                        ((s) interfaceC0774b).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
