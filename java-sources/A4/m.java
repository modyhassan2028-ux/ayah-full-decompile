package A4;

import Z.E;
import android.content.Context;
import com.ayah.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class m implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f539b;

    public /* synthetic */ m(Context context, int i10) {
        this.f538a = i10;
        this.f539b = context;
    }

    @Override // Z.E
    public final void a() {
        switch (this.f538a) {
            case 0:
                Object obj = this.f539b;
                U3.a aVar = obj instanceof U3.a ? (U3.a) obj : null;
                if (aVar != null) {
                    ((MainActivity) aVar).C();
                }
                break;
            default:
                Object obj2 = this.f539b;
                U3.a aVar2 = obj2 instanceof U3.a ? (U3.a) obj2 : null;
                if (aVar2 != null) {
                    ((MainActivity) aVar2).C();
                }
                break;
        }
    }
}
