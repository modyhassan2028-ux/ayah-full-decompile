package i7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0792b1;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0852n1;
import com.google.android.gms.internal.measurement.C0857o1;
import com.google.android.gms.internal.measurement.C0861p0;
import com.google.android.gms.internal.measurement.C0866q0;
import com.google.android.gms.internal.measurement.C0867q1;
import com.google.android.gms.internal.measurement.C0886u1;
import com.google.android.gms.internal.measurement.C0895w0;
import com.google.android.gms.internal.measurement.C0898w3;
import com.google.android.gms.internal.measurement.C0900x0;
import com.google.android.gms.internal.measurement.InterfaceC0853n2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.C1347b;
import u.C1350e;

/* JADX INFO: renamed from: i7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0969c extends L1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f17271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashSet f17272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1350e f17273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Long f17274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f17275y;

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:202:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x051d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0532  */
    /* JADX WARN: Code duplicated, block: B:230:0x0554  */
    /* JADX WARN: Code duplicated, block: B:231:0x0558  */
    /* JADX WARN: Code duplicated, block: B:236:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0590  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:262:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0621  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:275:0x0695  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0697->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0737  */
    /* JADX WARN: Code duplicated, block: B:322:0x073b  */
    /* JADX WARN: Code duplicated, block: B:326:0x074d  */
    /* JADX WARN: Code duplicated, block: B:332:0x077c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bf A[LOOP:5: B:330:0x0776->B:339:0x07bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:354:0x0810  */
    /* JADX WARN: Code duplicated, block: B:358:0x084b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0873  */
    /* JADX WARN: Code duplicated, block: B:371:0x0884  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b3 A[LOOP:7: B:359:0x084d->B:382:0x08b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:410:0x090c  */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x093e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0955  */
    /* JADX WARN: Code duplicated, block: B:421:0x0963  */
    /* JADX WARN: Code duplicated, block: B:423:0x096e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0999  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2a A[PHI: r16 r20 r21
      0x0a2a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r20v5 u.O) = (r20v6 u.O), (r2v41 u.O) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r21v20 java.util.Iterator) = (r21v21 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:536:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0697->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08ae A[EDGE_INSN: B:553:0x08ae->B:381:0x08ae BREAK  A[LOOP:7: B:359:0x084d->B:382:0x08b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v31, types: [u.O, u.e] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [u.O, u.e] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [i7.u0] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [i7.u0] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [i7.V] */
    /* JADX WARN: Type inference failed for: r3v83, types: [i7.V] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList s(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
        boolean z11;
        boolean z12;
        String str2;
        Map map;
        Object obj;
        ?? r10;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        C1023u0 c1023u0;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        C0857o1 c0857o1;
        BitSet bitSet;
        BitSet bitSet2;
        C1350e c1350e;
        C0857o1 c0857o2;
        C1350e c1350e2;
        List<C0866q0> list3;
        long jLongValue;
        Integer numValueOf;
        int i10;
        boolean z13;
        Iterator it;
        C0867q1 c0867q1;
        Long lValueOf;
        C0999m c0999mG0;
        String str6;
        ?? c1350e3;
        ?? r11;
        Cursor cursorRawQuery;
        ?? r12;
        C1350e c1350e4;
        Iterator it2;
        Integer num;
        C0857o1 c0857o3;
        List list4;
        ?? r18;
        Iterator it3;
        C1023u0 c1023u1;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        C0999m c0999mG1;
        C1023u0 c1023u2;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        u.O o10;
        String strR;
        Map map6;
        Iterator it5;
        Iterator it6;
        u.O o11;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        u.O o12;
        Map map7;
        C0900x0 c0900x0;
        Integer numValueOf3;
        C0966b c0966b;
        int i11;
        Integer numValueOf4;
        C1023u0 c1023u3;
        String str9;
        C1350e c1350e5;
        Cursor cursor;
        C1023u0 c1023u4;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        Y y10;
        ?? c1350e6;
        C0802d1 c0802d1A;
        r rVarU;
        long j;
        String strS;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zA;
        Map map9;
        Y y11;
        Integer num3;
        C0966b c0966b2;
        int iQ;
        Y1 y12;
        boolean z14;
        String str11;
        C1350e c1350e7;
        ?? r13;
        String str12;
        ?? r14;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        C1350e c1350e8;
        int i12;
        ?? r15;
        Object obj3;
        ?? r16;
        ?? r19;
        ?? r110;
        List arrayList5;
        C1023u0 c1023u5 = (C1023u0) this.f16104r;
        U6.y.c(str);
        U6.y.f(list);
        U6.y.f(list2);
        this.f17271u = str;
        this.f17272v = new HashSet();
        this.f17273w = new C1350e();
        this.f17274x = l10;
        this.f17275y = l11;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((C0802d1) it9.next()).s())) {
                z11 = true;
                break;
            }
        }
        C0898w3.a();
        boolean zY = c1023u5.f17582u.y(this.f17271u, G.f16895G0);
        C0898w3.a();
        boolean zY2 = c1023u5.f17582u.y(this.f17271u, G.f16893F0);
        Q1 q10 = this.f17001s;
        if (z11) {
            C0999m c0999mG2 = q10.g0();
            String str13 = this.f17271u;
            c0999mG2.p();
            c0999mG2.o();
            U6.y.c(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                c0999mG2.d0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e10) {
                ((C1023u0) c0999mG2.f16104r).b().s().c(X.w(str13), e10, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objW = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zY2 && zY) {
                        C0999m c0999mG3 = q10.g0();
                        C1023u0 c1023u6 = (C1023u0) c0999mG3.f16104r;
                        String str16 = this.f17271u;
                        U6.y.c(str16);
                        z12 = z11;
                        C1350e c1350e9 = new C1350e();
                        try {
                            ?? Query2 = c0999mG3.d0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    C0866q0 c0866q0 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query2.getBlob(1))).e();
                                                    if (c0866q0.v()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c1350e9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c1350e9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(c0866q0);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e11) {
                                                    r111 = Query2;
                                                    c1023u6.b().s().c(X.w(str16), e11, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e12) {
                                                    e = e12;
                                                    r110 = r111;
                                                    r16 = r110;
                                                    try {
                                                        c1023u6.b().s().c(X.w(str16), e, "Database error querying filters. appId");
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r16 != 0) {
                                                            r16.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r16 != 0) {
                                                            r16.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r16 = r19;
                                                    if (r16 != 0) {
                                                        r16.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                r110 = Query2;
                                                r16 = r110;
                                                c1023u6.b().s().c(X.w(str16), e, "Database error querying filters. appId");
                                                map10 = Collections.EMPTY_MAP;
                                                if (r16 != 0) {
                                                    r16.close();
                                                }
                                                map = map10;
                                                C0999m c0999mG4 = q10.g0();
                                                obj = (C1023u0) c0999mG4.f16104r;
                                                r10 = this.f17271u;
                                                c0999mG4.p();
                                                c0999mG4.o();
                                                U6.y.c(r10);
                                                cursorQuery = c0999mG4.d0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c1350e8 = new C1350e();
                                                    r17 = obj;
                                                    r21 = r10;
                                                    while (true) {
                                                        try {
                                                            i12 = cursorQuery.getInt(0);
                                                            try {
                                                                C0857o1 c0857o4 = (C0857o1) ((C0852n1) C0967b0.b0(C0857o1.x(), cursorQuery.getBlob(1))).e();
                                                                Object objValueOf = Integer.valueOf(i12);
                                                                c1350e8.put(objValueOf, c0857o4);
                                                                str3 = str14;
                                                                obj2 = objW;
                                                                obj3 = objValueOf;
                                                                r15 = r21;
                                                            } catch (IOException e14) {
                                                                V vS = r17.b().s();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objW;
                                                                try {
                                                                    objW = X.w(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i12);
                                                                    vS.d("Failed to merge filter results. appId, audienceId, error", objW, numValueOf8, e14);
                                                                    obj3 = vS;
                                                                    r15 = numValueOf8;
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    r21 = r21;
                                                                    r17.b().s().c(X.w(r21), e, "Database error querying filter results. appId");
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        c1023u0 = c1023u5;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z12) {
                                                                            String str17 = this.f17271u;
                                                                            c0999mG0 = q10.g0();
                                                                            str6 = this.f17271u;
                                                                            c0999mG0.p();
                                                                            c0999mG0.o();
                                                                            U6.y.c(str6);
                                                                            c1350e3 = new C1350e();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = c0999mG0.d0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c1350e3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c1350e3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c1350e3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        ((C1023u0) c0999mG0.f16104r).b().s().c(X.w(str6), e, "Database error querying scoped filters. appId");
                                                                                        c1350e3 = Collections.EMPTY_MAP;
                                                                                        r12 = c1350e3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        U6.y.c(str17);
                                                                                        c1350e4 = new C1350e();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                c0857o3 = (C0857o1) map2.get(num);
                                                                                                list4 = (List) r12.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r12;
                                                                                                it3 = it2;
                                                                                                c1023u1 = c1023u5;
                                                                                                c1350e4.put(num, c0857o3);
                                                                                                r12 = r18;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                c1023u5 = c1023u1;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        c1023u0 = c1023u5;
                                                                                        map3 = c1350e4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            c0857o1 = (C0857o1) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c1350e = new C1350e();
                                                                                            if (c0857o1 != null) {
                                                                                                for (C0792b1 c0792b1 : c0857o1.t()) {
                                                                                                    if (c0792b1.p()) {
                                                                                                        C0857o1 c0857o5 = c0857o1;
                                                                                                        Integer numValueOf9 = Integer.valueOf(c0792b1.q());
                                                                                                        if (c0792b1.r()) {
                                                                                                            lValueOf = Long.valueOf(c0792b1.s());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c1350e.put(numValueOf9, lValueOf);
                                                                                                        c0857o1 = c0857o5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            c0857o2 = c0857o1;
                                                                                            c1350e2 = new C1350e();
                                                                                            if (c0857o2 != null) {
                                                                                                it = c0857o2.v().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    c0867q1 = (C0867q1) it.next();
                                                                                                    if (!c0867q1.p()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (c0857o2 != null) {
                                                                                                i10 = 0;
                                                                                                while (i10 < c0857o2.q() * 64) {
                                                                                                    if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                                                                                                        z13 = zY;
                                                                                                        c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i10);
                                                                                                        if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                                                                                            bitSet.set(i10);
                                                                                                        }
                                                                                                        i10++;
                                                                                                        zY = z13;
                                                                                                    } else {
                                                                                                        z13 = zY;
                                                                                                    }
                                                                                                    c1350e.remove(Integer.valueOf(i10));
                                                                                                    i10++;
                                                                                                    zY = z13;
                                                                                                }
                                                                                            }
                                                                                            boolean z15 = zY;
                                                                                            C0857o1 c0857o6 = (C0857o1) map4.get(num4);
                                                                                            if (zY2) {
                                                                                                for (C0866q0 c0866q1 : list3) {
                                                                                                    int iQ2 = c0866q1.q();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f17275y.longValue() / 1000;
                                                                                                    if (c0866q1.y()) {
                                                                                                        jLongValue = this.f17274x.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iQ2);
                                                                                                    if (c1350e.containsKey(numValueOf)) {
                                                                                                        c1350e.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c1350e2.containsKey(numValueOf)) {
                                                                                                        c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o6, bitSet, bitSet2, c1350e, c1350e2));
                                                                                            map = map;
                                                                                            zY = z15;
                                                                                            map4 = map4;
                                                                                            zY2 = zY2;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r112 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            y10 = new Y(this);
                                                                                            c1350e6 = new C1350e();
                                                                                            for (C0802d1 c0802d1 : list) {
                                                                                                c0802d1A = y10.a(c0802d1, this.f17271u);
                                                                                                if (c0802d1A != null) {
                                                                                                    rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                                                                                                    q10.g0().N("events", rVarU);
                                                                                                    if (z10) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = rVarU.f17523c;
                                                                                                        strS = c0802d1A.s();
                                                                                                        map8 = (Map) c1350e6.get(strS);
                                                                                                        if (map8 == null) {
                                                                                                            C0999m c0999mG5 = q10.g0();
                                                                                                            C1023u0 c1023u7 = (C1023u0) c0999mG5.f16104r;
                                                                                                            str11 = this.f17271u;
                                                                                                            c0999mG5.p();
                                                                                                            c0999mG5.o();
                                                                                                            U6.y.c(str11);
                                                                                                            U6.y.c(strS);
                                                                                                            c1350e7 = new C1350e();
                                                                                                            try {
                                                                                                                Query = c0999mG5.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        C0866q0 c0866q2 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c1350e7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c1350e7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e17) {
                                                                                                                                                e = e17;
                                                                                                                                                r45 = r46;
                                                                                                                                                r14 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    c1023u7.b().s().c(X.w(str12), e, r112);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r14 != 0) {
                                                                                                                                                        r14.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r13 = r14;
                                                                                                                                                    if (r13 != 0) {
                                                                                                                                                        r13.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r13 = r44;
                                                                                                                                                if (r13 != 0) {
                                                                                                                                                    r13.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(c0866q2);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e18) {
                                                                                                                                        r47 = Query;
                                                                                                                                        c1023u7.b().s().c(X.w(str12), e18, str18);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e19) {
                                                                                                                                    e = e19;
                                                                                                                                    r45 = Query;
                                                                                                                                    r14 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    c1023u7.b().s().c(X.w(str12), e, r112);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r14 != 0) {
                                                                                                                                        r14.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    c1350e6.put(strS, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f17272v.contains(num6)) {
                                                                                                                                            c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    y11 = y10;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                C0866q0 c0866q3 = (C0866q0) it8.next();
                                                                                                                                                y11 = y10;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q3, 0);
                                                                                                                                                Long l12 = this.f17274x;
                                                                                                                                                Long l13 = this.f17275y;
                                                                                                                                                iQ = c0866q3.q();
                                                                                                                                                y12 = (Y1) this.f17273w.get(num3);
                                                                                                                                                if (y12 == null) {
                                                                                                                                                    z14 = false;
                                                                                                                                                } else {
                                                                                                                                                    z14 = y12.f17242d.get(iQ);
                                                                                                                                                }
                                                                                                                                                zA = c0966b2.a(l12, l13, c0802d1A, j, rVarU, z14);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.f17272v.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                t(num3).a(c0966b2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                y10 = y11;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.f17272v.add(num3);
                                                                                                                                            }
                                                                                                                                            y10 = y11;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = c1350e7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e20) {
                                                                                                                        e = e20;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    r44 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e21) {
                                                                                                                e = e21;
                                                                                                                str12 = str11;
                                                                                                                r14 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r13 = 0;
                                                                                                            }
                                                                                                            c1350e6.put(strS, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f17272v.contains(num6)) {
                                                                                                                c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        y11 = y10;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    C0866q0 c0866q4 = (C0866q0) it8.next();
                                                                                                                    y11 = y10;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q4, 0);
                                                                                                                    Long l14 = this.f17274x;
                                                                                                                    Long l15 = this.f17275y;
                                                                                                                    iQ = c0866q4.q();
                                                                                                                    y12 = (Y1) this.f17273w.get(num3);
                                                                                                                    if (y12 == null) {
                                                                                                                        z14 = false;
                                                                                                                    } else {
                                                                                                                        z14 = y12.f17242d.get(iQ);
                                                                                                                    }
                                                                                                                    zA = c0966b2.a(l14, l15, c0802d1A, j, rVarU, z14);
                                                                                                                    if (!zA) {
                                                                                                                        this.f17272v.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    t(num3).a(c0966b2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    y10 = y11;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.f17272v.add(num3);
                                                                                                                }
                                                                                                                y10 = y11;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z10) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C1350e c1350e10 = new C1350e();
                                                                                            it4 = list2.iterator();
                                                                                            o10 = c1350e10;
                                                                                            while (it4.hasNext()) {
                                                                                                C0886u1 c0886u1 = (C0886u1) it4.next();
                                                                                                strR = c0886u1.r();
                                                                                                map6 = (Map) o10.get(strR);
                                                                                                if (map6 == null) {
                                                                                                    C0999m c0999mG6 = q10.g0();
                                                                                                    c1023u3 = (C1023u0) c0999mG6.f16104r;
                                                                                                    str9 = this.f17271u;
                                                                                                    c0999mG6.p();
                                                                                                    c0999mG6.o();
                                                                                                    U6.y.c(str9);
                                                                                                    U6.y.c(strR);
                                                                                                    c1350e5 = new C1350e();
                                                                                                    try {
                                                                                                        cursorQuery2 = c0999mG6.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                C0900x0 c0900x1 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c1350e5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    c1023u4 = c1023u3;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c1350e5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e22) {
                                                                                                                                        e = e22;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            c1023u4.b().s().c(X.w(str10), e, r112);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            o10.put(strR, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            o11 = o10;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f17272v.contains(num2)) {
                                                                                                                                                    c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                o12 = o11;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        c0900x0 = (C0900x0) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                                                                                                            V v10 = c1023u0.b().v();
                                                                                                                                                            if (c0900x0.p()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            v10.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                                                                                                            c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (c0900x0.p()) {
                                                                                                                                                        }
                                                                                                                                                        V vT = c1023u0.b().t();
                                                                                                                                                        W w9 = X.w(this.f17271u);
                                                                                                                                                        if (c0900x0.p()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        vT.c(w9, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f17272v.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        o11 = o12;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        o12 = o12;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.f17272v.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    o11 = o12;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    t(num2).a(c0966b);
                                                                                                                                                    iIntValue = i11;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    o12 = o12;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            o10 = o11;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    c1023u4 = c1023u3;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(c0900x1);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e23) {
                                                                                                                                c1023u4 = c1023u3;
                                                                                                                                str10 = str9;
                                                                                                                                c1023u4.b().s().c(X.w(str10), e23, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                c1023u3 = c1023u4;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e24) {
                                                                                                                                e = e24;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                c1023u4.b().s().c(X.w(str10), e, r112);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e25) {
                                                                                                                            e = e25;
                                                                                                                            c1023u4 = c1023u3;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            c1023u4.b().s().c(X.w(str10), e, r112);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            o10.put(strR, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            o11 = o10;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f17272v.contains(num2)) {
                                                                                                                                    c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                o12 = o11;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        c0900x0 = (C0900x0) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                                                                                            V v11 = c1023u0.b().v();
                                                                                                                                            if (c0900x0.p()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            v11.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                                                                                            c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (c0900x0.p()) {
                                                                                                                                        }
                                                                                                                                        V vT2 = c1023u0.b().t();
                                                                                                                                        W w10 = X.w(this.f17271u);
                                                                                                                                        if (c0900x0.p()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        vT2.c(w10, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f17272v.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        o11 = o12;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        o12 = o12;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.f17272v.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    o11 = o12;
                                                                                                                                    it6 = it6;
                                                                                                                                    t(num2).a(c0966b);
                                                                                                                                    iIntValue = i11;
                                                                                                                                    map6 = map7;
                                                                                                                                    o12 = o12;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            o10 = o11;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c1350e5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e26) {
                                                                                                            e = e26;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e27) {
                                                                                                        e = e27;
                                                                                                        it5 = it4;
                                                                                                        c1023u4 = c1023u3;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    o10.put(strR, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                o11 = o10;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f17272v.contains(num2)) {
                                                                                                        c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    o12 = o11;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            c0900x0 = (C0900x0) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                                                                V v12 = c1023u0.b().v();
                                                                                                                if (c0900x0.p()) {
                                                                                                                    numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                v12.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                                                                c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                                                            }
                                                                                                            if (c0900x0.p()) {
                                                                                                            }
                                                                                                            V vT3 = c1023u0.b().t();
                                                                                                            W w11 = X.w(this.f17271u);
                                                                                                            if (c0900x0.p()) {
                                                                                                                numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            vT3.c(w11, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f17272v.add(num2);
                                                                                                            map6 = map7;
                                                                                                            o11 = o12;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            o12 = o12;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.f17272v.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        o11 = o12;
                                                                                                        it6 = it6;
                                                                                                        t(num2).a(c0966b);
                                                                                                        iIntValue = i11;
                                                                                                        map6 = map7;
                                                                                                        o12 = o12;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                o10 = o11;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C1347b<Integer> c1347b = (C1347b) this.f17273w.keySet();
                                                                                        c1347b.removeAll(this.f17272v);
                                                                                        for (Integer num7 : c1347b) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            Y1 y13 = (Y1) this.f17273w.get(num7);
                                                                                            U6.y.f(y13);
                                                                                            com.google.android.gms.internal.measurement.V0 v0B = y13.b(iIntValue3);
                                                                                            arrayList2.add(v0B);
                                                                                            c0999mG1 = q10.g0();
                                                                                            c1023u2 = (C1023u0) c0999mG1.f16104r;
                                                                                            str8 = this.f17271u;
                                                                                            C0857o1 c0857o1R = v0B.r();
                                                                                            c0999mG1.p();
                                                                                            c0999mG1.o();
                                                                                            U6.y.c(str8);
                                                                                            U6.y.f(c0857o1R);
                                                                                            byte[] bArrA = c0857o1R.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e28) {
                                                                                                    e = e28;
                                                                                                    c1023u2.b().s().c(X.w(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e29) {
                                                                                                e = e29;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e30) {
                                                                                    e = e30;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r11 = 0;
                                                                                    if (r11 != 0) {
                                                                                        r11.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r12 = c1350e3;
                                                                                U6.y.c(str17);
                                                                                c1350e4 = new C1350e();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        c0857o3 = (C0857o1) map2.get(num);
                                                                                        list4 = (List) r12.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r12;
                                                                                        it3 = it2;
                                                                                        c1023u1 = c1023u5;
                                                                                        c1350e4.put(num, c0857o3);
                                                                                        r12 = r18;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        c1023u5 = c1023u1;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                c1023u0 = c1023u5;
                                                                                map3 = c1350e4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r11 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            c1023u0 = c1023u5;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            c0857o1 = (C0857o1) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c1350e = new C1350e();
                                                                            if (c0857o1 != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (c0792b1.p()) {
                                                                                        C0857o1 c0857o7 = c0857o1;
                                                                                        Integer numValueOf10 = Integer.valueOf(c0792b1.q());
                                                                                        if (c0792b1.r()) {
                                                                                            lValueOf = Long.valueOf(c0792b1.s());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c1350e.put(numValueOf10, lValueOf);
                                                                                        c0857o1 = c0857o7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            c0857o2 = c0857o1;
                                                                            c1350e2 = new C1350e();
                                                                            if (c0857o2 != null) {
                                                                                it = c0857o2.v().iterator();
                                                                                while (it.hasNext()) {
                                                                                    c0867q1 = (C0867q1) it.next();
                                                                                    if (!c0867q1.p()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (c0857o2 != null) {
                                                                                i10 = 0;
                                                                                while (i10 < c0857o2.q() * 64) {
                                                                                    if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                                                                                        z13 = zY;
                                                                                        c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i10);
                                                                                        if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                                                                            bitSet.set(i10);
                                                                                        }
                                                                                        i10++;
                                                                                        zY = z13;
                                                                                    } else {
                                                                                        z13 = zY;
                                                                                    }
                                                                                    c1350e.remove(Integer.valueOf(i10));
                                                                                    i10++;
                                                                                    zY = z13;
                                                                                }
                                                                            }
                                                                            boolean z16 = zY;
                                                                            C0857o1 c0857o8 = (C0857o1) map4.get(num4);
                                                                            if (zY2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iQ3 = c0866q1.q();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f17275y.longValue() / 1000;
                                                                                    if (c0866q1.y()) {
                                                                                        jLongValue = this.f17274x.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iQ3);
                                                                                    if (c1350e.containsKey(numValueOf)) {
                                                                                        c1350e.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c1350e2.containsKey(numValueOf)) {
                                                                                        c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o8, bitSet, bitSet2, c1350e, c1350e2));
                                                                            map = map;
                                                                            zY = z16;
                                                                            map4 = map4;
                                                                            zY2 = zY2;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r113 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        y10 = new Y(this);
                                                                        c1350e6 = new C1350e();
                                                                        while (r17.hasNext()) {
                                                                            c0802d1A = y10.a(c0802d1, this.f17271u);
                                                                            if (c0802d1A != null) {
                                                                                rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                                                                                q10.g0().N("events", rVarU);
                                                                                if (z10) {
                                                                                    j = rVarU.f17523c;
                                                                                    strS = c0802d1A.s();
                                                                                    map8 = (Map) c1350e6.get(strS);
                                                                                    if (map8 == null) {
                                                                                        C0999m c0999mG7 = q10.g0();
                                                                                        C1023u0 c1023u8 = (C1023u0) c0999mG7.f16104r;
                                                                                        str11 = this.f17271u;
                                                                                        c0999mG7.p();
                                                                                        c0999mG7.o();
                                                                                        U6.y.c(str11);
                                                                                        U6.y.c(strS);
                                                                                        c1350e7 = new C1350e();
                                                                                        Query = c0999mG7.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                C0866q0 c0866q5 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c1350e7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c1350e7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(c0866q5);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = c1350e7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        c1350e6.put(strS, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f17272v.contains(num6)) {
                                                                                            c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    y11 = y10;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                C0866q0 c0866q6 = (C0866q0) it8.next();
                                                                                                y11 = y10;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q6, 0);
                                                                                                Long l16 = this.f17274x;
                                                                                                Long l17 = this.f17275y;
                                                                                                iQ = c0866q6.q();
                                                                                                y12 = (Y1) this.f17273w.get(num3);
                                                                                                if (y12 == null) {
                                                                                                    z14 = false;
                                                                                                } else {
                                                                                                    z14 = y12.f17242d.get(iQ);
                                                                                                }
                                                                                                zA = c0966b2.a(l16, l17, c0802d1A, j, rVarU, z14);
                                                                                                if (!zA) {
                                                                                                    this.f17272v.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                t(num3).a(c0966b2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                y10 = y11;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.f17272v.add(num3);
                                                                                            }
                                                                                            y10 = y11;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C1350e c1350e11 = new C1350e();
                                                                        it4 = list2.iterator();
                                                                        o10 = c1350e11;
                                                                        while (it4.hasNext()) {
                                                                            C0886u1 c0886u2 = (C0886u1) it4.next();
                                                                            strR = c0886u2.r();
                                                                            map6 = (Map) o10.get(strR);
                                                                            if (map6 == null) {
                                                                                C0999m c0999mG8 = q10.g0();
                                                                                c1023u3 = (C1023u0) c0999mG8.f16104r;
                                                                                str9 = this.f17271u;
                                                                                c0999mG8.p();
                                                                                c0999mG8.o();
                                                                                U6.y.c(str9);
                                                                                U6.y.c(strR);
                                                                                c1350e5 = new C1350e();
                                                                                cursorQuery2 = c0999mG8.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        C0900x0 c0900x2 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c1350e5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            c1023u4 = c1023u3;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c1350e5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            c1023u4 = c1023u3;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(c0900x2);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        c1023u3 = c1023u4;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c1350e5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                o10.put(strR, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            o11 = o10;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f17272v.contains(num2)) {
                                                                                    c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                o12 = o11;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        c0900x0 = (C0900x0) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                                            V v13 = c1023u0.b().v();
                                                                                            if (c0900x0.p()) {
                                                                                                numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            v13.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                                            c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                                        }
                                                                                        if (c0900x0.p()) {
                                                                                        }
                                                                                        V vT4 = c1023u0.b().t();
                                                                                        W w12 = X.w(this.f17271u);
                                                                                        if (c0900x0.p()) {
                                                                                            numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        vT4.c(w12, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f17272v.add(num2);
                                                                                        map6 = map7;
                                                                                        o11 = o12;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        o12 = o12;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.f17272v.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    o11 = o12;
                                                                                    it6 = it6;
                                                                                    t(num2).a(c0966b);
                                                                                    iIntValue = i11;
                                                                                    map6 = map7;
                                                                                    o12 = o12;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            o10 = o11;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C1347b<Integer> c1347b2 = (C1347b) this.f17273w.keySet();
                                                                    c1347b2.removeAll(this.f17272v);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        Y1 y14 = (Y1) this.f17273w.get(num7);
                                                                        U6.y.f(y14);
                                                                        com.google.android.gms.internal.measurement.V0 v0B2 = y14.b(iIntValue4);
                                                                        arrayList2.add(v0B2);
                                                                        c0999mG1 = q10.g0();
                                                                        c1023u2 = (C1023u0) c0999mG1.f16104r;
                                                                        str8 = this.f17271u;
                                                                        C0857o1 c0857o1R2 = v0B2.r();
                                                                        c0999mG1.p();
                                                                        c0999mG1.o();
                                                                        U6.y.c(str8);
                                                                        U6.y.f(c0857o1R2);
                                                                        byte[] bArrA2 = c0857o1R2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objW = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e31) {
                                                                e = e31;
                                                                r17.b().s().c(X.w(r21), e, "Database error querying filter results. appId");
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e32) {
                                                            e = e32;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objW;
                                                            r21 = r21;
                                                            r17.b().s().c(X.w(r21), e, "Database error querying filter results. appId");
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                c1023u0 = c1023u5;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z12) {
                                                                    String str110 = this.f17271u;
                                                                    c0999mG0 = q10.g0();
                                                                    str6 = this.f17271u;
                                                                    c0999mG0.p();
                                                                    c0999mG0.o();
                                                                    U6.y.c(str6);
                                                                    c1350e3 = new C1350e();
                                                                    cursorRawQuery = c0999mG0.d0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c1350e3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c1350e3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c1350e3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r12 = c1350e3;
                                                                    U6.y.c(str110);
                                                                    c1350e4 = new C1350e();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            c0857o3 = (C0857o1) map2.get(num);
                                                                            list4 = (List) r12.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r12;
                                                                            it3 = it2;
                                                                            c1023u1 = c1023u5;
                                                                            c1350e4.put(num, c0857o3);
                                                                            r12 = r18;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            c1023u5 = c1023u1;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    c1023u0 = c1023u5;
                                                                    map3 = c1350e4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    c1023u0 = c1023u5;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    c0857o1 = (C0857o1) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c1350e = new C1350e();
                                                                    if (c0857o1 != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (c0792b1.p()) {
                                                                                C0857o1 c0857o9 = c0857o1;
                                                                                Integer numValueOf11 = Integer.valueOf(c0792b1.q());
                                                                                if (c0792b1.r()) {
                                                                                    lValueOf = Long.valueOf(c0792b1.s());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c1350e.put(numValueOf11, lValueOf);
                                                                                c0857o1 = c0857o9;
                                                                            }
                                                                        }
                                                                    }
                                                                    c0857o2 = c0857o1;
                                                                    c1350e2 = new C1350e();
                                                                    if (c0857o2 != null) {
                                                                        it = c0857o2.v().iterator();
                                                                        while (it.hasNext()) {
                                                                            c0867q1 = (C0867q1) it.next();
                                                                            if (!c0867q1.p()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (c0857o2 != null) {
                                                                        i10 = 0;
                                                                        while (i10 < c0857o2.q() * 64) {
                                                                            if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                                                                                z13 = zY;
                                                                                c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i10);
                                                                                if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                                                                    bitSet.set(i10);
                                                                                }
                                                                                i10++;
                                                                                zY = z13;
                                                                            } else {
                                                                                z13 = zY;
                                                                            }
                                                                            c1350e.remove(Integer.valueOf(i10));
                                                                            i10++;
                                                                            zY = z13;
                                                                        }
                                                                    }
                                                                    boolean z17 = zY;
                                                                    C0857o1 c0857o10 = (C0857o1) map4.get(num4);
                                                                    if (zY2) {
                                                                        while (r2.hasNext()) {
                                                                            int iQ4 = c0866q1.q();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f17275y.longValue() / 1000;
                                                                            if (c0866q1.y()) {
                                                                                jLongValue = this.f17274x.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iQ4);
                                                                            if (c1350e.containsKey(numValueOf)) {
                                                                                c1350e.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c1350e2.containsKey(numValueOf)) {
                                                                                c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o10, bitSet, bitSet2, c1350e, c1350e2));
                                                                    map = map;
                                                                    zY = z17;
                                                                    map4 = map4;
                                                                    zY2 = zY2;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r114 = obj2;
                                                            if (!list.isEmpty()) {
                                                                y10 = new Y(this);
                                                                c1350e6 = new C1350e();
                                                                while (r17.hasNext()) {
                                                                    c0802d1A = y10.a(c0802d1, this.f17271u);
                                                                    if (c0802d1A != null) {
                                                                        rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                                                                        q10.g0().N("events", rVarU);
                                                                        if (z10) {
                                                                            j = rVarU.f17523c;
                                                                            strS = c0802d1A.s();
                                                                            map8 = (Map) c1350e6.get(strS);
                                                                            if (map8 == null) {
                                                                                C0999m c0999mG9 = q10.g0();
                                                                                C1023u0 c1023u9 = (C1023u0) c0999mG9.f16104r;
                                                                                str11 = this.f17271u;
                                                                                c0999mG9.p();
                                                                                c0999mG9.o();
                                                                                U6.y.c(str11);
                                                                                U6.y.c(strS);
                                                                                c1350e7 = new C1350e();
                                                                                Query = c0999mG9.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        C0866q0 c0866q7 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c1350e7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c1350e7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(c0866q7);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = c1350e7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                c1350e6.put(strS, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f17272v.contains(num6)) {
                                                                                    c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            y11 = y10;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        C0866q0 c0866q8 = (C0866q0) it8.next();
                                                                                        y11 = y10;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q8, 0);
                                                                                        Long l18 = this.f17274x;
                                                                                        Long l19 = this.f17275y;
                                                                                        iQ = c0866q8.q();
                                                                                        y12 = (Y1) this.f17273w.get(num3);
                                                                                        if (y12 == null) {
                                                                                            z14 = false;
                                                                                        } else {
                                                                                            z14 = y12.f17242d.get(iQ);
                                                                                        }
                                                                                        zA = c0966b2.a(l18, l19, c0802d1A, j, rVarU, z14);
                                                                                        if (!zA) {
                                                                                            this.f17272v.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        t(num3).a(c0966b2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        y10 = y11;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.f17272v.add(num3);
                                                                                    }
                                                                                    y10 = y11;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z10) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C1350e c1350e12 = new C1350e();
                                                                it4 = list2.iterator();
                                                                o10 = c1350e12;
                                                                while (it4.hasNext()) {
                                                                    C0886u1 c0886u3 = (C0886u1) it4.next();
                                                                    strR = c0886u3.r();
                                                                    map6 = (Map) o10.get(strR);
                                                                    if (map6 == null) {
                                                                        C0999m c0999mG10 = q10.g0();
                                                                        c1023u3 = (C1023u0) c0999mG10.f16104r;
                                                                        str9 = this.f17271u;
                                                                        c0999mG10.p();
                                                                        c0999mG10.o();
                                                                        U6.y.c(str9);
                                                                        U6.y.c(strR);
                                                                        c1350e5 = new C1350e();
                                                                        cursorQuery2 = c0999mG10.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                C0900x0 c0900x3 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c1350e5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    c1023u4 = c1023u3;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c1350e5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    c1023u4 = c1023u3;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(c0900x3);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                c1023u3 = c1023u4;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c1350e5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        o10.put(strR, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    o11 = o10;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f17272v.contains(num2)) {
                                                                            c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        o12 = o11;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                c0900x0 = (C0900x0) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                                    V v14 = c1023u0.b().v();
                                                                                    if (c0900x0.p()) {
                                                                                        numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    v14.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                                    c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                                }
                                                                                if (c0900x0.p()) {
                                                                                }
                                                                                V vT5 = c1023u0.b().t();
                                                                                W w13 = X.w(this.f17271u);
                                                                                if (c0900x0.p()) {
                                                                                    numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                vT5.c(w13, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f17272v.add(num2);
                                                                                map6 = map7;
                                                                                o11 = o12;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                o12 = o12;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.f17272v.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            o11 = o12;
                                                                            it6 = it6;
                                                                            t(num2).a(c0966b);
                                                                            iIntValue = i11;
                                                                            map6 = map7;
                                                                            o12 = o12;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    o10 = o11;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C1347b<Integer> c1347b3 = (C1347b) this.f17273w.keySet();
                                                            c1347b3.removeAll(this.f17272v);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                Y1 y15 = (Y1) this.f17273w.get(num7);
                                                                U6.y.f(y15);
                                                                com.google.android.gms.internal.measurement.V0 v0B3 = y15.b(iIntValue5);
                                                                arrayList2.add(v0B3);
                                                                c0999mG1 = q10.g0();
                                                                c1023u2 = (C1023u0) c0999mG1.f16104r;
                                                                str8 = this.f17271u;
                                                                C0857o1 c0857o1R3 = v0B3.r();
                                                                c0999mG1.p();
                                                                c0999mG1.o();
                                                                U6.y.c(str8);
                                                                U6.y.f(c0857o1R3);
                                                                byte[] bArrA3 = c0857o1R3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r10 = r15;
                                                    map2 = c1350e8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r10 = r10;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    c1023u0 = c1023u5;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str112 = this.f17271u;
                                                        c0999mG0 = q10.g0();
                                                        str6 = this.f17271u;
                                                        c0999mG0.p();
                                                        c0999mG0.o();
                                                        U6.y.c(str6);
                                                        c1350e3 = new C1350e();
                                                        cursorRawQuery = c0999mG0.d0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c1350e3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c1350e3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c1350e3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r12 = c1350e3;
                                                        U6.y.c(str112);
                                                        c1350e4 = new C1350e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                c0857o3 = (C0857o1) map2.get(num);
                                                                list4 = (List) r12.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r12;
                                                                it3 = it2;
                                                                c1023u1 = c1023u5;
                                                                c1350e4.put(num, c0857o3);
                                                                r12 = r18;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                c1023u5 = c1023u1;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        c1023u0 = c1023u5;
                                                        map3 = c1350e4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        c1023u0 = c1023u5;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        c0857o1 = (C0857o1) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c1350e = new C1350e();
                                                        if (c0857o1 != null) {
                                                            while (r3.hasNext()) {
                                                                if (c0792b1.p()) {
                                                                    C0857o1 c0857o11 = c0857o1;
                                                                    Integer numValueOf12 = Integer.valueOf(c0792b1.q());
                                                                    if (c0792b1.r()) {
                                                                        lValueOf = Long.valueOf(c0792b1.s());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c1350e.put(numValueOf12, lValueOf);
                                                                    c0857o1 = c0857o11;
                                                                }
                                                            }
                                                        }
                                                        c0857o2 = c0857o1;
                                                        c1350e2 = new C1350e();
                                                        if (c0857o2 != null) {
                                                            it = c0857o2.v().iterator();
                                                            while (it.hasNext()) {
                                                                c0867q1 = (C0867q1) it.next();
                                                                if (!c0867q1.p()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (c0857o2 != null) {
                                                            i10 = 0;
                                                            while (i10 < c0857o2.q() * 64) {
                                                                if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                                                                    z13 = zY;
                                                                    c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i10);
                                                                    if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                                                        bitSet.set(i10);
                                                                    }
                                                                    i10++;
                                                                    zY = z13;
                                                                } else {
                                                                    z13 = zY;
                                                                }
                                                                c1350e.remove(Integer.valueOf(i10));
                                                                i10++;
                                                                zY = z13;
                                                            }
                                                        }
                                                        boolean z18 = zY;
                                                        C0857o1 c0857o12 = (C0857o1) map4.get(num4);
                                                        if (zY2) {
                                                            while (r2.hasNext()) {
                                                                int iQ5 = c0866q1.q();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f17275y.longValue() / 1000;
                                                                if (c0866q1.y()) {
                                                                    jLongValue = this.f17274x.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iQ5);
                                                                if (c1350e.containsKey(numValueOf)) {
                                                                    c1350e.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c1350e2.containsKey(numValueOf)) {
                                                                    c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o12, bitSet, bitSet2, c1350e, c1350e2));
                                                        map = map;
                                                        zY = z18;
                                                        map4 = map4;
                                                        zY2 = zY2;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r115 = obj2;
                                                if (!list.isEmpty()) {
                                                    y10 = new Y(this);
                                                    c1350e6 = new C1350e();
                                                    while (r17.hasNext()) {
                                                        c0802d1A = y10.a(c0802d1, this.f17271u);
                                                        if (c0802d1A != null) {
                                                            rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                                                            q10.g0().N("events", rVarU);
                                                            if (z10) {
                                                                j = rVarU.f17523c;
                                                                strS = c0802d1A.s();
                                                                map8 = (Map) c1350e6.get(strS);
                                                                if (map8 == null) {
                                                                    C0999m c0999mG11 = q10.g0();
                                                                    C1023u0 c1023u10 = (C1023u0) c0999mG11.f16104r;
                                                                    str11 = this.f17271u;
                                                                    c0999mG11.p();
                                                                    c0999mG11.o();
                                                                    U6.y.c(str11);
                                                                    U6.y.c(strS);
                                                                    c1350e7 = new C1350e();
                                                                    Query = c0999mG11.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            C0866q0 c0866q9 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c1350e7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c1350e7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(c0866q9);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = c1350e7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    c1350e6.put(strS, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f17272v.contains(num6)) {
                                                                        c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                y11 = y10;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            C0866q0 c0866q10 = (C0866q0) it8.next();
                                                                            y11 = y10;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q10, 0);
                                                                            Long l110 = this.f17274x;
                                                                            Long l111 = this.f17275y;
                                                                            iQ = c0866q10.q();
                                                                            y12 = (Y1) this.f17273w.get(num3);
                                                                            if (y12 == null) {
                                                                                z14 = false;
                                                                            } else {
                                                                                z14 = y12.f17242d.get(iQ);
                                                                            }
                                                                            zA = c0966b2.a(l110, l111, c0802d1A, j, rVarU, z14);
                                                                            if (!zA) {
                                                                                this.f17272v.add(num3);
                                                                                break;
                                                                            }
                                                                            t(num3).a(c0966b2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            y10 = y11;
                                                                        }
                                                                        if (!zA) {
                                                                            this.f17272v.add(num3);
                                                                        }
                                                                        y10 = y11;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C1350e c1350e13 = new C1350e();
                                                    it4 = list2.iterator();
                                                    o10 = c1350e13;
                                                    while (it4.hasNext()) {
                                                        C0886u1 c0886u4 = (C0886u1) it4.next();
                                                        strR = c0886u4.r();
                                                        map6 = (Map) o10.get(strR);
                                                        if (map6 == null) {
                                                            C0999m c0999mG12 = q10.g0();
                                                            c1023u3 = (C1023u0) c0999mG12.f16104r;
                                                            str9 = this.f17271u;
                                                            c0999mG12.p();
                                                            c0999mG12.o();
                                                            U6.y.c(str9);
                                                            U6.y.c(strR);
                                                            c1350e5 = new C1350e();
                                                            cursorQuery2 = c0999mG12.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    C0900x0 c0900x4 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c1350e5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        c1023u4 = c1023u3;
                                                                        arrayList3 = new ArrayList();
                                                                        c1350e5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        c1023u4 = c1023u3;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(c0900x4);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    c1023u3 = c1023u4;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c1350e5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            o10.put(strR, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        o11 = o10;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f17272v.contains(num2)) {
                                                                c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            o12 = o11;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    c0900x0 = (C0900x0) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                                        V v15 = c1023u0.b().v();
                                                                        if (c0900x0.p()) {
                                                                            numValueOf4 = Integer.valueOf(c0900x0.q());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        v15.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                                        c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                                                    }
                                                                    if (c0900x0.p()) {
                                                                    }
                                                                    V vT6 = c1023u0.b().t();
                                                                    W w14 = X.w(this.f17271u);
                                                                    if (c0900x0.p()) {
                                                                        numValueOf3 = Integer.valueOf(c0900x0.q());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    vT6.c(w14, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f17272v.add(num2);
                                                                    map6 = map7;
                                                                    o11 = o12;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    o12 = o12;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.f17272v.add(num2);
                                                                }
                                                                map6 = map7;
                                                                o11 = o12;
                                                                it6 = it6;
                                                                t(num2).a(c0966b);
                                                                iIntValue = i11;
                                                                map6 = map7;
                                                                o12 = o12;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        o10 = o11;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C1347b<Integer> c1347b4 = (C1347b) this.f17273w.keySet();
                                                c1347b4.removeAll(this.f17272v);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    Y1 y16 = (Y1) this.f17273w.get(num7);
                                                    U6.y.f(y16);
                                                    com.google.android.gms.internal.measurement.V0 v0B4 = y16.b(iIntValue6);
                                                    arrayList2.add(v0B4);
                                                    c0999mG1 = q10.g0();
                                                    c1023u2 = (C1023u0) c0999mG1.f16104r;
                                                    str8 = this.f17271u;
                                                    C0857o1 c0857o1R4 = v0B4.r();
                                                    c0999mG1.p();
                                                    c0999mG1.o();
                                                    U6.y.c(str8);
                                                    U6.y.f(c0857o1R4);
                                                    byte[] bArrA4 = c0857o1R4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c1350e9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e33) {
                                e = e33;
                                str2 = "data";
                            }
                        } catch (SQLiteException e34) {
                            e = e34;
                            str2 = "data";
                            r16 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r16 = 0;
                        }
                        C0999m c0999mG13 = q10.g0();
                        obj = (C1023u0) c0999mG13.f16104r;
                        r10 = this.f17271u;
                        c0999mG13.p();
                        c0999mG13.o();
                        U6.y.c(r10);
                        cursorQuery = c0999mG13.d0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r10 = r10;
                        } else {
                            c1350e8 = new C1350e();
                            r17 = obj;
                            r21 = r10;
                            while (true) {
                                i12 = cursorQuery.getInt(0);
                                C0857o1 c0857o13 = (C0857o1) ((C0852n1) C0967b0.b0(C0857o1.x(), cursorQuery.getBlob(1))).e();
                                Object objValueOf2 = Integer.valueOf(i12);
                                c1350e8.put(objValueOf2, c0857o13);
                                str3 = str14;
                                obj2 = objW;
                                obj3 = objValueOf2;
                                r15 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objW = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r10 = r15;
                            map2 = c1350e8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            c1023u0 = c1023u5;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z12) {
                                String str114 = this.f17271u;
                                c0999mG0 = q10.g0();
                                str6 = this.f17271u;
                                c0999mG0.p();
                                c0999mG0.o();
                                U6.y.c(str6);
                                c1350e3 = new C1350e();
                                cursorRawQuery = c0999mG0.d0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c1350e3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c1350e3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c1350e3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r12 = c1350e3;
                                U6.y.c(str114);
                                c1350e4 = new C1350e();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        c0857o3 = (C0857o1) map2.get(num);
                                        list4 = (List) r12.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r12;
                                            it3 = it2;
                                            c1023u1 = c1023u5;
                                            c1350e4.put(num, c0857o3);
                                            r12 = r18;
                                            str15 = str15;
                                            it2 = it3;
                                            c1023u5 = c1023u1;
                                        } else {
                                            ?? r116 = r12;
                                            it3 = it2;
                                            List listX = q10.j0().X((InterfaceC0853n2) c0857o3.r(), list4);
                                            if (listX.isEmpty()) {
                                                r12 = r116;
                                                it2 = it3;
                                            } else {
                                                C0852n1 c0852n1 = (C0852n1) c0857o3.i();
                                                c0852n1.i();
                                                c0852n1.b();
                                                ((C0857o1) c0852n1.f14329s).B(listX);
                                                List listX2 = q10.j0().X((InterfaceC0853n2) c0857o3.p(), list4);
                                                c0852n1.h();
                                                c0852n1.b();
                                                ((C0857o1) c0852n1.f14329s).z(listX2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = c0857o3.t().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    C0792b1 c0792b2 = (C0792b1) it10.next();
                                                    C1023u0 c1023u11 = c1023u5;
                                                    if (!list4.contains(Integer.valueOf(c0792b2.q()))) {
                                                        arrayList6.add(c0792b2);
                                                    }
                                                    it10 = it11;
                                                    c1023u5 = c1023u11;
                                                }
                                                c1023u1 = c1023u5;
                                                c0852n1.j();
                                                c0852n1.b();
                                                ((C0857o1) c0852n1.f14329s).D(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (C0867q1 c0867q2 : c0857o3.v()) {
                                                    if (!list4.contains(Integer.valueOf(c0867q2.q()))) {
                                                        arrayList7.add(c0867q2);
                                                    }
                                                }
                                                c0852n1.k();
                                                c0852n1.b();
                                                ((C0857o1) c0852n1.f14329s).F(arrayList7);
                                                c1350e4.put(num, (C0857o1) c0852n1.e());
                                                r18 = r116;
                                                r12 = r18;
                                                str15 = str15;
                                                it2 = it3;
                                                c1023u5 = c1023u1;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                c1023u0 = c1023u5;
                                map3 = c1350e4;
                            } else {
                                str4 = "audience_id";
                                c1023u0 = c1023u5;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                c0857o1 = (C0857o1) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c1350e = new C1350e();
                                if (c0857o1 != null && c0857o1.u() != 0) {
                                    while (r3.hasNext()) {
                                        if (c0792b1.p()) {
                                            C0857o1 c0857o14 = c0857o1;
                                            Integer numValueOf13 = Integer.valueOf(c0792b1.q());
                                            if (c0792b1.r()) {
                                                lValueOf = Long.valueOf(c0792b1.s());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c1350e.put(numValueOf13, lValueOf);
                                            c0857o1 = c0857o14;
                                        }
                                    }
                                }
                                c0857o2 = c0857o1;
                                c1350e2 = new C1350e();
                                if (c0857o2 != null && c0857o2.w() != 0) {
                                    it = c0857o2.v().iterator();
                                    while (it.hasNext()) {
                                        c0867q1 = (C0867q1) it.next();
                                        if (!c0867q1.p() && c0867q1.s() > 0) {
                                            c1350e2.put(Integer.valueOf(c0867q1.q()), Long.valueOf(c0867q1.t(c0867q1.s() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (c0857o2 != null) {
                                    i10 = 0;
                                    while (i10 < c0857o2.q() * 64) {
                                        if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                                            z13 = zY;
                                            c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i10);
                                            if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                                bitSet.set(i10);
                                            }
                                            i10++;
                                            zY = z13;
                                        } else {
                                            z13 = zY;
                                        }
                                        c1350e.remove(Integer.valueOf(i10));
                                        i10++;
                                        zY = z13;
                                    }
                                }
                                boolean z19 = zY;
                                C0857o1 c0857o15 = (C0857o1) map4.get(num4);
                                if (zY2 && z19 && (list3 = (List) map.get(num4)) != null && this.f17275y != null && this.f17274x != null) {
                                    while (r2.hasNext()) {
                                        int iQ6 = c0866q1.q();
                                        Integer num11 = num4;
                                        jLongValue = this.f17275y.longValue() / 1000;
                                        if (c0866q1.y()) {
                                            jLongValue = this.f17274x.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iQ6);
                                        if (c1350e.containsKey(numValueOf)) {
                                            c1350e.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (c1350e2.containsKey(numValueOf)) {
                                            c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o15, bitSet, bitSet2, c1350e, c1350e2));
                                map = map;
                                zY = z19;
                                map4 = map4;
                                zY2 = zY2;
                                str3 = str3;
                                map5 = map110;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r117 = obj2;
                        if (!list.isEmpty()) {
                            y10 = new Y(this);
                            c1350e6 = new C1350e();
                            while (r17.hasNext()) {
                                c0802d1A = y10.a(c0802d1, this.f17271u);
                                if (c0802d1A != null) {
                                    rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                                    q10.g0().N("events", rVarU);
                                    if (z10) {
                                        j = rVarU.f17523c;
                                        strS = c0802d1A.s();
                                        map8 = (Map) c1350e6.get(strS);
                                        if (map8 == null) {
                                            C0999m c0999mG14 = q10.g0();
                                            C1023u0 c1023u12 = (C1023u0) c0999mG14.f16104r;
                                            str11 = this.f17271u;
                                            c0999mG14.p();
                                            c0999mG14.o();
                                            U6.y.c(str11);
                                            U6.y.c(strS);
                                            c1350e7 = new C1350e();
                                            Query = c0999mG14.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    C0866q0 c0866q11 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) c1350e7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        c1350e7.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(c0866q11);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = c1350e7;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            c1350e6.put(strS, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.f17272v.contains(num6)) {
                                                c1023u0.b().v().b(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zA = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        y11 = y10;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    C0866q0 c0866q12 = (C0866q0) it8.next();
                                                    y11 = y10;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q12, 0);
                                                    Long l112 = this.f17274x;
                                                    Long l113 = this.f17275y;
                                                    iQ = c0866q12.q();
                                                    y12 = (Y1) this.f17273w.get(num3);
                                                    if (y12 == null) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = y12.f17242d.get(iQ);
                                                    }
                                                    zA = c0966b2.a(l112, l113, c0802d1A, j, rVarU, z14);
                                                    if (!zA) {
                                                        this.f17272v.add(num3);
                                                        break;
                                                    }
                                                    t(num3).a(c0966b2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    y10 = y11;
                                                }
                                                if (!zA) {
                                                    this.f17272v.add(num3);
                                                }
                                                y10 = y11;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            C1350e c1350e14 = new C1350e();
                            it4 = list2.iterator();
                            o10 = c1350e14;
                            while (it4.hasNext()) {
                                C0886u1 c0886u5 = (C0886u1) it4.next();
                                strR = c0886u5.r();
                                map6 = (Map) o10.get(strR);
                                if (map6 == null) {
                                    C0999m c0999mG15 = q10.g0();
                                    c1023u3 = (C1023u0) c0999mG15.f16104r;
                                    str9 = this.f17271u;
                                    c0999mG15.p();
                                    c0999mG15.o();
                                    U6.y.c(str9);
                                    U6.y.c(strR);
                                    c1350e5 = new C1350e();
                                    cursorQuery2 = c0999mG15.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            C0900x0 c0900x5 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c1350e5.get(numValueOf5);
                                            if (list5 == null) {
                                                c1023u4 = c1023u3;
                                                arrayList3 = new ArrayList();
                                                c1350e5.put(numValueOf5, arrayList3);
                                            } else {
                                                c1023u4 = c1023u3;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(c0900x5);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            c1023u3 = c1023u4;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = c1350e5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    o10.put(strR, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                o11 = o10;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.f17272v.contains(num2)) {
                                        c1023u0.b().v().b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zB = true;
                                    o12 = o11;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            c0900x0 = (C0900x0) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                                V v16 = c1023u0.b().v();
                                                if (c0900x0.p()) {
                                                    numValueOf4 = Integer.valueOf(c0900x0.q());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                v16.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                                c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                                            }
                                            if (c0900x0.p() || c0900x0.q() > 256) {
                                                V vT7 = c1023u0.b().t();
                                                W w15 = X.w(this.f17271u);
                                                if (c0900x0.p()) {
                                                    numValueOf3 = Integer.valueOf(c0900x0.q());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                vT7.c(w15, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.f17272v.add(num2);
                                                map6 = map7;
                                                o11 = o12;
                                                it6 = it6;
                                            } else {
                                                i11 = iIntValue;
                                                c0966b = new C0966b(this, this.f17271u, i11, c0900x0, 1);
                                                Long l20 = this.f17274x;
                                                Long l21 = this.f17275y;
                                                int iQ7 = c0900x0.q();
                                                Y1 y17 = (Y1) this.f17273w.get(num2);
                                                zB = c0966b.b(l20, l21, c0886u5, y17 == null ? false : y17.f17242d.get(iQ7));
                                                if (zB) {
                                                    t(num2).a(c0966b);
                                                    iIntValue = i11;
                                                    map6 = map7;
                                                    o12 = o12;
                                                    it6 = it6;
                                                } else {
                                                    this.f17272v.add(num2);
                                                    o12 = o12;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            o12 = o12;
                                            it6 = it6;
                                        }
                                        if (!zB) {
                                            this.f17272v.add(num2);
                                        }
                                        map6 = map7;
                                        o11 = o12;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                o10 = o11;
                            }
                        }
                        arrayList2 = new ArrayList();
                        C1347b<Integer> c1347b5 = (C1347b) this.f17273w.keySet();
                        c1347b5.removeAll(this.f17272v);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            Y1 y18 = (Y1) this.f17273w.get(num7);
                            U6.y.f(y18);
                            com.google.android.gms.internal.measurement.V0 v0B5 = y18.b(iIntValue7);
                            arrayList2.add(v0B5);
                            c0999mG1 = q10.g0();
                            c1023u2 = (C1023u0) c0999mG1.f16104r;
                            str8 = this.f17271u;
                            C0857o1 c0857o1R5 = v0B5.r();
                            c0999mG1.p();
                            c0999mG1.o();
                            U6.y.c(str8);
                            U6.y.f(c0857o1R5);
                            byte[] bArrA5 = c0857o1R5.a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z12 = z11;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r10 = r10;
                    } else {
                        c1350e8 = new C1350e();
                        r17 = obj;
                        r21 = r10;
                        while (true) {
                            i12 = cursorQuery.getInt(0);
                            C0857o1 c0857o16 = (C0857o1) ((C0852n1) C0967b0.b0(C0857o1.x(), cursorQuery.getBlob(1))).e();
                            Object objValueOf3 = Integer.valueOf(i12);
                            c1350e8.put(objValueOf3, c0857o16);
                            str3 = str14;
                            obj2 = objW;
                            obj3 = objValueOf3;
                            r15 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objW = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r10 = r15;
                        map2 = c1350e8;
                    }
                } catch (SQLiteException e35) {
                    e = e35;
                    r17 = obj;
                    r21 = r10;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = c0999mG13.d0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
        } catch (SQLiteException e36) {
            e = e36;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r10;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        C0999m c0999mG16 = q10.g0();
        obj = (C1023u0) c0999mG16.f16104r;
        r10 = this.f17271u;
        c0999mG16.p();
        c0999mG16.o();
        U6.y.c(r10);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            c1023u0 = c1023u5;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z12) {
                String str116 = this.f17271u;
                c0999mG0 = q10.g0();
                str6 = this.f17271u;
                c0999mG0.p();
                c0999mG0.o();
                U6.y.c(str6);
                c1350e3 = new C1350e();
                cursorRawQuery = c0999mG0.d0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c1350e3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c1350e3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c1350e3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r12 = c1350e3;
                U6.y.c(str116);
                c1350e4 = new C1350e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        c0857o3 = (C0857o1) map2.get(num);
                        list4 = (List) r12.get(num);
                        if (list4 != null) {
                        }
                        r18 = r12;
                        it3 = it2;
                        c1023u1 = c1023u5;
                        c1350e4.put(num, c0857o3);
                        r12 = r18;
                        str15 = str15;
                        it2 = it3;
                        c1023u5 = c1023u1;
                    }
                }
                str4 = str15;
                c1023u0 = c1023u5;
                map3 = c1350e4;
            } else {
                str4 = "audience_id";
                c1023u0 = c1023u5;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                c0857o1 = (C0857o1) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c1350e = new C1350e();
                if (c0857o1 != null) {
                    while (r3.hasNext()) {
                        if (c0792b1.p()) {
                            C0857o1 c0857o17 = c0857o1;
                            Integer numValueOf14 = Integer.valueOf(c0792b1.q());
                            if (c0792b1.r()) {
                                lValueOf = Long.valueOf(c0792b1.s());
                            } else {
                                lValueOf = null;
                            }
                            c1350e.put(numValueOf14, lValueOf);
                            c0857o1 = c0857o17;
                        }
                    }
                }
                c0857o2 = c0857o1;
                c1350e2 = new C1350e();
                if (c0857o2 != null) {
                    it = c0857o2.v().iterator();
                    while (it.hasNext()) {
                        c0867q1 = (C0867q1) it.next();
                        if (!c0867q1.p()) {
                        }
                    }
                }
                Map map112 = map5;
                if (c0857o2 != null) {
                    i10 = 0;
                    while (i10 < c0857o2.q() * 64) {
                        if (C0967b0.V((InterfaceC0853n2) c0857o2.p(), i10)) {
                            z13 = zY;
                            c1023u0.b().v().c(num4, Integer.valueOf(i10), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i10);
                            if (C0967b0.V((InterfaceC0853n2) c0857o2.r(), i10)) {
                                bitSet.set(i10);
                            }
                            i10++;
                            zY = z13;
                        } else {
                            z13 = zY;
                        }
                        c1350e.remove(Integer.valueOf(i10));
                        i10++;
                        zY = z13;
                    }
                }
                boolean z110 = zY;
                C0857o1 c0857o18 = (C0857o1) map4.get(num4);
                if (zY2) {
                    while (r2.hasNext()) {
                        int iQ8 = c0866q1.q();
                        Integer num12 = num4;
                        jLongValue = this.f17275y.longValue() / 1000;
                        if (c0866q1.y()) {
                            jLongValue = this.f17274x.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iQ8);
                        if (c1350e.containsKey(numValueOf)) {
                            c1350e.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c1350e2.containsKey(numValueOf)) {
                            c1350e2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f17273w.put(num4, new Y1(this, this.f17271u, c0857o18, bitSet, bitSet2, c1350e, c1350e2));
                map = map;
                zY = z110;
                map4 = map4;
                zY2 = zY2;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r118 = obj2;
        if (!list.isEmpty()) {
            y10 = new Y(this);
            c1350e6 = new C1350e();
            while (r17.hasNext()) {
                c0802d1A = y10.a(c0802d1, this.f17271u);
                if (c0802d1A != null) {
                    rVarU = q10.g0().U(this.f17271u, c0802d1, c0802d1A.s());
                    q10.g0().N("events", rVarU);
                    if (z10) {
                        j = rVarU.f17523c;
                        strS = c0802d1A.s();
                        map8 = (Map) c1350e6.get(strS);
                        if (map8 == null) {
                            C0999m c0999mG17 = q10.g0();
                            C1023u0 c1023u13 = (C1023u0) c0999mG17.f16104r;
                            str11 = this.f17271u;
                            c0999mG17.p();
                            c0999mG17.o();
                            U6.y.c(str11);
                            U6.y.c(strS);
                            c1350e7 = new C1350e();
                            Query = c0999mG17.d0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    C0866q0 c0866q13 = (C0866q0) ((C0861p0) C0967b0.b0(C0866q0.B(), Query.getBlob(1))).e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c1350e7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        c1350e7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(c0866q13);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = c1350e7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            c1350e6.put(strS, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f17272v.contains(num6)) {
                                c1023u0.b().v().b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        y11 = y10;
                                        num3 = num6;
                                        break;
                                    }
                                    C0866q0 c0866q14 = (C0866q0) it8.next();
                                    y11 = y10;
                                    num3 = num6;
                                    map9 = map8;
                                    c0966b2 = new C0966b(this, this.f17271u, iIntValue2, c0866q14, 0);
                                    Long l114 = this.f17274x;
                                    Long l115 = this.f17275y;
                                    iQ = c0866q14.q();
                                    y12 = (Y1) this.f17273w.get(num3);
                                    if (y12 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = y12.f17242d.get(iQ);
                                    }
                                    zA = c0966b2.a(l114, l115, c0802d1A, j, rVarU, z14);
                                    if (!zA) {
                                        this.f17272v.add(num3);
                                        break;
                                    }
                                    t(num3).a(c0966b2);
                                    num6 = num3;
                                    map8 = map9;
                                    y10 = y11;
                                }
                                if (!zA) {
                                    this.f17272v.add(num3);
                                }
                                y10 = y11;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C1350e c1350e15 = new C1350e();
            it4 = list2.iterator();
            o10 = c1350e15;
            while (it4.hasNext()) {
                C0886u1 c0886u6 = (C0886u1) it4.next();
                strR = c0886u6.r();
                map6 = (Map) o10.get(strR);
                if (map6 == null) {
                    C0999m c0999mG18 = q10.g0();
                    c1023u3 = (C1023u0) c0999mG18.f16104r;
                    str9 = this.f17271u;
                    c0999mG18.p();
                    c0999mG18.o();
                    U6.y.c(str9);
                    U6.y.c(strR);
                    c1350e5 = new C1350e();
                    cursorQuery2 = c0999mG18.d0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            C0900x0 c0900x6 = (C0900x0) ((C0895w0) C0967b0.b0(C0900x0.x(), cursorQuery2.getBlob(1))).e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c1350e5.get(numValueOf5);
                            if (list5 == null) {
                                c1023u4 = c1023u3;
                                arrayList3 = new ArrayList();
                                c1350e5.put(numValueOf5, arrayList3);
                            } else {
                                c1023u4 = c1023u3;
                                arrayList3 = list5;
                            }
                            arrayList3.add(c0900x6);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            c1023u3 = c1023u4;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = c1350e5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    o10.put(strR, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                o11 = o10;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f17272v.contains(num2)) {
                        c1023u0.b().v().b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    o12 = o11;
                    while (true) {
                        if (it7.hasNext()) {
                            c0900x0 = (C0900x0) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(c1023u0.b().y(), 2)) {
                                V v17 = c1023u0.b().v();
                                if (c0900x0.p()) {
                                    numValueOf4 = Integer.valueOf(c0900x0.q());
                                } else {
                                    numValueOf4 = null;
                                }
                                v17.d("Evaluating filter. audience, filter, property", num2, numValueOf4, c1023u0.n().c(c0900x0.r()));
                                c1023u0.b().v().b(q10.j0().S(c0900x0), "Filter definition");
                            }
                            if (c0900x0.p()) {
                            }
                            V vT8 = c1023u0.b().t();
                            W w16 = X.w(this.f17271u);
                            if (c0900x0.p()) {
                                numValueOf3 = Integer.valueOf(c0900x0.q());
                            } else {
                                numValueOf3 = null;
                            }
                            vT8.c(w16, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f17272v.add(num2);
                            map6 = map7;
                            o11 = o12;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            o12 = o12;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.f17272v.add(num2);
                        }
                        map6 = map7;
                        o11 = o12;
                        it6 = it6;
                        t(num2).a(c0966b);
                        iIntValue = i11;
                        map6 = map7;
                        o12 = o12;
                        it6 = it6;
                    }
                }
                it4 = it5;
                o10 = o11;
            }
        }
        arrayList2 = new ArrayList();
        C1347b<Integer> c1347b6 = (C1347b) this.f17273w.keySet();
        c1347b6.removeAll(this.f17272v);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            Y1 y19 = (Y1) this.f17273w.get(num7);
            U6.y.f(y19);
            com.google.android.gms.internal.measurement.V0 v0B6 = y19.b(iIntValue8);
            arrayList2.add(v0B6);
            c0999mG1 = q10.g0();
            c1023u2 = (C1023u0) c0999mG1.f16104r;
            str8 = this.f17271u;
            C0857o1 c0857o1R6 = v0B6.r();
            c0999mG1.p();
            c0999mG1.o();
            U6.y.c(str8);
            U6.y.f(c0857o1R6);
            byte[] bArrA6 = c0857o1R6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (c0999mG1.d0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c1023u2.b().s().b(X.w(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final Y1 t(Integer num) {
        if (this.f17273w.containsKey(num)) {
            return (Y1) this.f17273w.get(num);
        }
        Y1 y10 = new Y1(this, this.f17271u);
        this.f17273w.put(num, y10);
        return y10;
    }

    @Override // i7.L1
    public final void r() {
    }
}
