package p053f;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000a.a;
import p020c.i;
import p056f2.F;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends u0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15880i;
    public final /* synthetic */ i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f15881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f15882l;

    public /* synthetic */ g(i iVar, String str, a aVar, int i10) {
        this.f15880i = i10;
        this.j = iVar;
        this.f15881k = str;
        this.f15882l = aVar;
    }

    public final void S(Object obj) {
        switch (this.f15880i) {
            case 0:
                i iVar = this.j;
                LinkedHashMap linkedHashMap = iVar.f13383b;
                ArrayList arrayList = iVar.f13385d;
                String str = this.f15881k;
                Object obj2 = linkedHashMap.get(str);
                F f3 = (F) this.f15882l;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + f3 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(iIntValue, f3, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                i iVar2 = this.j;
                ArrayList arrayList2 = iVar2.f13385d;
                LinkedHashMap linkedHashMap2 = iVar2.f13383b;
                String str2 = this.f15881k;
                Object obj3 = linkedHashMap2.get(str2);
                a aVar = this.f15882l;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(iIntValue2, aVar, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }
}
