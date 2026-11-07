package H2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3255A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f3256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Serializable f3257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f3258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p251z9.v f3259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p150o9.h f3260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p251z9.v f3261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f3264z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, q9.c cVar) {
        super(cVar);
        this.f3264z = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3263y = obj;
        this.f3255A |= Integer.MIN_VALUE;
        return this.f3264z.C(false, null, this);
    }
}
