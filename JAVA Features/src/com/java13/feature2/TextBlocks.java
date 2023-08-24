package com.java13.feature2;

public class TextBlocks {

	public static void main(String[] args) {
		
		String json = """
[
    {
        "name": "Jason",
        "gender": "M",
        "age": 27
    },
    {
        "name": "Rosita",
        "gender": "F",
        "age": 23
    },
    {
        "name": "Leo",
        "gender": "M",
        "age": 19
    }
]
				""";
		
		System.out.println(json);
	}
}

