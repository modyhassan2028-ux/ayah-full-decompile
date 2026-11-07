package D5;

import M.k;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.Map;
import p110k9.y;
import p150o9.c;
import p241y9.f;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f1229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ BookType f1231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Map f1232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f1233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BookType f1234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, BookType bookType, c cVar) {
        super(3, cVar);
        this.f1233v = kVar;
        this.f1234w = bookType;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        a aVar = new a(this.f1233v, this.f1234w, (c) obj3);
        aVar.f1231t = (BookType) obj;
        aVar.f1232u = (Map) obj2;
        return aVar.invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x013f A[PHI: r16 r19
      0x013f: PHI (r16v4 java.util.Map) = (r16v1 java.util.Map), (r16v11 java.util.Map) binds: [B:64:0x013d, B:58:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r19v5 java.util.ArrayList) = (r19v2 java.util.ArrayList), (r19v9 java.util.ArrayList) binds: [B:64:0x013d, B:58:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142 A[PHI: r16 r19
      0x0142: PHI (r16v2 java.util.Map) = (r16v1 java.util.Map), (r16v11 java.util.Map) binds: [B:64:0x013d, B:60:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r19v3 java.util.ArrayList) = (r19v2 java.util.ArrayList), (r19v9 java.util.ArrayList) binds: [B:64:0x013d, B:60:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r1 == r7) goto L15;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
