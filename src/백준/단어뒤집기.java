package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 백준 9093번
class 단어뒤집기 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// 받아온 라인의 수
		int line = Integer.parseInt(in.readLine());

		// 라인이 0보다 클때까지 ex)2이면 2번
		while(line-- > 0)
		{
			StringTokenizer st = new StringTokenizer(in.readLine());

			while (st.hasMoreTokens())
			{
				// 단어 하나만 받아서 거꾸로 바꾸는 메소드 사용
				out.write(reverseString(st.nextToken()) + " ");
			}
		}

		out.flush();
		out.close();
		in.close();
	}

	// 단어 뒤집는 메소드
	public static String reverseString(String str)
	{
		// String -> char 배열
		char [] arr = str.toCharArray();

		// 끝과 앞 뒤집기(절반까지만)
		for (int i = 0; i < str.length() / 2; i++)
		{
			char temp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;
		}
		return String.valueOf(arr);
	}
}
