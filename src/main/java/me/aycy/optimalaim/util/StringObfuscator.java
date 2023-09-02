/*    */ package me.aycy.optimalaim.util;
/*    */ 
/*    */ public class StringObfuscator
/*    */ {
/*    */   public static String obfuscate(String str) {
/*  6 */     StringBuilder b = new StringBuilder();
/*  7 */     for (int c = 0; c < str.length(); c++) {
/*  8 */       b.append((char)(str.charAt(c) - c - 1));
/*    */     }
/* 10 */     return b.toString();
/*    */   }
/*    */ }


/* Location:              D:\Code\Java\Decomp\Optimal_Aim_1.1-deobf.jar!\me\aycy\optimalaim\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */