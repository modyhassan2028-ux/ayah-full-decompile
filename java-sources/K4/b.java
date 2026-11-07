package K4;

import N9.a0;
import T1.L;
import T1.d0;
import Z.p0;
import android.os.Build;
import android.util.Log;
import java.util.List;
import p110k9.y;
import p207v2.AbstractC1379q;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5233s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f5232r = i11;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5232r) {
            case 0:
                b bVar = new b(2, cVar, 0);
                bVar.f5233s = obj;
                return bVar;
            case 1:
                b bVar2 = new b(2, cVar, 1);
                bVar2.f5233s = obj;
                return bVar2;
            case 2:
                b bVar3 = new b(2, cVar, 2);
                bVar3.f5233s = obj;
                return bVar3;
            case 3:
                b bVar4 = new b(2, cVar, 3);
                bVar4.f5233s = obj;
                return bVar4;
            case 4:
                b bVar5 = new b(2, cVar, 4);
                bVar5.f5233s = obj;
                return bVar5;
            case 5:
                b bVar6 = new b(2, cVar, 5);
                bVar6.f5233s = obj;
                return bVar6;
            case 6:
                b bVar7 = new b(2, cVar, 6);
                bVar7.f5233s = obj;
                return bVar7;
            default:
                b bVar8 = new b(2, cVar, 7);
                bVar8.f5233s = obj;
                return bVar8;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5232r) {
            case 0:
                return ((b) create((List) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((b) create((List) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 2:
                return ((b) create((a0) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 3:
                return ((b) create((d0) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 4:
                b bVar = (b) create((String) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                bVar.invokeSuspend(yVar);
                return yVar;
            case 5:
                return ((b) create((p0) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 6:
                b bVar2 = (b) create((AbstractC1379q) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                bVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                return ((b) create((List) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5232r;
        y yVar = y.f19095a;
        boolean z10 = false;
        switch (i10) {
            case 0:
                List list = (List) this.f5233s;
                p110k9.a.e(obj);
                return Boolean.valueOf(!list.isEmpty());
            case 1:
                List list2 = (List) this.f5233s;
                p110k9.a.e(obj);
                return Boolean.valueOf(!list2.isEmpty());
            case 2:
                p110k9.a.e(obj);
                return Boolean.valueOf(((a0) this.f5233s) != a0.f6156r);
            case 3:
                p110k9.a.e(obj);
                return Boolean.valueOf(!(((d0) this.f5233s) instanceof L));
            case 4:
                p110k9.a.e(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f5233s));
                return yVar;
            case 5:
                p110k9.a.e(obj);
                return Boolean.valueOf(((p0) this.f5233s) == p0.f10758r);
            case 6:
                p110k9.a.e(obj);
                AbstractC1379q abstractC1379q = (AbstractC1379q) this.f5233s;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    z10 = true;
                }
                if (z10) {
                    String str = "Sent " + abstractC1379q;
                    j.e(str, "message");
                    Log.v("Paging", str, null);
                }
                return yVar;
            default:
                List list3 = (List) this.f5233s;
                p110k9.a.e(obj);
                return Boolean.valueOf(!list3.isEmpty());
        }
    }
}
