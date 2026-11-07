package oa;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Da.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f20420n;

    public l(m mVar) {
        this.f20420n = mVar;
    }

    @Override // Da.e
    public final void j() {
        m mVar = this.f20420n;
        if (mVar.f20424D) {
            return;
        }
        mVar.f20424D = true;
        Ca.r rVar = mVar.f20425E;
        if (rVar != null) {
            ((pa.d) rVar.f851e).cancel();
        }
        Iterator it = mVar.f20426F.iterator();
        p251z9.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s) it.next()).cancel();
        }
    }
}
