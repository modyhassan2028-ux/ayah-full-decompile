package L5;

import java.util.Comparator;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5523b;

    public /* synthetic */ a(int i10, boolean z10) {
        this.f5522a = i10;
        this.f5523b = z10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5522a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                boolean z10 = this.f5523b;
                J5.b bVar2 = (J5.b) obj2;
                return u0.i(Integer.valueOf(z10 ? bVar.f4338t : bVar.f4339u), Integer.valueOf(z10 ? bVar2.f4338t : bVar2.f4339u));
            default:
                p065g3.a aVar = (p065g3.a) obj;
                boolean z11 = this.f5523b;
                p065g3.a aVar2 = (p065g3.a) obj2;
                return u0.i(z11 ? aVar.f16276d : aVar.f16277e, z11 ? aVar2.f16276d : aVar2.f16277e);
        }
    }
}
