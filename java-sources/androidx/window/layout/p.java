package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13093b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13094a;

    public p() {
        p123m2.c.z(3, "verificationMode");
        this.f13094a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (p251z9.j.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return p251z9.j.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (a((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                    i10 = i11;
                }
            }
            return true;
        }
        return false;
    }

    public final A c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new A(p120l9.r.f19440r);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        k.d(sidecarDeviceState2, k.b(sidecarDeviceState));
        return new A(d(k.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVarE = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (gVarE != null) {
                arrayList.add(gVarE);
            }
        }
        return arrayList;
    }

    public final g e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        f fVar;
        f fVar2 = f.f13077e;
        p251z9.j.e(sidecarDisplayFeature, "feature");
        int i10 = this.f13094a;
        p123m2.c.z(i10, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new p024c3.d(sidecarDisplayFeature, i10, p024c3.a.f13443a).Z("Type must be either TYPE_FOLD or TYPE_HINGE", l.f13089r).Z("Feature bounds must not be 0", m.f13090r).Z("TYPE_FOLD must have 0 area", n.f13091r).Z("Feature be pinned to either left or top", o.f13092r).p();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            fVar = f.g;
        } else {
            if (type != 2) {
                return null;
            }
            fVar = f.f13079h;
        }
        int iB = k.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            fVar2 = f.f13078f;
        } else if (iB != 3 && iB == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        p251z9.j.d(rect, "feature.rect");
        return new g(new p024c3.b(rect), fVar, fVar2);
    }
}
