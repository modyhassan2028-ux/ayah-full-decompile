package W2;

import android.view.ViewGroup;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0620a f9583a = new C0620a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f9584b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f9585c = new ArrayList();

    public static void a(ViewGroup viewGroup, p pVar) {
        ArrayList arrayList = f9585c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (pVar == null) {
            pVar = f9583a;
        }
        p pVarClone = pVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((p) obj).x(viewGroup);
            }
        }
        pVarClone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        s sVar = new s();
        sVar.f9581r = pVarClone;
        sVar.f9582s = viewGroup;
        viewGroup.addOnAttachStateChangeListener(sVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
    }

    public static C1350e b() {
        C1350e c1350e;
        ThreadLocal threadLocal = f9584b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1350e = (C1350e) weakReference.get()) != null) {
            return c1350e;
        }
        C1350e c1350e2 = new C1350e(0);
        threadLocal.set(new WeakReference(c1350e2));
        return c1350e2;
    }
}
