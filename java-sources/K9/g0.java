package K9;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements X {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5366s = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5367t = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5368u = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f5369r;

    public g0(j0 j0Var, Throwable th) {
        this.f5369r = j0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            f5367t.set(this, th);
            return;
        }
        if (th == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5368u;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // K9.X
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f5367t.get(this);
    }

    @Override // K9.X
    public final j0 d() {
        return this.f5369r;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5368u;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0405x.f5414h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f5366s.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f5368u.get(this));
        sb.append(", list=");
        sb.append(this.f5369r);
        sb.append(']');
        return sb.toString();
    }
}
