package F1;

import F.s;
import J0.I;
import Z.L;
import java.io.File;
import java.util.Comparator;
import p185s8.F;
import p185s8.r0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2152a;

    public /* synthetic */ b(int i10) {
        this.f2152a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2152a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b5 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b5 != b10) {
                        return b5 - b10;
                    }
                }
                return 0;
            case 1:
                return p251z9.j.f(((s) obj).f2110a, ((s) obj2).f2110a);
            case 2:
                I i11 = (I) obj;
                I i12 = (I) obj2;
                float f3 = i11.f3915X.f3958p.f4038W;
                float f7 = i12.f3915X.f3958p.f4038W;
                return f3 == f7 ? p251z9.j.f(i11.v(), i12.v()) : Float.compare(f3, f7);
            case 3:
                p110k9.j jVar = (p110k9.j) obj;
                p110k9.j jVar2 = (p110k9.j) obj2;
                return (((Number) jVar.f19078s).intValue() - ((Number) jVar.f19077r).intValue()) - (((Number) jVar2.f19078s).intValue() - ((Number) jVar2.f19077r).intValue());
            case 4:
                return p251z9.j.f(((L) obj).f10621b, ((L) obj2).f10621b);
            case 5:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 6:
                return ((F) ((r0) obj)).f22193a.compareTo(((F) ((r0) obj2)).f22193a);
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i13 = p213v8.a.f23371f;
                return name.substring(0, i13).compareTo(((File) obj2).getName().substring(0, i13));
        }
    }
}
