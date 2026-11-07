package p056f2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import p053f.a;
import p053f.b;

/* JADX INFO: loaded from: classes.dex */
public final class B implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f15935s;

    public /* synthetic */ B(K k7, int i10) {
        this.f15934r = i10;
        this.f15935s = k7;
    }

    @Override // p053f.b
    public final void d(Object obj) {
        switch (this.f15934r) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                K k7 = this.f15935s;
                G g = (G) k7.f15951F.pollFirst();
                if (g == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = g.f15941r;
                    if (k7.f15964c.n(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                a aVar = (a) obj;
                K k10 = this.f15935s;
                G g10 = (G) k10.f15951F.pollFirst();
                if (g10 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = g10.f15941r;
                    int i11 = g10.f15942s;
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uN = k10.f15964c.n(str2);
                    if (abstractComponentCallbacksC0947uN == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0947uN.w(i11, aVar.f15869r, aVar.f15870s);
                    }
                }
                break;
        }
    }
}
