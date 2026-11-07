package p173r2;

import E5.a;
import G9.f;
import G9.g;
import G9.l;
import G9.m;
import G9.p;
import java.util.List;
import java.util.ListIterator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f21431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21432b;

    public abstract v a();

    public final n b() {
        n nVar = this.f21431a;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, C c10) {
        f fVar = new f(new g(new p(new l(2, list), new a(19, this, c10), 1), new m(0), 0));
        while (fVar.hasNext()) {
            b().f((j) fVar.next());
        }
    }

    public void e(j jVar, boolean z10) {
        List list = (List) b().f21459e.f6130r.getValue();
        if (!list.contains(jVar)) {
            throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        j jVar2 = null;
        while (f()) {
            jVar2 = (j) listIterator.previous();
            if (j.a(jVar2, jVar)) {
                break;
            }
        }
        if (jVar2 != null) {
            b().d(jVar2, z10);
        }
    }

    public boolean f() {
        return true;
    }

    public v c(v vVar) {
        return vVar;
    }
}
