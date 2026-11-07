package D0;

import A.D0;
import J0.B0;
import J0.C0;

/* JADX INFO: renamed from: D0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088f extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p251z9.r f1101s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088f(Z0.B b5, p141o0.d dVar, p251z9.r rVar) {
        super(1);
        this.f1100r = 1;
        this.f1101s = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        boolean z10;
        switch (this.f1100r) {
            case 0:
                if (!((AbstractC0090h) obj).f1104H) {
                    return B0.f3878r;
                }
                this.f1101s.f24882r = false;
                return B0.f3880t;
            case 1:
                p141o0.d dVar = (p141o0.d) obj;
                if (!dVar.f19338E) {
                    return B0.f3879s;
                }
                if (dVar.f20212G != null) {
                    G0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                dVar.f20212G = null;
                p251z9.r rVar = this.f1101s;
                rVar.f24882r = rVar.f24882r;
                return B0.f3878r;
            default:
                C0 c10 = (C0) obj;
                p251z9.r rVar2 = this.f1101s;
                if (rVar2.f24882r) {
                    z10 = true;
                } else {
                    p251z9.j.c(c10, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((D0) c10).f27F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                rVar2.f24882r = z10;
                return Boolean.valueOf(!z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0088f(p251z9.r rVar, int i10) {
        super(1);
        this.f1100r = i10;
        this.f1101s = rVar;
    }
}
