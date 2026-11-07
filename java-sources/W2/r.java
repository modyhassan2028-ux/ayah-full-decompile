package W2;

import java.util.ArrayList;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1350e f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9580b;

    public r(s sVar, C1350e c1350e) {
        this.f9580b = sVar;
        this.f9579a = c1350e;
    }

    @Override // W2.q, W2.m
    public final void e(p pVar) {
        ((ArrayList) this.f9579a.get(this.f9580b.f9582s)).remove(pVar);
        pVar.z(this);
    }
}
