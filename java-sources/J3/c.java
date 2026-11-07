package J3;

import N9.InterfaceC0416i;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f4238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f4239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PreferencesKhatmah f4240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f4238t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4236r = obj;
        this.f4237s |= Integer.MIN_VALUE;
        return this.f4238t.b(null, this);
    }
}
